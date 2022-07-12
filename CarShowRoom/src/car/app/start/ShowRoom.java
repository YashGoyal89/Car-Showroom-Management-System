package car.app.start;
import java.util.Scanner;
import car.model.base.Baleno;
import car.model.base.Breeza;
import car.model.base.Celerio;
import car.model.base.Ciaz;
import car.model.base.Ertiga;
import car.model.base.Scross;
import car.model.base.Swift;
import java.io.*;

public class ShowRoom 
{ 
  public static void main(String args[])
  {	int b = 0;  
	try{  
		start();
         login();
         String operation  =Operation();
         switch(operation)
         {
	       case "1" :
			    	   showCarTypes();
			    	   break;
	       case "2" : 
			    	   purchase(b);
			    	   break;
         }
       }
    catch(Exception ex)
   	{
      ex.printStackTrace();
    }
     last();   
  }
        
   public static boolean login()
    {
    	Scanner sc =new Scanner(System.in);
        System.out.println("Enter Username : ");
        String useranme = sc.next();
        System.out.println("Enter Password : ");
        String password = sc.next();
        return true;
       
    }
    
    public static String Operation()
    {
        System.out.println(" Select from below options ");
        System.out.println(" 1.View Car Model");
        System.out.println(" 2.Purchase");
        Scanner sc =new Scanner(System.in);
        String a = sc.next();
        return a;
    }
        
    
    public static void showCarTypes()
    {       
    	String[] Cars={"Breeza","Baleno","Ciaz","S-cross","Ertiga","Swift","Celerio"};
 	    	    
        System.out.println("Please select Car from Available Models ");
             
        for(int i=0 ; i<Cars.length ; i++)
        {        
         System.out.println((i+1)+ ". "+ Cars[i]);
        }        
        System.out.println(" Please select  ");       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        switch(a)
        {
           case 1:
		        	Breeza b = new Breeza();
		            b.showModelDetails();
		            break;
        	
           case 2:
		        	Baleno b1 = new Baleno();
		            b1.showModelDetails();
		            break;
           case 3:
		        	Ciaz c = new Ciaz();
		            c.showModelDetails();
		            break;
   	
           case 4:
		        	Scross s = new Scross();
		            s.showModelDetails();
		            break;
           case 5:
	        	   Ertiga e = new Ertiga();
	        	   e.showModelDetails();
	        	   break;
	
		   case 6:
			      	Swift sw = new Swift();
			        sw.showModelDetails();
			        break; 
		   case 7:
			      	Celerio ce = new Celerio();
			        ce.showModelDetails();
			        break;         
        }

        System.out.println(" *******************************************");
        System.out.println("\n Purchase?: "); 
        String x = sc.next();
        
        switch(x)
        {
            case "yes":
		            	purchase(a);
		            	break;
            case "no":
		            	showCarTypes();
		            	break;
        }
      
    } 
   
    public static void purchase(int x)
    {
    	if(x==1)
    	{
    		Breeza b = new Breeza();
    		b.invoice();
    	}
    	else if(x==2)
    	{
    		Baleno b1 = new Baleno();
    		b1.invoice();
    	}
    	else if(x==3)
    	{
    		Ciaz c = new Ciaz();
    		c.invoice();
    	}
    	else if(x==4)
    	{
    		Scross s = new Scross();
    		s.invoice();
    	}
    	else if(x==5)
    	{
    		 Ertiga e = new Ertiga();
    		 e.invoice();
    	}
    	else if(x==6)
    	{
    		Swift sw = new Swift();
    		sw.invoice();
    	}
    	else 
    	{
    		Celerio ce = new Celerio();
    		ce.invoice();
    	}
    }  
    public static void last()
    {

  	  try{
  		File f=new File("CarExit.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
  		  String strLine;
  		  while ((strLine = br.readLine()) != null)  
  		  {
  			  System.out.println (strLine);
  		  }
  		  fr.close();
  	     }
  	  catch (Exception e)
  	  {
  	  System.err.println("Error: " + e);
  	  }
    }
    
    public static void start()
    {

  	  try{
  		File f=new File("CarStart.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
  		  String strLine;
  		  while ((strLine = br.readLine()) != null)  
  		  {
  			  System.out.println (strLine);
  		  }
  		  fr.close();
  	     }
  	  catch (Exception e)
  	  {
  	  System.err.println("Error: " + e);
  	  }
    }
    
}