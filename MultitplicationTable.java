package com.kn.forloop;

import java.util.Scanner;

public class MultitplicationTable {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
		MultitplicationTableDemo mt=new MultitplicationTableDemo();
		mt.multiplicationTable(num);
		scan.close();
	}

}
