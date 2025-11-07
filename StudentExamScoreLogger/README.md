# Student Exam Score Logger (Multi-Threaded & Thread-Safe)

This project simulates multiple students submitting their exam marks at the same time using multithreading. All threads write to the same CSV file. To prevent race conditions and corrupted data, the file-writing operation is synchronized.

## Features
• Multiple threads submitting exam records simultaneously  
• Thread-safe file writing using a synchronized method  
• Records stored in CSV format  
• JUnit test cases verifying correct writing and thread completion  

## Project Structure
studentlogger/
 ├─ ExamRecord.java          (Represents a student's score record)
 ├─ ResultFileWriter.java    (Synchronized CSV writer shared by all threads)
 ├─ SubmissionTask.java      (Thread job processing a list of records)
 ├─ SimulationDriver.java    (Main program that starts the threads)
 └─ ResultFileWriterTest.java (JUnit test cases for verification)

## How It Works
1. SimulationDriver creates one shared ResultFileWriter.
2. Three threads (SubmissionTask objects) are created, each with its own list of ExamRecord objects.
3. All threads call writer.writeRecord(), which is synchronized to avoid concurrent write conflicts.
4. The final output is written to exam_results.csv.

## Run Program
javac studentlogger/*.java
java studentlogger.SimulationDriver

The file exam_results.csv will be created automatically.

## Run Tests
mvn test
(or) Run ResultFileWriterTest through your IDE

Expected: All tests should pass with no duplicate or corrupted lines.

## Thread Safety Used
The method below ensures only one thread writes at a time:
public synchronized void writeRecord(ExamRecord record)



## Requirements Covered
✔ Multi-threading  
✔ Thread-safe file access  
✔ CSV output  
✔ JUnit testing  
✔ GitHub ready 

