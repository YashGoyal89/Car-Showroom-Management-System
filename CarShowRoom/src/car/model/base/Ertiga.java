package car.model.base;
import java.util.Scanner;
public class Ertiga extends Car
{ 
	String a,b,c;
   public Ertiga()
   {        
	    setCompanyName("Maruti Suzuki"); 
	    setCategory("MUV");
	    setMileage("19.01 km/l");
	    setModelName("Ertiga");
	    setModelYear("2021");;
	    setNoOfSeats("7");
	    setEngineCC("1462cc");
	    setPrice("15.5 lakh");
	    setColor("WHITE");
   }
   public  void showModelDetails()
   {
           	System.out.println("--------------------------");
            System.out.println("\\\\\\"+getModelName()+"//////");
            System.out.println("--------------------------");
            
            System.out.print("\nCompany Name :: "+    getCompanyName());
            System.out.print("\nCar Category :: "+    getCategory());
            System.out.print("\nModel Name   :: "+    getModelName());
            System.out.print("\nModel Year   :: "+    getModelYear());
            System.out.print("\nMileage      :: "+    getMileage());
            System.out.print("\nNo. of Seats :: "+    getNoOfSeats());
            System.out.print("\nEngine CC    :: "+    getEngineCC());
            System.out.print("\nColor        :: "+    getColor());
            System.out.print("\nPRICE        :: "+    getPrice());
   }
   public void invoice()
   {
	   Scanner sc = new Scanner(System.in);
       System.out.println("Customer Name:");
       a = sc.next();
       System.out.println("Customer ID:");
       b = sc.next();
       System.out.println("Customer Address:");
       c = sc.next();
       System.out.println("\n");
       System.out.println("|~|~| TAX-INVOICE |~|~|");
       System.out.println("Buyer Name:"+a);
       System.out.println("Buyer ID:"+b);
       System.out.println("Buyer Address:"+c);
       System.out.println("Car Model:"+getModelName());
       System.out.println("On-Road Price:"+getPrice());
   } 
}


























