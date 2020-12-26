package com.akash;

public class Q1 {

	public static String
	String(String str) 
	{
		String s =  str.substring(str.length()-1);
        return s + str + s;
	}
	
	public static void main(String[] args) {
		

		 String str = "cat"; 
		 String str1 = "Helllo";
		 String str2 = "a";
		 
		 System.out.println(String(str)); 
		 System.out.println(String(str1)); 
		 System.out.println(String(str2)); 
	}
	
}
