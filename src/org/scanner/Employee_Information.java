package org.scanner;

import java.util.Scanner;

public class Employee_Information {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("empId");
	short s1 = sc.nextShort();
	System.out.println(s1);
	
	System.out.println("name");
	String s = sc.next();
	System.out.println(s);
	
	System.out.println("email");
	String s2 = sc.next();
	System.out.println(s2);
	
	System.out.println("phoneNum");
	long l = sc.nextLong();
	System.out.println(l);
	
	System.out.println("salary");
	int i = sc.nextInt();
	System.out.println(i);
	
	System.out.println("gender");
	String s3 = sc.next();
	System.out.println(s3);
	
	System.out.println("city");
	String s4 = sc.next();
	System.out.println(s4);	
	sc.close();
	}

}



