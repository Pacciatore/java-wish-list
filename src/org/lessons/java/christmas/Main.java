package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> wishList = new ArrayList<String>();

		System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("- Benvenuto nella tua lista dei desideri! -");
		System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Scanner s = new Scanner(System.in);

		String choice = "";

		do {

			System.out.println("\nInserire un desiderio da aggiungere alla lista: ");
			String wishToAdd = s.nextLine();

			System.out.println("Continuare ad inserire desideri? [S/N]");
			choice = s.nextLine();

		} while (choice.toLowerCase().equals("s"));

		s.close();

	}

}
