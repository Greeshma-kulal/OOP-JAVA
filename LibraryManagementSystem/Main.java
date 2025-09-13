package library_management_system;



import java.util.Scanner;

//Main class to run the library system
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library Library = new Library(1000); // max 1000 books
       

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add a book");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Show all books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            
                switch (choice) {
                    case 1:
                        System.out.print("Enter the Title of the book: ");
                        String title = sc.nextLine();
                        System.out.print("Author: ");
                        String author = sc.nextLine();
                        System.out.print("ISBN: ");
                        String ISBN = sc.nextLine();
                        System.out.print("Is this a reference book? (yes/no): ");
                        String ref = sc.nextLine();
                        if (ref.equalsIgnoreCase("yes")) {
                            System.out.print("Enter Subject: ");
                            String subject = sc.nextLine();
                            Library.addBook(new CirculationBook(title, author, ISBN, subject));
                        } else {
                            Library.addBook(new Book(title, author, ISBN));
                        }
                        break;

                    case 2:
                       
                        System.out.print("Enter ISBN to borrow: ");
                        Library.borrowBook(sc.nextLine());
                        break;

                    case 3:
                        
                        System.out.print("Enter ISBN to return: ");
                        Library.returnBook(sc.nextLine());
                        break;

                    case 4:
                        
                        Library.displayBooks();
                        break;

                    case 5:
                        
                        System.out.println("Exiting..!!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
	}
