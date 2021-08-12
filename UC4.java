package com.Regex.java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UC4 {
		// validating phone number
			public void phoneNumber(String str) {
				int flag = 0;
				Pattern pattern = Pattern.compile("^(\\+)?([ 0-9]){10,16}$");
				Matcher matcher = pattern.matcher(str);
				while (matcher.find()) {
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("valid phone number");
				} else {
					System.out.println("invalid phone number");
				}

			}
public static void main(String[] args) {
	

			UC4 uc4=new UC4();
			uc4.phoneNumber("91 9515744042");
			}
		
}
