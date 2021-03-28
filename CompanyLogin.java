package com.Emart;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyLogin {
	static Scanner com=new Scanner(System.in);
	private static ArrayList<Customer>c=new ArrayList<Customer>();
	
	public static ArrayList<Customer> getC() {
		return c;
	}
	
public static void LoginOption() {
		
	                             
	    System.out.println("SELECT ANYONE OF THE LOGIN PROCEDURE");
		System.out.println(
				            "\n Press 1 : ADMINISRATOR LOGIN"+
				            "\n Press 2 : EMPLOYEE LOGIN"+
				            "\n Press 3 : Exit");
		
		int companysetter=0;
		boolean companyexit=false;
		while(!companyexit) {
			companysetter=com.nextInt();
			switch(companysetter) {
			
			case 1:
				Eadministrator zz=new Eadministrator();
				zz.login();
				break;
			case 2:
				Employee hh=new Employee();
				hh.loginEmart();
				break;
			case 3:
				companyexit=true;
				System.out.println("You have exited company login!!!!");
				break;
			
				default:
					System.out.println("User Please enter the valid inputs");
		
			}

		}
		}
public static void custregister() {
	System.out.println("Enter name ");
	String name=com.next();
	System.out.println("Enter your email");
	String mail=com.next();
	System.out.println("Enter your password");
	String password=com.next();
	c.add(new Customer((long)Math.round(Math.random()*100000),name,mail,password));
}

public static void newCustoptions() {
	 System.out.println("\n Press 1: Register"+
                       "\n Press 2: Login"+
			            "\n Press 3: exit");
	 int custsetter=0;
		boolean custexit=false;
		while(!custexit) {
			custsetter=com.nextInt();
			switch(custsetter) {
			
			case 1:
				custregister();
				break;
			case 2:
				Customer gg=new Customer();
				gg.loginEmart();
				break;
			case 3:
				custexit=true;
				System.out.println("You have exited customer login!!!!");
				break;
			
				default:
					System.out.println("User Please enter the valid inputs");
		
			}

		}
                                          
}

}
