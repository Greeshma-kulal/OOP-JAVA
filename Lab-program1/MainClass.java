package code1;

public class MainClass {

public static void main(String[] args)
{
	
	 Employee e1=new Employee ("John",1,10000.0d);
	 Employee e2=new Employee("Arun",2,20000.0d);
	//display initial details
	 System.out.println("Initial employee details");
	 e1.details();
	 e2.details();
	 //increase salary
	
	 e1.increaseSalary(10.0d);
	  e2.increaseSalary(20.0d);
	 //display updated details
	 e1.details();
	 e2.details(); 
	 
	//initialization of th eobjects
	 Employee[] array=new Employee[10];
	 array[0]=new Employee("Seema",3,25000.0d);
	 //Display all Employees
	 for(int i=0;i<array.length;i++)
	 {
		 array[i].details();
		 if(array[i].name.compareTo("Seema")==0)
		 {
			 System.out.println("Employee Found");
		 }
	 }
			
}
}