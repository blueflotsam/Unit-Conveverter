package com.revature.Cory;

import java.util.Scanner;

public class UnitConverter {
	public static void printMenu() {
		System.out.println("Please select an option\n"
						+ "1. Cups to Teaspoons\n"
						+ "2. Miles to Kilometers\n"
						+ "3. US Gallons to Imperial Gallons\n"
						+ "4. Quit");
	}
	
	public static void main(String []args) {
		int menuSelection=-1;
		Scanner scrn=new Scanner(System.in);
		double input=0;
		while(menuSelection!=4) {
			printMenu();
			while(!scrn.hasNextInt()) {
				scrn.next();
			}
			menuSelection=scrn.nextInt();
			switch(menuSelection) {
			case 1:
				System.out.println("Enter how many cups you have:");
				while(!scrn.hasNextDouble()) {
					scrn.next();
				}
				input=scrn.nextDouble();
				System.out.println("You have " + input*48 + " teaspoons");
				break;
			case 2:
				System.out.println("Enter how many miles you have:");
				while(!scrn.hasNextDouble()) {
					scrn.next();
				}
				input=scrn.nextDouble();
				System.out.println("You have " + input*1.609 + " kilometers");
				break;
			case 3:
				System.out.println("Enter how many US Gallons you have:");
				while(!scrn.hasNextDouble()) {
					scrn.next();
				}
				input=scrn.nextDouble();
				System.out.println("You have " + input*.832674 + " Imperial Gallons");
				break;
			case 4:
				scrn.close();
				break;
			default:
				System.out.println("Invalid option");
			}
		}
	}
}
