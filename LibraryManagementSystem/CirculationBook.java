package library_management_system;

public class CirculationBook extends Book {
String subject;
	
	public CirculationBook(String title, String author, String ISBN, String subject) {
		// TODO Auto-generated constructor stub
        super(title, author, ISBN); // Call base class constructor
        this.subject = subject;
    }

    // Override display method to include subject
    @Override
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN +
        		 ", Subject: " + subject +", Available: " + isAvailable());
    }

}



