package com.tnsif.scannerclass;

import java.util.Scanner;

public class Scannerexample {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your roll number");
		int roll=sc.nextInt();
	}

}
