package com.daniel.reptes;

import java.util.Random;

public class PobreDesgraciat {
	
	public static final int VIDA = 100;
	public static final int MIN = 10;
	public static final int MAX = 30;
	
	public static final int RIVAL1 = 1;
	public static final int RIVAL2 = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Algun pobre desgraciat eixira a la pizarra per fer l'exercici");
		
		String[] alumnes = {"Raül", "Guillem" , "Diego Mayans", "Pepe", "Moises","Carles Alberola", "Georgi", "Iván Chapí", "Saül", "Karim", "María Jose", "Diego Iv", "Marc Ortíz", "Sofía", "Cristina", "Daniel K", "Carles Alberola", "Ivan Calatayud", "Marc Meri", "Pau", "Yo", "Carles Alberola", "Josep"};
		int longitud = alumnes.length;
		
		Random taTocat = new Random();
		
		String alumne1 = "";
		String alumne2 = "";
		int tocat1 = 0;
		int tocat2 = 0;
		
		do {
			
			tocat1 = taTocat.nextInt(longitud + 1);
			tocat2 = taTocat.nextInt(longitud + 1);
			
			if (tocat1 != tocat2) {
				
				for (int i = 0; i < alumnes.length; i++) {
					if(i == tocat1) alumne1 = alumnes[i];
					if(i == tocat2) alumne2 = alumnes[i];
				}
			}
			
		} while (tocat1 == tocat2);
		
		System.out.println("El perjudicats son " + alumne1 + " i " + alumne2);
		
		System.out.println("Ara vorem quin dels dos alumnes li toca pringar");
		
		duelAMortAmbGanivet(alumne1, alumne2);
		
	}
	
	static void duelAMortAmbGanivet(String primerAlumne, String segonAlumne) {
		
		String perdedor = "";
		
		int vida1 = VIDA;
		int vida2 = VIDA;
		int torn = 0;
		int attac = 0;
		
		while(vida1 >= 0 || vida2 >= 0) {
			/*Random per a triar el primer jugador en pegar*/
			/*Random per a generar el decrement de la vida del jugador per cada torn*/
			System.out.println("Torn " + (torn + 1));
			
			Random duel = new Random();
			
			attac = duel.nextInt(MIN, MAX +1);
			
			vida1-=attac;
			vida2-=attac;
			torn++;
			
			if (vida1 == 0) {
				perdedor = primerAlumne;
			} else if(vida2 == 0){
				perdedor = segonAlumne;
			}
		}
		
		
		
		/*
		 * Asignar perdedor al alumne que es quede sense vida
		 * Asignar guanayador al alumne que encara te la vida
		 * Tindrer en conter les poscions
		 * */
		
		System.out.println("El perdedor es " + perdedor);
	}

}
