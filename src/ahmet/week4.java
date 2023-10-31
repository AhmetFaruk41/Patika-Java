package ahmet;

import java.util.Random;
import java.util.Scanner;

public class week4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		int a = rnd.nextInt(10);
		int b = rnd.nextInt(10);
		System.out.println(a +"+"+b+" = ?");
		int cevap= input.nextInt();
		
		while ((a+b)!=cevap) {
			
			System.out.println("yanlıs cevap");
			System.out.println( "lutfen tekrar giriniz   "+a +"+"+b+" = ?");
			cevap=rnd.nextInt();
			break;

			
		}
		System.out.println("dogru cevap");
	}

}
