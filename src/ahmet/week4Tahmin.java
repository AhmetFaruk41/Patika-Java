package ahmet;

import java.util.Random;
import java.util.Scanner;

public class week4Tahmin {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner input = new Scanner(System.in);
		int rndsayi = rnd.nextInt(100);
		while (true) {
			System.out.println("Tahmininizi giriniz: ");
			int tahmin = input.nextInt();
			if (rndsayi==tahmin) {
				System.out.println("tahmininiz dogru ");
				
				
			}
			else if (tahmin>rndsayi) {
				System.out.println("tahminiz sayıdan buyuk tekrar deneyin");
				
			}
			else {
				System.out.println("tahmininiz sayıdan kucuk tekrar deneyiniz");
			}

		}

	}

}
