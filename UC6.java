package com.Regex.java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC6
{
		// validating password
					public void password(String str) {
						int flag = 0;
						Pattern pattern = Pattern.compile("^[A-Z]{1,1}[a-zA-Z0-9]{7}");
						Matcher matcher = pattern.matcher(str);
						while (matcher.find()) {
							flag = 1;
						}
						if (flag == 1) {
							System.out.println("valid password");
						} else {
							System.out.println("invalid password");
						}

					}
public static void main(String[] args) 
	{
		UC6 uc6=new UC6();
		uc6.password("Srikanth123.");
			
		}
	}


