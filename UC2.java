package com.Regex.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC2 
{
	//Validating Last name
		public  void lastName(String name)
		{
			int count=0;

			Pattern p=Pattern.compile("^[A-Za-z]{12}$");
			Matcher m=p.matcher(name);
			while (m.find())
			{
				count= 1;
			}
			if (count == 1) {
				System.out.println("valid last Name");
			} else {
				System.out.println("invalid last Name");
			}
			
		}
		public static void main(String[] args) 
		{
			UC2 uc=new UC2();
			uc.lastName("Midathapalli");
			
		}



}
