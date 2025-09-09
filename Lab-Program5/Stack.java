package stack;
public class Stack {
	private Person arr[];
	private int top;
	private int capacity;
	Stack(int size) {
	   capacity = size;
	   arr = new Person[size];
	 


	   top = -1;
	}
	Stack(Person[] inputArr) {
	   capacity = inputArr.length;
	   arr = new Person[capacity];
	   for (int i = 0; i < capacity; i++) {
	       arr[i] = inputArr[i];
	   }
	   top = capacity - 1;
	}
	void push(Person p) {
	   if (top == capacity - 1) {
	       System.out.println("Stack Overflow");
	       return;
	   }
	   arr[++top] = p;
	}
	void push(Person p1, Person p2) {
	   push(p1);
	   push(p2);
	}
	Person pop() {
	   if (top == -1) {
	       System.out.println("Stack Underflow");
	       return null;
	   }
	   return arr[top--];
	}

	void pop(int n) {
	   for (int i = 0; i < n; i++) {
	       Person p = pop();
	       if (p != null) {
	           System.out.print("Popped: ");
	           p.displayPerson();
	       } else break;
	  }
	}
	void display() {
	   if (top == -1) {
	       System.out.println("Stack is empty.");
	       return;
	   }
	   System.out.println("Stack contents (top to bottom):");
	   for (int i = top; i >= 0; i--) {
	       arr[i].displayPerson();
	   }
	}
	void display(int n) {
	   if (top == -1) {
	       System.out.println("Stack is empty.");
	       return;
	   }
	   System.out.println("Top " + n + " Persons:");
	   for (int i = top; i >= 0 && n > 0; i--, n--) {
	       arr[i].displayPerson();
	   }
	}
}
