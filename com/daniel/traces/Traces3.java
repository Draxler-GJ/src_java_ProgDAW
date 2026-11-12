package com.daniel.traces;

public class Traces3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exercicis de traces 03");

		System.out.println("Traça 1");

		int[] array = new int["ginjols".length()];
		int x = 5;
		for (; x < 30; x += 5)
			array[x / 5] = x;
		for (int i = 0; i < array.length; i++) {
			if (i < array.length / 2) {
				for (int j = array.length - 1 - i; j > 0; j--)
					System.out.print('*');
			} else {
				for (int j = 0; j < i; j++)
					System.out.print('*');
			}
			System.out.println(" " + array[i]);
		}

		System.out.println("=======================================");
		System.out.println("Traça 2");

		int[] array1 = { 1, 3, 8, 12 };
		int sum = 0;
		for (int i = 0; i < array1.length; i++)
			sum += array1[i];
		System.out.print(sum);
		do {
			array1[sum / (array1.length * 2)] = sum / array1.length;
			sum -= array1.length * 2;
		} while (sum >= 0);
		for (int i : array1)
			System.out.print(i);

		System.out.println("\n=======================================");
		System.out.println("Traça 3");

		char[] array2 = { 'a', 'b', 'c', 'd', 'e' };
		for (int i = 0; i < array2.length; i++)
			array2[i] += array2.length;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (j % (i + 1) == 0)
					System.out.print(array2[j]);
				else
					System.out.print(' ');
			}
			System.out.println();
		}

		System.out.println("=======================================");
		System.out.println("Traça 4");

		int n = 5;
		int[] array3 = new int[n];
		for (int i = 0; i < n; i++)
			array3[i] = i + 1;
		for (int k = 0; k < n; k++)
			System.out.print(array3[k]);
		System.out.println();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n; j++)
				array3[j]++;
			for (int k = 0; k < n; k++)
				System.out.print(array3[k]);
			System.out.println();
		}

		System.out.println("=======================================");
		System.out.println("Traça 5");

		String cad1 = "defeuh";
		String cad2 = "ydr&ta";
		char[] cad3 = new char[cad1.length() + cad2.length()];
		char[] cad4 = new char[cad3.length];
		for (int i = 0; i < cad3.length; i++) {
			if (i < cad3.length / 2)
				cad3[i] = cad1.charAt(i);
			else
				cad3[i] = cad2.charAt(i - cad2.length());
		}
		for (int i = 0; i < cad3.length / 4; i++) {
			char aux = cad3[i];
			cad3[i] = cad3[cad3.length / 2 - i - 1];
			cad3[cad3.length / 2 - i - 1] = aux;
			aux = cad3[cad3.length / 2 + i];
			cad3[cad3.length / 2 + i] = cad3[cad3.length - i - 1];
			cad3[cad3.length - i - 1] = aux;
		}
		for (int i = 0; i < cad3.length; i++) {
			if (i < cad3.length / 2)
				cad4[i * 2] = cad3[i];
			else
				cad4[2 * i - cad3.length + 1] = cad3[i];
		}
		cad3 = cad4;
		for (char c : cad3)
			System.out.print(c);

	}

}
