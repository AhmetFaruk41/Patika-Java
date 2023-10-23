package ahmet;

class car {
	// nitelikler
	String type;
	String model;
	String color;
	int speed;
	int speedLimit = 180;

	
	car(String audi,int speed,String color) {
		this.model=audi;
		this.speed=speed;
		this.color=color;
		this.type ="sedan";
		this.speedLimit=180;
		
		}
	
	

	void increaseSpeed(int increment) {
		if ((speed + increment) < speedLimit) {
			speed += increment;
		}
	}

	void decreaseSpeed(int decrease) {
		if (speed > 0) {
			speed -= decrease;

		}
	}

	void printSpeed() {
		System.out.println("Hızınız: " + speed);

	}
	void printİnfo() {
		System.out.println("Model\t:"+this.model);
		System.out.println("Color\t:"+this.color);
		System.out.println("Speed\t:"+this.speed);
		System.out.println("Type\t:"+this.type);

	}
	

}
