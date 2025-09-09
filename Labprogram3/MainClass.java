package transport;
public class MainClass {
        public static void main(String[]args) {
           Ebike E=new Ebike("EB-101",50);
           E.deliver(" Pizza "," Library ");
           Drone D=new Drone("Drone=1");
           D.deliver("notes"," ExamCell");
           D.deliver( " USB"," ISE block");
           double bill=D.cost(5);
           System.out.println("Drone delivery charge Rs"+bill);
       }
   }
