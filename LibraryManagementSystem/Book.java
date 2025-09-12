package library_management_system;

public class Book implements Issueable{
	
		 String title;
	     String author;
	     String ISBN;
	     boolean available;

	    public Book(String title, String author, String ISBN) {
	        this.title = title;
	        this.author = author;
	        this.ISBN = ISBN;
	        this.available = true;
	    }

	    

	    // Show details about the book
	    public void displayBookInfo() {
	        System.out.println(" Title: " + title + ",  Author: " + author + ",  ISBN: " + ISBN + ", Available:" + available);
	    }
	    @Override
	    public void issuebook() {
	        if (available) {
	            available = false;
	            System.out.println(title + " has been issued.");
	        } else {
	            System.out.println(title + " is currently not available.");
	        }
	    }

	    @Override
	    public void returnBook() {
	        available = true;
	        System.out.println(title + " has been returned.");
	    }

	    @Override
	    public boolean isAvailable() {
	        return available;
	    }
	}
	    



