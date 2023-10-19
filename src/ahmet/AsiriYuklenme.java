package ahmet;

public class AsiriYuklenme {

	static void print() {
		System.out.println("parametresiz metot");

	}

	static void print(int a) {
		System.out.println("parametreler " + a);
	}

	static void print(int a, int b) {
		System.out.println("parametreler " + (a + b));
	}
	

	public static void main(String[] args) {

		print();
		print(4);
		print(5, 7);

	}

}
