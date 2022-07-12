package car.model.base;
import java.util.Scanner;
public class Scross extends Car
{   
	String a,b,c;
   public Scross()
   {        
	    setCompanyName("Maruti Suzuki"); 
	    setCategory("SUV");
	    setMileage("19 km/l");
	    setModelName("S-Cross");
	    setModelYear("2021");;
	    setNoOfSeats("5");
	    setEngineCC("1462 cc");
	    setPrice("13.4 lakh");
	    setColor("BROWN");
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

























