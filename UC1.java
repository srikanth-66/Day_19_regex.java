package com.Regex.java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class UC1 
{
	//Validating First name
	public  void firstName(String name)
	{
		int count=0;

		Pattern p=Pattern.compile("^[A-Z]{3}$");
		Matcher m=p.matcher(name);
		while (m.find())
		{
			count= 1;
		}
		if (count == 1) {
			System.out.println("valid First Name");
		} else {
			System.out.println("invalid First Name");
		}
		
	}
	public static void main(String[] args) 
	{
		UC1 uc=new UC1();
		//uc.firstName("Abc");//invalid FirstName
		uc.firstName("ABC");
		
	}

}
