package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> wishList = new ArrayList<String>();

		System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("- Benvenuto nella tua lista dei desideri! -");
		System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");

		Scanner s = new Scanner(System.in);

		addingElements(s, wishList);

		s.close();

	}

	public static void addingElements(Scanner s, ArrayList<String> wishList) {

		String choice = "";

		do {

			System.out.println("Inserire un desiderio da aggiungere alla lista: ");
			String wishToAdd = s.nextLine();

			wishList.add(wishToAdd);

			System.out.println("----------------------------------------------------");

			System.out.println("Elementi presenti in lista: " + wishList.size());

			System.out.println("\nContinuare ad inserire desideri? [S/N]");
			choice = s.nextLine();

			System.out.println("----------------------------------------------------");

		} while (choice.toLowerCase().equals("s"));

	}

}
