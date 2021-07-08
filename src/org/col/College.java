package org.col;

import org.stu.Student;

public class College extends Student {

	public void collegeName() {
		System.out.println("College Name");

	}public static void main(String[] args) {
		College col = new College();
			col.collegeName();
			col.stuId();
			col.stuName();
			col.stuDept();
			col.stfId();
			col.stfName();
			col.stfDept();
	}
}
