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
		boolean esta = false;
		int increment = 0;
		String nomInvertit = "";
		int contarCaracter = 0;
		int numeroRandom = 0;
		char c = ' ';
		
		Scanner sc = new Scanner(System.in);
		Random aleatori = new Random();
		//demanen el noms per bucle
		
		do {//Fer comprobació de que els valors que introduisques no es repetisques i tornarlos a introduir
			System.out.println("Introduix un nóm (" + (increment + 1) + "):");
			
			nom = sc.nextLine().toUpperCase().trim();
			if (nom.isBlank()) {
				System.err.println("El camp no pot quedar vuit");
				completat = false;
			} else if(nom.contains("1") ||
					nom.contains("2") ||
					nom.contains("3") ||
					nom.contains("4") || 
					nom.contains("5") || 
					nom.contains("6") || 
					nom.contains("7") || 
					nom.contains("8") || 
					nom.contains("9") || 
					nom.contains("0") ){
				System.err.println("El camp no pot començar o tenir ni ser número enter");
				completat = false;
			} else {
				
				nomInvertit = "";
				for (int j = 0; j < nom.length(); j++) {
					nomInvertit += ("" + (nom.charAt(nom.length() - 1 - j)));//("" + candena.charAt()) permet fer un casting de char a string
				}
				//Doble bucle for per a guardar cada posicio del nom
				//Guardem cada nom en una variable
//				for (int i = 0; i < noms.length; i++) {
//					
//				}
				noms[increment] = nomInvertit;
				increment++;
				if (increment == MAX_LON) {	
					completat =  true;
				}
			}
			
		} while(increment < MAX_LON && !completat);	
		
		System.out.println("=================================");
		//mostrem
		
		System.out.print("Matriu de noms:" +  "\n[");
		for (int i = 0; i < noms.length; i++) {
			if (i == noms.length - 1) {
				System.out.println(noms[i] + "]");
			} else {
				System.out.print(noms[i] + ", ");
			}
			
		}
		
		System.out.println("=================================");
		//Mostren el el valor del array invertit i cada nom al reves
		
		System.out.print("Matriu de noms invertida: " + "\n[");
		for (int i = noms.length -1; i >= 0; i--) {//Doble bucle for per a recorrer
			
			if (i == 0) {
				System.out.println(noms[i] + "]");
			} else {
				System.out.print(noms[i] + ", ");
			}
		}
			
		//AÇI ANIRA TOTA LA LÖGICA DEL RANDOM I BUSCAR LA CANTITAT DE CHAR AMB IXE VALOR HI HAN
		System.out.println("=================================");
		
		numeroRandom = aleatori.nextInt(65, 90+1);
		
		System.out.println("El caracter aleatori es: " + (char)numeroRandom);
		c = (char)numeroRandom;
		
		//Fer recompte
		for (int i = 0; i < noms.length; i++) {
			if (noms[i].contains("" + c) || noms[i].charAt(i) == c) {
				contarCaracter++;
				esta = true;//Probar a contar en doble bucle for -> Millorar lògica
			}
		}
		
		//Queda mostrar un grafic aon es vetja la quantitat de vegades que cada part del array te un un valor dins de la seua cadena
		for (int i = 0; i < noms.length; i++) {
			if (esta) {
				System.out.println(c + " en el nom " + noms[i] + " es troba " + contarCaracter + " vegada/es");
			} else {
				System.out.println(c + " en el nom " + noms[i] + " no es troba");
			}
		}
			
		//tancar escaner
		sc.close();
	}
	

}
