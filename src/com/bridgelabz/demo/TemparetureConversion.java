package com.bridgelabz.demo;
import java.util.Scanner;
public class TemparetureConversion
{
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
	  boolean flag=true;
	  String in;
	  System.out.println("Enter the tempareture which do you want to convert into celsius to fahrenheit");
	  in=sc.next();
	  while(flag)
	  {
		  if(Utility.isNumber(in))
		  {
			  flag=false;
		  }
		  else
		  {
			  System.out.println("Enter the Correct type of tempareture");
			  in=sc.next();
		  }
	  } 
		  double temp=Double.parseDouble(in);
		  System.out.println("Fahrenheit Temp:"+Utility.celsiusToFahrenheit(temp));
		  
		  boolean flag1=true;
		  String in1;
		  System.out.println("Enter the tempareture which do you want to convert into fahrenheit to celsius");
		  in1=sc.next();
		  while(flag1)
		  {
			  if(Utility.isNumber(in1))
			  {
				  flag1=false;
			  }
			  else
			  {
				  System.out.println("Enter the Correct type of tempareture");
				  in1=sc.next();
			  }
		  } 
			  double temp1=Double.parseDouble(in1);
			  System.out.println("ceslsius Temp:"+Utility.fahrenheitToCelsius(temp1));
	  }
  }
