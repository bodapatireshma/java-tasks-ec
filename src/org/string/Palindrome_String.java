package org.string;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		//check "madam" text
		
			String reverse = "";
		System.out.println("Enter the Text");	
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		
	for (int i = original.length()-1;i >=0; i--) {
		reverse=reverse+original.charAt(i);
	
	}
	if (original.equals(reverse)) {
		System.out.println("Yes,it is a Palindrome");
	} else {
		System.out.println("Not a palindrome");
	}sc.close();
	}
	}