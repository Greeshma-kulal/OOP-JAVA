package studentlogger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This is the shared resource. An instance of this class will be
 * shared by multiple threads.
 *
 * It manages the file handle and ensures that all writes are "thread-safe".
 */
public class ResultFileWriter {

    private final String outputFilePath;
    private final PrintWriter filePrintWriter;

    /**
     * Opens the target file for writing.
     * @param filePath The path to the CSV file (e.g., "results.csv").
     * @param writeHeader If true, it will add a "header" row if the file is new.
     * @throws IOException If the file cannot be opened.
     */
    public ResultFileWriter(String filePath, boolean writeHeader) throws IOException {
    	// TODO Auto-generated constructor stub
        this.outputFilePath = filePath;
        File file = new File(this.outputFilePath);

        // Check if the file is brand new or empty.
        boolean isNewFile = !file.exists() || file.length() == 0;

        // We use 'true' here to open the file in APPEND mode.
        // This means we add to the end of the file, not overwrite it.
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        this.filePrintWriter = new PrintWriter(bw);

        // If it's a new file, add the CSV header for readability.
        if (writeHeader && isNewFile) {
            this.filePrintWriter.println("StudentID,StudentName,Score");
        }
    }

    /**
     * Writes a single ExamRecord to the file.
     *
     * This is the MOST IMPORTANT method in the project.
     * The "synchronized" keyword is a lock. It ensures that only ONE thread
     * can be inside this method at any given time.
     *
     * Without "synchronized", two threads might try to write at the
     * exact same time, resulting in a "race condition" where the file
     * lines get mixed up or corrupted (e.g., "1001,Alice,852002,Bob,91").
     *
     * @param record The record to write to the file.
     */
    public synchronized void writeRecord(ExamRecord record) {
        filePrintWriter.println(record.asCsvRow());
    }

    /**
     * Closes the file writer to ensure all data is flushed from memory
     * to the disk. This MUST be called after all threads are finished.
     */
    public void close() {
        // This also automatically flushes the buffer.
        filePrintWriter.close();
    }
}
