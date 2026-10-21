package com.daniel.traces;

//import java.util.Arrays;

public class Traces2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
//		for (int i = array[0]; i < array[5]; i++) {
//			for (int j = 0; j < array.length; j++) {
//				switch (i) {
//				case 1:
//					if (array[j] % 2 != 0)
//						System.out.print(array[j]);
//					break;
//				case 2:
//					if (array[j] % 2 == 0)
//						System.out.print(array[j]);
//					break;
//				case 3:
//					if (array[j] % i == 0)
//						System.out.print(array[j]);
//					break;
//				case 4:
//					if (array[j] % 7 == 0)
//						System.out.print(array[j]);
//					break;
//				default:
//				}
//			}
//			System.out.println('*');
//		}

		System.out.println("==========================");

//		int[] array1 = { 1, 2, 3, 4 };
//		int[] array2 = { 5, 6, 7, 8 };
//		boolean[] arrayBool = new boolean[array1.length];
//		for (int i = 0; i < arrayBool.length; i++)
//		arrayBool[i] = (array1[i] + array2[i]) >= 10;
//		for (boolean b : arrayBool)
//		if (b) System.out.print("/" + b + "\\");

		System.out.println("===========================");

//		String cad = "sargantana";
//		char p[] = new char[cad.length()];
//		for (int i = 0; i < p.length; i++)
//			p[i] = cad.charAt(p.length - 1 - i);
//		
//		System.out.println(Arrays.toString(p));
//		for (char c : p) {
//			if (c >= 'a' && c <= 'n') {
//				if (c == cad.charAt(cad.length() - 1)) {
//					System.out.print(("" + c).toUpperCase());
//				} else {
//					System.out.print(c);
//				}
//			}
//		}

		System.out.println("======================");

//		int m = 6;
//		boolean b = true;
//		int[] array3 = new int[m];
//		for (int i = 0; i < array3.length; i++)
//			array3[i] = i % 2;
//		for (int i : array3) {
//			if (i % 2 == 0) {
//				if (b) {
//					for (int j = 0; j < array3.length; j++) {
//						System.out.print(array3[j] + " ");
//					}
//					b = !b;
//				} else {
//					for (int k = array3.length - 1; k >= 0; k--) {
//						System.out.print(array3[k] + " ");
//					}
//					b = !b;
//				}
//				System.out.println();
//			}
//		}

		System.out.println("=======================");

		int n = 6;
		char c1 = '*', c2 = 'I';
		for (int j = 0; j < n + 2; j++)
			System.out.print(c1);
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(c1);
			for (int j = 0; j < n; j++) {
				if ((i < n / 2 - 1) || (i > n / 2)) {
					System.out.print(c2);
				} else {
					if ((j < n / 2 - 1) || (j > n / 2)) {
						System.out.print(' ');
					} else {
						System.out.print(c2);
					}
				}
			}
			System.out.println(c1);
		}
		for (int j = 0; j < n + 2; j++)
			System.out.print(c1);

	}

}
