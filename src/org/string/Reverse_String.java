package org.string;

public class Reverse_String {
	
	public static void main(String[] args) {
		
	//method 1
	 String s = "Hello";
	
	 char[] c = s.toCharArray();
	 int length = c.length;
	 
	 //System.out.println("String length is:"+length);
	 
	 for (int i = length-1; i >=0; i--) {
		System.out.print(c[i]);
		//System.out.print(c[i]+" ");
		 	 
	}
	}
}
