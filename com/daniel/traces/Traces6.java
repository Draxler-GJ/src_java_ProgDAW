package com.daniel.traces;

public class Traces6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Traça 01");

		String cadena = "perdutperrucallorerulleres";
		String[] cads = cadena.split("u");
		String cad = "";
		for (int i = 0; i < cads.length; i++) {
			cad += cads[i].substring(cads[i].length() / 2).toUpperCase();
			cad += cads[cads.length - i - 1].substring(0, cads[i].length() / 2);
			System.out.println("*".repeat(i + 1) + cad + cad.length());
			cad = "";
		}

		System.out.println("==========================");

		System.out.println("Traça 02");

		String[] array = { "sis", "massís", "desistir", "oasi" };
		for (int i = 0; i < array.length; i++) {
			if (array[i].contains(array[0])) {
				if (i % 2 == 0)
					System.out.print(array[i].indexOf(array[0]));
				else
					System.out.println(array[i]);
			} else {
				System.out.print(array[i].lastIndexOf("" + array[0].charAt(0)));
			}
		}

		System.out.println("\n==========================");

		System.out.println("Traça 03");

		String[] array2 = { "sort", "Sort", "fort", "Fort", "Cort" };
		for (int i = 0; i < array2.length - 1; i++) {
			if (i % 2 == 0) {
				if (array2[i].compareToIgnoreCase(array[i + 1]) == 0) {
					System.out.print(array2[i]);
				} else {
					System.out.print(array2[i + 1].charAt(0));
				}
			} else {
				if (array2[i].compareTo(array2[i + 1]) > 0) {
					System.out.print(array2[i].charAt(0));
				} else {
					System.out.print(array2[i + 1]);
				}
			}
		}

		System.out.println("\n==========================");

		System.out.println("Traça 04");

		String cad1 = "roure";
		String[] array3 = cad1.split("");
		for (int i = 0; i < array3.length - 1; i++) {
			if (i % 2 == 0) {
				array3[i] = cad1.replace(array3[i], array3[i + 1].toUpperCase());
			} else {
				array3[i] = cad1.replace(array3[i], array3[i + 1]);
			}
		}
		for (int i = 0; i < array3.length - 1; i++) {
			System.out.print(array3[i].charAt(array3[i].length() - 1 - i));
		}

		System.out.println("\n=========================");

		System.out.println("Traça 05");

		String cad2 = "TOTXO";
		for (int i = 0; i < cad2.length(); i++) {
			for (int j = 0; j < cad2.length(); j++) {
				if (i == cad2.length() / 2) {
					if (j == cad2.length() / 2) {
						System.out.print(cad2.charAt(0));
					} else {
						System.out.print(cad2.charAt(cad2.length() - 2));
					}
				} else if (i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print(cad2.charAt(cad2.length() - 2));
					} else {
						System.out.print(cad2.charAt(cad2.length() - 1));
					}
				} else {
					if (j == cad2.length() / 2) {
						System.out.print(cad2.charAt(cad2.length() - 2));
					} else if (j % 2 == 0) {
						System.out.print(cad2.charAt(cad2.length() - 1));
					} else {
						System.out.print(cad2.charAt(cad2.length() - 2));
					}
				}
			}
			System.out.println();
		}

		System.out.println("==========================");
	}

}
