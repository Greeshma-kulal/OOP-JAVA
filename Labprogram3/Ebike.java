package transport;
public class Ebike extends Bicycle
{
    private int battery;
	public Ebike(String id, int battery){
	      super (id);
	      this.battery=battery;
	      System.out.println("Ebike() constructor is called");
	}
	@Override
	public void deliver(String item, String place) {
		System.out.println("checking battery"+battery+"%");
		super.deliver(item, place);
	}
}
