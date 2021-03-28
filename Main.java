package com.Emart;
import java.util.*;


public class Main  {
 static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginEmart.loginset();
	int loginsetter=0;
	
	boolean mainexit=false;
	while(!mainexit) {
		loginsetter=scan.nextInt();
		switch(loginsetter) {
		case 0:
			LoginEmart.loginset();
			break;
		case 1:
			CompanyLogin.LoginOption();
			
			 break;
		case 2:
			CompanyLogin.newCustoptions();
			break;
		case 3:
			mainexit=true;
			System.out.println("You have exited the EmartApp!!!");
			break;
			default:
				System.out.println("User Please enter the valid inputs");
		}
	}
}
}