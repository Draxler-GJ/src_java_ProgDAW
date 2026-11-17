package com.daniel.reptes;

import java.util.Random;
import java.util.Scanner;

public class FiguraCazalla {
	
	private static final int MIN = 0;
	private static final int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random arreu = new Random();
		
		String cadena = "";
		String[] array ;
		
		double numeroAleatori = 0.0;
		
		do {
			System.out.println("Introduix una cadena:");
			
			cadena = sc.nextLine().trim();
			if (cadena.length() < 40) {
				System.err.println("Frase massa llarga");
			} else if(cadena.contains("\t")) {
				System.err.println("No pot contindre tabulador");
			}
		} while (cadena.isBlank());
		
		numeroAleatori = Math.ceil(arreu.nextDouble(MIN, MAX));
		array = cadena.split("\s");
		
		System.out.println(numeroAleatori);
		
		System.out.println("Matriu e PHP, versió JAVA");
		for (int i = 0; i < numeroAleatori; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j] + "-\s");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
