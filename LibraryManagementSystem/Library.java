package library_management_system;

public class Library {
	 Book[] books;
	 int  CurrentBookCount;       // number of books currently in library
	  

	    public Library(int capacity) {
	    	 books = new Book[capacity];
	         CurrentBookCount = 0;
	    }

	    //To  add a book
	    public void addBook(Book book) {
	    	if (CurrentBookCount < books.length) {
	            books[CurrentBookCount] = book;
	            CurrentBookCount++;
	            System.out.println(book.title + " added to the library.");
	        } 
	    	else
	    	{
	            System.out.println("Library is full. Cannot add more books.");
	        }
	    }
	    public void borrowBook(String ISBN) {
	        for (int i = 0; i < CurrentBookCount; i++) {
	            if (books[i].ISBN.equals(ISBN)) {
	                books[i].issuebook(); 
	                return;
	            }
	        }
	        System.out.println("Book with ISBN " + ISBN + " not found.");
	    }

	    // Return a book by ISBN
	    public void returnBook(String ISBN) {
	        for (int i = 0; i < CurrentBookCount; i++) {
	            if (books[i].ISBN.equals(ISBN)) {
	                books[i].returnBook(); // Call book’s return method
	                return;
	            }
	        }
	        System.out.println("Book with ISBN " + ISBN + " not found.");
	    }

	    // Display all books
	    public void displayBooks() {
	        if (CurrentBookCount == 0) {
	            System.out.println("No books in the library.");
	            return;
	        }
	        for (int i = 0; i < CurrentBookCount; i++) {
	            books[i].displayBookInfo();
	        }
	    }
	}
