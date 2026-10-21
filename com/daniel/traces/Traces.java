package com.daniel.traces;

public class Traces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 20;
		double x2 = 7.0;
		boolean b = true;
		while ((x1 * x2) > (x1 + x2)) {
			x2--;
			x1 = x1 % (int) x2;
			if (b) {
				b = !b;
				x2--;
			} else {
				x1++;
				b = !b;
			}
			System.out.print(x1 + " ");
		}
		System.out.println(b);

		System.out.println("------------");

		boolean boo = true;
		int n = 20;
		for (int i = 1; boo; i += 5) {
			System.out.print((n % i) + "\\");
			if (i > n)
				boo = false;
		}

		System.out.println("\n------------");

		System.out.println((17 / 2));

		int j = 10, acm = 0;
		while (acm <= "sargantana".length()) {
			j--;
			acm += j;
			for (int i = 0; i < acm / 2; i++)
				System.out.print('*');
			System.out.print("\n");
		}
		System.out.println("acm: " + acm);

		System.out.println("------------");

//		boolean q = true;
//		for (int i = 0; i < 4; i++) {
//			for (int k = 0; k <= i; k++) {
//				if (k % 2 == 0 && i % 2 != 0)
//					System.out.print(q + "\\");
//				else
//					System.out.print(!q + "/");
//			}
//			System.out.println();
//		}

		System.out.println("------------");

		int m = 30;
		int i = 5;
		do {
			i++;
			m = m + (m % 20);
			m -= 20;
			System.out.println(m / i);
		} while (m > -20);
		System.out.println("m: " + m);

		System.out.println("------------");

		int p = 10;
		int sum = 0;
		for (int k = 1; k < 10; k++) {
			if ((p % k) % 2 == 0) {
				sum += k;
			}
		}
		System.out.println("sum: " + sum);
		
		int q = -2;
		int geo = 1;
		while(geo<6) {
		q = q*q+q;
		geo=q - geo*geo;
		}
		System.out.println("q: "+q+" geo: "+geo);
		

	}

}
