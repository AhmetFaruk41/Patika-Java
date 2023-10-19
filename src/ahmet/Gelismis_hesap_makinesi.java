package ahmet;

import java.util.Scanner;

public class Gelismis_hesap_makinesi {
	static double toplama(int a, int b) {
		return (double) a + b;
	}

	static double cikarma(int a, int b) {
		return (double) a - b;
	}

	static double carpma(int a, int b) {
		return (double) a * b;
	}

	static double bolme(int a, int b) {
		return (double) a / b;
	}

	static double usluHesaplama(int base, int exp) {
		double result = Math.pow(base, exp);
		return result;
	}

	static int faktoriyelHesaplama(int a) {
		int toplam = 1;
		for (int i = 1; i <= a; i++) {
			toplam *= i;
		}
		return toplam;
	}

	static int modAlma(int a, int b) {
		return a % b;
	}

	static void dikdortgenAlanCevre(int a, int b) {
		double alan = a * b;
		double cevre = (a + b) * 2;
		System.out.println("Dikdörtgenin alanı: " + alan);
		System.out.println("Dikdörtgenin çevresi: " + cevre);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String secimEkrani = "1-Toplama işlemi\n" + "2-Çıkarma işlemi\n" + "3-Çarpma işlemi\n" + "4-Bölme işlemi\n"
				+ "5-Üslü sayı hesaplama\n" + "6-Faktoriyal hesaplama\n" + "7-Mod alma\n"
				+ "8-Dikdörtgen alan ve çevre hesaplama\n" + "9-Çıkış yapmak";
		boolean devam = true;
		while (devam) {
			System.out.println("---------------------------------------");

			System.out.println(secimEkrani);
			System.out.print("Bir seçim yapınız: ");
			int secim = input.nextInt();

			if (secim >= 1 && secim < 5) {
				System.out.print("1. Sayıyı giriniz: ");
				int sayi1 = input.nextInt();
				System.out.print("2. Sayıyı Giriniz: ");
				int sayi2 = input.nextInt();

				switch (secim) {
				case 1:
					System.out.println("Toplama İşlemi");
					double sonuc = toplama(sayi1, sayi2);
					System.out.println("Sonuç: " + sonuc);
					break;
				case 2:
					System.out.println("Çıkarma İşlemi");
					double sonuc1 = cikarma(sayi1, sayi2);
					System.out.println("Sonuç: " + sonuc1);
					break;
				case 3:
					System.out.println("Çarpma İşlemi");
					double sonuc2 = carpma(sayi1, sayi2);
					System.out.println("Sonuç: " + sonuc2);
					break;
				case 4:
					System.out.println("Bölme İşlemi");
					double sonuc3 = bolme(sayi1, sayi2);
					System.out.println("Sonuc: " + sonuc3);
					break;

				}
			}

			switch (secim) {
			case 5:
				System.out.println("Üslü Sayı İşlemi");
				System.out.print("Taban sayısını giriniz: ");
				int taban = input.nextInt();
				System.out.print("Üs sayısını giriniz: ");
				int us = input.nextInt();
				double sonuc = usluHesaplama(taban, us);
				System.out.println("Sonuç: " + sonuc);
				break;
			case 6:
				System.out.println("Faktoriyel İşlemi");
				System.out.print("Bir sayı giriniz: ");
				int girdi = input.nextInt();
				int sonuc1 = faktoriyelHesaplama(girdi);
				System.out.println("Sonuç: " + sonuc1);
				break;
			case 7:
				System.out.println("Mod alma İşlemi");
				System.out.print("Modu alınacak sayıyı giriniz: ");
				int ilkSayi = input.nextInt();
				System.out.print("Bölünecek olan sayıyı giriniz: ");
				int ikinciSayi = input.nextInt();
				int sonuc2 = modAlma(ilkSayi, ikinciSayi);
				System.out.println("Sonuç: " + sonuc2);
				break;
			case 8:
				System.out.println("Dikdörtgenin cevresi ve alanını hesaplama işlemi");
				System.out.print("1. kenar uzunluğunu giriniz: ");
				int ilkKenar = input.nextInt();
				System.out.print("2. kernar uzunluğunu giriniz: ");
				int ikinciKenar = input.nextInt();
				dikdortgenAlanCevre(ilkKenar, ikinciKenar);
				break;
			case 9:
				System.out.println("Başarıyla çıkış yapılmıştır");
				devam = false;
				break;
			}
		}

	}
}
