package code1;

public class Employee {

	//data members
	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void details()
	{
		System.out.println("Employee ID:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary"+salary);
	}
	void increaseSalary(double percentage)
	{
salary += (salary * percentage)/100.0d;


}
}


