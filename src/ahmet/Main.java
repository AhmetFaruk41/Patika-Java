package ahmet;

public class Main {

	public static void main(String[] args) {

		car audi = new car("rs7", 120, "blue");
		audi.printİnfo();

		// System.out.println(audi.model + " hızı: " + audi.speed);

		car bmw = new car("m8", 130, "black");
		bmw.printİnfo();

		car mercedes = new car("G63", 140, "white");
		mercedes.printİnfo(); 
		
	}

}
