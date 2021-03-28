package com.Emart;

import java.util.Scanner;
import java.util.*;
public class Employee extends LoginEmart {
	Scanner in=new Scanner(System.in); 
	private int id;
      private String name;
      private int salary;
      private int holidaystaken;
      private int hreq;
      private int holidaysremaining=10;
      final static int holidaysallowed=10;
      private static ArrayList<Bill>regular=new ArrayList<Bill>();
      private static ArrayList<Bill>normal=new ArrayList<Bill>();
      static float discount =0.01f;
      String reply;
      public int getHreq() {
		return hreq;
	}
	public void setHreq(int hreq) {
		this.hreq = hreq;
	}

	
     
      public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getHolidaystaken() {
		return holidaystaken;
	}
	public void setHolidaystaken(int n) {
		this.holidaystaken=n+getHreq();
		
	}
	
	public int getHolidaysremaining() {
		return holidaysremaining;
	}
	public void setHolidaysremaining(int n) {
		this.holidaysremaining=holidaysremaining-getHolidaystaken();
		
	}
	
	public int getHolidaysallowed() {
		return holidaysallowed;
	}
	public Employee() {
    	  
      }
    public Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.holidaystaken=0;
        this.holidaysremaining=10;
        
    }


	
	
	public void viewMydetails() {
		System.out.println("PLEASE ENTER THE USERNAME");
   		name=in.nextLine();
   		System.out.println("PLEASE ENTER THE PASSWORD");
   		id=in.nextInt();
	  
		if(id==Eadministrator.getA().get(id-1).id&&name==Eadministrator.getA().get(id-1).name) {
			   System.out.println("WELCOME "+Eadministrator.getA().get(id-1).name);
			   System.out.println( "\n Press 1 : TO VIEW YOUR DETAILS"+
                                   "\n Press 2 : EXIT");
 
			                                                        
			
		}
		else {
			System.out.println("INVALID USERNAME or ID");
		}
		
	}

	
	public void loginEmart () {
	
		System.out.println("Enter your name");
		String username=in.nextLine();
		System.out.println("Enter your id");
		int id=in.nextInt();
	 
		for(int i=0;i<Eadministrator.getA().size();i++) {
		if(id==Eadministrator.getA().get(i).id&&username.equals(Eadministrator.getA().get(i).name)) {
		    System.out.println("WELCOME"+" "+Eadministrator.getA().get(i).name);
		    System.out.println("PLEASE SELECT ANYONE OF THE OPTION GIVEN BELOW");
   			System.out.println("\n PRESS 1 : TO SEE YOUR DETAILS"+
		                       "\n PRESS 2 : TO APPLY FOR HOLIDAY"+
   					           "\n PRESS 3 : To generate bill"+
   					           "\n PRESS 4: EXIT ");
	
			
			boolean empexit=false;
			
			while(!empexit) {
				System.out.println("Enter your choice");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				int empcommand=in.nextInt();
				switch(empcommand) {
				case 1:
					viewempdetails();
					break;
				case 2:
					requestleave(Eadministrator.getA().get(i));
					break;
				case 3:
					Generatebill();
					break;
				case 4:
				empexit=true;
					break;
				
					default:
						System.out.println( "PLEASE ENETER VALID COMMAND");
				}
			}
   		
   					           
		}
		else {
			System.out.println("Invalid id or username");
		}
		}
			 
	         	
	}
     public void requestleave(Employee a) {
     System.out.println("Please enter the number of holidays that you would like to take");
     int hols=in.nextInt();
     String s="yes";
     String n="no";
     
	
	if ( Eadministrator.getA().get(id).getHolidaysremaining()==0) {
		System.out.println("You don't have sufficient holidays remaing");
		System.out.println("But if you still want to take a holiday amount of Rs 1000 will be deducted");
		System.out.println("\n Type yes if you want to continue with request"+
		                   "\n Type no if you want to discontinue with request");
		 reply=in.nextLine();

		
		
	} 
	else {
		System.out.println("Requested for " + hols + "days");
		setHreq(hols);
		setHolidaystaken(getHreq());
		Eadministrator.getA().get(id).setHolidaystaken(getHreq());		
		Eadministrator.getA().get(id).setHolidaysremaining(getHolidaystaken());

	}
	
	

}
      public void viewempdetails(){
	System.out.println("\nName                 : "+Eadministrator.getA().get(id).name+
			           "\nSalary               : "+Eadministrator.getA().get(id).salary+
			           "\nHoliday Remaining    : "+Eadministrator.getA().get(id).getHolidaysremaining()+
			           "\nHolidays Taken       : "+Eadministrator.getA().get(id).getHolidaystaken());
       }
               
      public int deductsalary(Employee a) {
	         final int deductsalary=1000;
	         salary=salary-deductsalary;
    	  return salary;
    	  
    	  
    	  
           }
      @SuppressWarnings("deprecation")
	public void Generatebill() {
    	  Date a=new Date();
    	 if(Customer.getO().size()>0) {
    	  for(int i=0;i<Customer.getO().size();i++) {
    		  for(int j=0;j<CompanyLogin.getC().size();j++) {
    		  if(Customer.getO().get(i).getOrdercustid()==CompanyLogin.getC().get(j).getCustid())
    	  if(CompanyLogin.getC().get(j).getPurchasepoints()>=3) {
    	  regular.add(new Bill(a.getDate(),a.getMonth(),a.getYear(),Customer.getO().get(i).getOrdercustid(),Customer.getO().get(i).getOrdercustname(),discount,Customer.getO().get(i).getOrderId(),discountpriced(Customer.getO().get(i ).getOrderedprice())));
    	    System.out.println("Bill generated for prime customers");
    	  }
    	  else {
    		  normal.add(new Bill(a.getDate(),a.getMonth(),a.getYear(),Customer.getO().get(i).getOrdercustid(),Customer.getO().get(i).getOrdercustname(),Customer.getO().get(i).getOrderId(),Customer.getO().get(i).getOrderedprice()));
    	  System.out.println("Bill generated for normal customers");
    	  }
    	  }
    	  }
    	 }
    	 else {
    		 System.out.println("There are no orders yet!!!");
    	 }
    	  }
      
      public int discountpriced(int cash) {
    	  int discountedprice=(int) (discount*Customer.getO().get(1).getOrderedprice());
    	  return discountedprice;
      }
	public static ArrayList<Bill> getRegular() {
		return regular;
	}
	public static void setRegular(ArrayList<Bill> regular) {
		Employee.regular = regular;
	}
	public static ArrayList<Bill> getNormal() {
		return normal;
	}
	public static void setNormal(ArrayList<Bill> normal) {
		Employee.normal = normal;
	}
	
}
