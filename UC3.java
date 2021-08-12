package com.Regex.java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3
{
	// validating email
	public void email(String str) {
		int flag = 0;
		Pattern pattern = Pattern.compile("^abc.[A-Za-z]+@bl.co");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			flag = 1;
		}
		if (flag == 1) {
			System.out.println("valid email");
		} else {
			System.out.println("invalid email");
		}

	}
	public static void main(String[] args) 
	{
		UC3 uc=new UC3();
		uc.email("abc.xyz@bl.com");
		
	}

	

}
