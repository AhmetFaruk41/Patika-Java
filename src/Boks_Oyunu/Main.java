package Boks_Oyunu;

public class Main {

	public static void main(String[] args) {

		Fighter marc =new Fighter("marc", 15, 100, 90, 30);
		Fighter alex = new Fighter("alex", 10, 95, 100, 40);
		Match m = new Match(marc, alex, 90, 100);
		m.run();
	}

}
