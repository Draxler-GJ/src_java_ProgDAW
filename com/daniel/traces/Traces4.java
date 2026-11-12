package com.daniel.traces;

public class Traces4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Traça 01");

		int n = 5, aux = 0, sum = 0;
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = 2 * i + 1;
		for (int i = 0; i < n / 2 + 1; i++) {
			if (array[i] <= 3) {
				aux = array[i];
				array[i] = array[n - i - 1] % n;
				array[n - i - 1] = aux;
			} else {
				aux = array[n - i - 1];
				array[n - i - 1] = array[i] % n;
				if (aux == n)
					array[i] = array[n - i - 1];
				else
					array[i] = aux;
			}
			sum += array[i];
		}
		for (int i : array)
			System.out.print(i + " ");

		System.out.println("\nTraça 02");

		String[] array1 = { "abcd", "abcd", "abcd", "abcd" };
		for (int i = 0; i < array1.length; i++) {
			array1[i] = "" + array1[i].charAt(i) + i + array1[i].charAt(array1.length - i - 1);
		}
		for (String s : array1)
			System.out.print(s + " ");

		System.out.println("\nTraça 03");

		String cadena = "paixarell";
		String[] array2 = { "", "", "", "" };
		int[] array3 = { 1, 3, 0, 2 };
		for (int i = 0; i < array2.length * 2; i += 2) {
			for (int j = i; j < i + 2; j++) {
				array2[j / 2] += cadena.charAt(j);
			}
		}

		for (int i = 0; i < array2.length; i++)
			System.out.print(array2[array3[i]]);

		System.out.println("\nTraça 04");

		boolean[] array4 = { true, false, true, false };
		String[] array5 = { "e", "ff", "ggg", "hhhh" };
		for (int i = 0; i < array5.length; i++) {
			if (array4[i])
				array5[i] += array5[i + 1].toUpperCase();
			else
				array5[i] = "/" + array5[i] + "\\";
		}
		for (int i = 1; i < array5.length - 1; i++)
			System.out.print(array5[i]);

		System.out.println("\nTraça 05");

		String[] array6 = { "a", "r", "r", "a", "y" };
		for (int i = 0; i < array6.length; i++) {
			for (int j = 0; j < array6.length; j++) {
				if (j == array6.length - 1) {
					System.out.print(array6[i] + "\n");
				} else if (j % 2 != 0) {
					System.out.print(array6[j + i / 2 - 1]);
				} else {
					System.out.print("*");
				}
			}
		}

	}

}
