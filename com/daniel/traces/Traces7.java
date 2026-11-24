package com.daniel.traces;

public class Traces7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Traça 01");

		String cad = "LLUTXENT";
		String[][] matriu1 = new String[cad.length()][cad.length()];
		for (int i = 0; i < matriu1.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < matriu1[i].length; j++) {
					matriu1[i][j] = "" + (cad.charAt((i + j) % cad.length()));
				}
			} else {
				for (int j = 0; j < matriu1[i].length; j++) {
					matriu1[i][j] = "" + (cad.charAt((i) % cad.length()));
				}
			}
		}
		for (int i = 0; i < matriu1.length; i += 3) {
			for (int j = 0; j < matriu1[i].length; j += 3) {
				System.out.print(matriu1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("======================");

		System.out.println("Traça 02");

		String cad2 = "He guanyat tot el que no he perdut";
		int pos = 0;
		String[][] matriu2 = new String[cad2.indexOf("g")][cad2.length() - cad2.lastIndexOf("e")];

		for (int i = 0; i < matriu2.length; i++) {
			for (int j = 0; j < matriu2[i].length; j++) {
				matriu2[i][j] = "" + cad2.charAt(pos++);
			}
		}
		for (int i = 0; i < matriu2.length + 2; i++) {
			for (int j = 0; j < matriu2[0].length + 2; j++) {
				if (i == 0 || i == matriu2.length + 1 || j == 0 || j == matriu2[0].length + 1) {
					System.out.print("*");
				} else {
					System.out.print(matriu2[i - 1][j - 1]);
				}
			}
			System.out.println();
		}

		System.out.println("======================");

		System.out.println("Traça 03");

		int[][] matriu3 = { { 10, 20, 30 }, { 15, 25, 35 }, { 40, 45, 50 } };
		int[] array = { 2, 0, 1 }, aux;
		int d = 0;
		String c = "";
		for (int i = 0; i < matriu3.length; i++) {
			aux = matriu3[array[i]];
			matriu3[array[i]] = matriu3[i];
			matriu3[i] = aux;
		}
		for (int i = 0; i < matriu3.length; i++) {
			for (int j = 0; j < matriu3[i].length; j++) {
				if (i == j) {
					if (i == matriu3.length - 1)
						c = "=";
					else
						c = "+";
					System.out.print(matriu3[i][j] + c);
					d += matriu3[i][j];
				}
			}
		}
		System.out.println(d);

		System.out.println("======================");

		System.out.println("Traça 04");

		String c1 = "Xaloc", vocals = "aeiou";
		String[][] matriu4;
		for (int i = 1; i < c1.length(); i++) {
			if (vocals.contains("" + c1.charAt(i))) {
				c1 = c1.replace(c1.charAt(i), c1.charAt(i - 1));
			}
		}
		System.out.println(c1);
		matriu4 = new String[c1.length()][c1.lastIndexOf("l")];
		for (int i = 0; i < matriu4.length; i++) {
			for (int j = 0; j < matriu4[i].length; j++) {
				matriu4[i][j] = "" + c1.repeat(2).charAt(i + j);
			}
		}
		for (int i = 0; i < matriu4.length; i += 2) {
			for (int j = 0; j < matriu4[i].length; j++) {
				System.out.print(matriu4[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("======================");

		System.out.println("Traça 05");

		String c2 = "", c3 = "";
		int x = 0;
		int[][] matriu5 = new int[5][2];
		for (int i = 0; i < matriu5.length; i++) {
			for (int j = 0; j < matriu5[i].length; j++) {
				matriu5[i][j] = x++;
			}
		}
		for (int[] a : matriu5) {
			for (int i : a) {
				c2 = i + c2;
				c3 += i;
				System.out.print(i);
			}
			System.out.println();
		}

		System.err.println(c2);
		System.out.println((c2 + "\n" + c3).repeat(2));

		System.out.println("======================");

		System.out.println("Traça 06");

		String c4 = "", c5 = "";
		int y = 0;
		int[][] matriu6 = new int[5][2];
		for (int i = 0; i < matriu6.length; i++) {
			for (int j = 0; j < matriu6[i].length; j++) {
				matriu6[i][j] = y++;
			}
		}
		for (int j = 0; j < matriu6.length; j++) {
			for (int i = 0; i < matriu6[j].length; i++) {

				c4 = i + c4;
				c5 += i;
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println((c4 + "\n" + c5).repeat(2));

		System.out.println("======================");
	}

}
