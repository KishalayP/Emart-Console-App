package com.Emart;
import java.util.*;


public class Eadministrator extends LoginEmart {
	Scanner scan=new Scanner(System.in);
	 private String adminname="P";
     private String adminpassword="3";
     private int noOfemp;
     private int noOfitems;
  
     static int n=1;
     
	private static ArrayList<Employee> a= new ArrayList<Employee>();
    private static ArrayList<Item> b=new ArrayList<Item>();
    
    
   
    public static ArrayList<Item> getB() {
    	return b;
    }
    
    public static ArrayList<Employee> getA() {
		return a;
	}
	
    public void login(){
 	   System.out.println("PLEASE ENTER THE USERNAME");
		String username=scan.nextLine();
		System.out.println("PLEASE ENTER THE PASSWORD");
		String password=scan.nextLine();
		if(adminname.equals(username)  && adminpassword.equals(password) ) {
			System.out.println("WELCOME ADMIN PLEASE CHOOSE ");
			System.out.println("PLEASE SELECT ANYONE OF THE OPTION GIVEN BELOW");
			System.out.println(
					            "\n Press 1 : TO ADD EMPLOYEE"+
		                        "\n Press 2 : TO VIEW EMPLOYEE DETAILS"+
                                "\n Press 3 : TO ADD ITEMS"+
		                        "\n Press 4 : TO VIEW ITEMS"+
		                        "\n Press 5 : TO FIRE AN EMPLOYEE"+
		                        "\n Press 6 : TO VIEW CUSTOMERS"+
					            "\n Press 7 : EXIT");
			
			boolean adminexit=false;
			
			while(!adminexit) {
				System.out.println("Enter your choice");
				int admincommand=scan.nextInt();	
				switch(admincommand) {
				case 1:
					employeeRecruitment();
					break;
				case 2:
					displayEmployees();
					break;
				case 3:
					addItem(); 
					break;
				case 4:
					displayIventory();
					break;
				case 5:
					fireEmployees();
					break;
				case 6:
					displayCustomer();
					break;
				case 7:
					adminexit=true;
					System.out.println("admin you have logged out!!!");
					break;
					default:
						System.out.println("ADMIN PLEASE ENETER VALID COMMAND");
				}
			}
		
    }
		else {
			System.out.println("INVALID USERNAME OR PASSWORD");
		}
    }
    
    
    public void employeeRecruitment(){
 	   
       System.out.println("Enter the number of employees you want to recruit");
          noOfemp=scan.nextInt();
           for(int i=1;i<=noOfemp;i++){
     
          System.out.println("Enter the name of the employee");
          String name=scan.next();
          System.out.println("Enter the salary alloted");
              int salary=scan.nextInt();
          
          a.add(new Employee(n, name, salary));
          n++;
     }
 }
 public void displayEmployees (){
    if(a.size()>0) { 
 	   for(int i=0;i<a.size();i++){
 		   System.out.println(a.get(i).getId()+
 				   "\nName                 : "+Eadministrator.getA().get(i).getName()+
			           "\nSalary               : "+Eadministrator.getA().get(i).getSalary()+
			           "\nHoliday Remaining    : "+Eadministrator.getA().get(i).getHolidaysremaining()+
			           "\nHolidays Taken       : "+Eadministrator.getA().get(i).getHolidaystaken());

     }
    }
    else if(a.size()<=0) {
 	   System.out.println("THERE ARE NO EMPLOYEES ");
 	   
    }
     
 }
 
 public void fireEmployees(){
     System.out.println("Please enter the id of employee you want to fire");
     int j=scan.nextInt();
     for(int i=0;i <a.size();i++) {
     	if(a.get(i).getId()==j) {
     	 a.remove(i);
     	}
     	else {
     		System.out.println("Enter the valid id");
     	}
     }
     
 }
 

     
public void addItem() {
	System.out.println("Enter the number of items you want to add");
    noOfitems=scan.nextInt();
     for(int i=1;i<=noOfitems;i++){

    System.out.println("Enter the name of item");
    String name=scan.next();
    System.out.println("Enter the quantity of the item");
    int quantity=scan.nextInt();
    System.out.println("Enter the price");
        int price=scan.nextInt();
        System.out.println("Enter the itemtype");
        String ittype=scan.next();
        
    b.add(new Item((long)Math.round(Math.random()*1000),name,quantity,price,ittype));
	
}
   
}

public void displayIventory(){
	 if(b.size()>0) { 
	 	   for(int i=0;i<b.size();i++){
	 		   System.out.println("\nItem id               :   "+getB().get(i).itemid+
	 				              "\nItem Name             :   "+getB().get(i).itemname+
				                  "\nItem Price            :   "+getB().get(i).itemprice+
				                  "\nItem quantity         :   "+getB().get(i).itemquantity+
				                  "\nItem type             :   "+getB().get(i).itemtype);

	     }
	    }
	    else if(a.size()<=0) {
	 	   System.out.println("THERE ARE NO EMPLOYEES ");
	 	   
	    }
	 
 }


public void displayCustomer() {
	if(CompanyLogin.getC().size()>0) { 
	 	   for(int i=0;i<CompanyLogin.getC().size();i++){
	 		   System.out.println("\nCustomer id               :   "+CompanyLogin.getC().get(i).getCustid()+
	 				              "\nCustomer Name             :   "+CompanyLogin.getC().get(i).getCustName()+
	 				              "\nCustomer PurchasePoints   :   "+CompanyLogin.getC().get(i).getPurchasepoints()                                                                            );
	     }
	    }
	    else if(a.size()<=0) {
	 	   System.out.println("THERE ARE NO Customers");
	 	   
	    }
	
	
}
public void generatebill() {
	
}
 

}
