package com.Regex.java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC9 {
			// validating password
			public void password(String str) {
				int flag = 0;
				Pattern pattern = Pattern.compile("^([A-Z]{1,1}[0-9]{1}[_?&*$#@]{1}[a-zA-Z]{6})");
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
			public static void main(String[] args) {
				UC9 uc9=new UC9();
				uc9.password("A0*aaaaaa");
			}

}
