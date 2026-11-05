package com.daniel.reptes;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	
	public static final int MAX_LONG = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> noms = new ArrayList<>(MAX_LONG);
		String nom = "";
		int increment = 0;
		boolean estaComplet = false;
		
		do {
			System.out.println("Introduix un nom:");
			
			nom = sc.nextLine().toUpperCase();
			
			while (noms.size() < MAX_LONG) {
				noms.add(nom);
			}
			System.out.println(noms);
			
			if (nom.isBlank()) {
				System.err.println("El camp no pot quedar vuit");
				estaComplet = false;
			} else if(nom.contains("0")||
					nom.contains("1")||
					nom.contains("2")||
					nom.contains("3")||
					nom.contains("4")||
					nom.contains("5")||
					nom.contains("6")||
					nom.contains("7")||
					nom.contains("8")||
					nom.contains("9")){
				System.err.println("El camp no pot començar o contindre enterns");
				estaComplet = false;
			} else {
				
				if (increment < MAX_LONG) {
					
					increment++;
				}else {
					estaComplet = true;
					
				}
			}
		} while (increment < MAX_LONG && !estaComplet);
		
		
		
		sc.close();
	}

}
