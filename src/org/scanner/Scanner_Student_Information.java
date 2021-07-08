package org.scanner;

import java.util.Scanner;

public class Scanner_Student_Information {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("studId");
		int Id = scan.nextInt();
		System.out.println(Id);
		
		System.out.println("studName");
		String Name = scan.next();
		System.out.println(Name);
		
		System.out.println("Enter the marks");
		int m1 = scan.nextInt();
		int m2 = scan.nextInt();
		int m3 = scan.nextInt();
		int m4 = scan.nextInt();
		int m5 = scan.nextInt();
		int m = m1+m2+m3+m4+m5;
		
		System.out.println("Sum="+m);
		System.out.println("Average="+m/5);
		
		scan.close();	
	}
}
