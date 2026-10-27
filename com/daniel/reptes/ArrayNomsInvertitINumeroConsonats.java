package com.daniel.reptes;

import java.util.Random;
import java.util.Scanner;

public class ArrayNomsInvertitINumeroConsonats {

	private static final int MAX_LON = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] noms = new String[MAX_LON];
		String nom = "";
		boolean completat = false;
		int increment = 0;
		String invertit = "";
		String nomInvertit = "";
		int contarCaracter = 0;
		int numeroRandom = 0;
		char c = ' ';
		
		Scanner sc = new Scanner(System.in);
		Random aleatori = new Random();
		//demanen el noms per bucle
		
		do {
			System.out.println("Introduix un nóm");
			
			nom = sc.nextLine().toUpperCase().trim();
			if (nom.isBlank()) {
				System.err.println("El camp no pot quedar vuit");
				completat = false;
			} else {
				
				for (int j = 0; j < nom.length(); j++) {
					invertit = ("" + (nom.charAt(j)));
					//System.out.print());
					
					nomInvertit = invertit;
					
				}
				
				//noms[increment] = nomInvertit;
				noms[increment] = nomInvertit;
				increment++;
				if (increment == MAX_LON) {	
					completat =  true;
				}
			}
			
		} while(increment < MAX_LON && !completat);	
		
			
		//mostrem
		
		System.out.print("Matriu de noms:" +  "\n[");
		for (int i = 0; i < noms.length; i++) {
			if (i == noms.length - 1) {
				System.out.println(noms[i] + "]");
			} else {
				System.out.print(noms[i] + ", ");
			}
			
		}
		
		//Mostren el el valor del array invertit i cada nom al reves
		
		System.out.print("Matriu de noms invertida: " + "\n[");
		for (int i = noms.length -1; i >= 0; i--) {
			
			if (i == 0) {
				System.out.println(noms[i] + "]");
			} else {
				System.out.print(noms[i] + ", ");
			}
		}
			
		//AÇI ANIRA TOTA LA LÖGICA DEL RANDOM I BUSCAR LA CANTITAT DE CHAR AMB IXE VALOR HI HAN
		
		numeroRandom = aleatori.nextInt(65, 90+1);
		
		System.out.println("El número aleatori es: " + (char)numeroRandom);
		c = (char)numeroRandom;
		
		//Fer recompte
		for (int i = 0; i < noms.length; i++) {
			
			if (noms[i] == ("" + c)) {
				contarCaracter++;
			}
		}
		
		System.out.println("El caracter es troba " + contarCaracter);
			
		//tancar escaner
		sc.close();
	}

}
