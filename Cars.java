package lab2;
public class Cars {
	private String brand;
	private String model;
	private double price;
	private double milage;
	private String ownerName;
	
	private static int totalcars;
	private static String showroomname = "CityMotor";
	public Cars(String b, String m, double p, double mil)
		{
			brand=b;
			model=m;
			price=p;
			milage=mil;
			ownerName = "Not assigned";
			totalcars++;
			
		}
	public Cars(String b, String m, double p, double mil, String owner) {
		this.brand=b;
		this.model=m;
		this.price=p;
		this.milage=mil;
		this.ownerName=owner;
		totalcars++;
		
	}
	public String getownerName()
	{
		return ownerName;
	}
	public void setownerName(String ownerNmae)
	{
		ownerName="owner";
	}
	public void displaydetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Price:"+price);
		System.out.println("Milage:"+milage);
		System.out.println("Owner:"+ownerName);
		
	}
	public void updatePrice(double newPrice) {
        price = newPrice;
    }
	public static void showtotalcars()
	{
		System.out.println("Totalcars:"+totalcars);
	}
	public static void showShowroomName()
	{
		System.out.println("Showroom:"+showroomname);
	}

	}






