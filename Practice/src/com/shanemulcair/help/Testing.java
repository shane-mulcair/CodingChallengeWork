package com.shanemulcair.help;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int x = 0;
		int y;
		int z;
		int temp;
		final int Pseats = 50;
		final int Eseats = 50;
		double PcostSeats = 54.99;
		double EcostSeats = 19.99;
		int choice;
		double PremTotalCost;
		double EconTotalCost;
		int orderPremTickets = 0;
		int orderEconTickets = 0;
		int PremSeatsLeft = 50;
		int EconSeatsLeft = 50;
		int PremSoldOut;
		int EconSoldOut;

		System.out.println("============================\n" + "============================\n" + "Cork Opera House\n"
				+ "============================\n" + "============================"
				+ "\nPremium Ticket layout & Economy Ticket layout");

//		for (int i = 0; i < 25; i++) {
//
//			System.out.println();
//
//			for (x = 0; x < 25; x++) {
//
//				System.out.print("P");
//			}
//		}
//
//		for (int i = 0; i < 25; i++) {
//
//			System.out.println();
//
//			for (z = 0; z < 25; z++) {
//
//				System.out.print("E");
//			}
//		}

		while (orderPremTickets != 50 && orderEconTickets != 50) {
			System.out.println("\nPlease choose the type of ticket you want : 1.Premium" + "2.Economy ");

			choice = input.nextInt();

			if (choice == 1) {

				System.out.println("How many Premium would you like: ");
				orderPremTickets = input.nextInt();
				System.out.println("You input: "+orderPremTickets);
				PremTotalCost = orderPremTickets * PcostSeats;

				System.out.println("Total cost for Tickets : " + PremTotalCost);
				PremSeatsLeft = PremSeatsLeft - orderPremTickets;
				System.out.println("The number of Premium seats left :" + PremSeatsLeft);
			}

			else if (choice == 2) {
				System.out.println("How many Economy would you like: ");
				orderEconTickets = input.nextInt();
				System.out.println("You input: "+orderEconTickets);
				EconTotalCost = orderEconTickets * EcostSeats;

				System.out.println("Total cost for Tickets : " + EconTotalCost);
				EconSeatsLeft = EconSeatsLeft - orderEconTickets;
				System.out.println("The number of Premium seats left :" + EconSeatsLeft);

			}

		}

		System.out.println("//////////////////////////////SUMMARY//////////////////////////////////");
		System.out.println("Premium sold :  " + orderPremTickets + " \nRemaining Premium left :" + PremSeatsLeft
				+ "\nThank you!" + "\n*************************************************************************"
				+ "\nEconomy sold : " + orderEconTickets + "\nRemaining Premium left :" + EconSeatsLeft
				+ "\nThank you!");

	}

}