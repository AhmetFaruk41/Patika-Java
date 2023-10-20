package ahmet;

public class Main {

	public static void main(String[] args) {
		
		car audi = new car();
		audi.speed = 130;
		audi.model= "Rs7";
		audi.increaseSpeed(20);
		
		System.out.println(audi.model +" hızı: "+ audi.speed);
		
		car bmw = new car();
		bmw.model= "bmw";
		bmw.speed= 140;
		
		System.out.println(bmw.model +" hızı: "+ bmw.speed);

		car mercedes = new car();
		mercedes.model= "cls";
		mercedes.speed= 150;
		
		System.out.println(mercedes.model +" hızı: "+ mercedes.speed);

		
		
		
	}

}
