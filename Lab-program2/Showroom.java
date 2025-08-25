package lab2;

public class Showroom {
	public static void main(String[] args)
	{
		Cars c1=new Cars("Toyota","corolla",1550000.00,18.5);
		Cars c2=new Cars("Honda","Civic",3200000,16.0);
		Cars c3 = new Cars("Hyundai", "i20", 12000, 20.0);
		c1.displaydetails();
        c2.displaydetails();
        c3.displaydetails();
        c1.setownerName("Alice");  // using setter
        c1.updatePrice(16000);

        System.out.println("After Updates:");
        c1.displaydetails();

        Cars.showShowroomName();
        Cars.showtotalcars();
	}

}

