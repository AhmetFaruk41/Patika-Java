package Boks_Oyunu;

import java.security.spec.MGF1ParameterSpec;

import ahmet.returnVoid;

public class Fighter {
	String name;
	int damage;
	int healty;
	int weight;
	double dodge;

	public Fighter(String name, int damage, int healt, int weight, double dodge) {
		this.name = name;
		this.damage = damage;
		this.healty = healt;
		this.weight = weight;
		this.dodge = dodge;

	}

	public int hit(Fighter foe) {
		System.out.println("-----------");
		System.out.println(this.name + "=>" + foe.name + " " + this.damage + " hasar vurdu.");

		if (foe.dodge()) {
			System.out.println(foe.name + " gelen hasarı savurdu.");
			return foe.healty;

		}
		if (foe.healty - this.damage < 0) {
			return 0;

		}
		return foe.healty - this.damage;
	}

	public boolean dodge() {
		double randomValue = Math.random() * 100;
		// 0.0 to 99.9
		return randomValue <= this.dodge;

	}

}
