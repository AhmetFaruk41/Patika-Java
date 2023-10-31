package Maas_Hesaplayıcı;

import java.util.Iterator;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	Employee(String name, double salary, int workHour, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHour;
		this.hireYear = hireYear;
	}

	double tax() {
		double tax = 0;

		if (salary < 1000) {
			return tax;
		} else {
			tax = this.salary * 0.03;
			return tax;
		}
	}

	double bonus() {
		double bonus = 0;
		if (this.workHours > 40) {
			for (int i = 40; i < this.workHours; i++) {
				bonus += 30;
			}
			return bonus;
		}
		return bonus;
	}

	double raiseSalary() {
		double raiseSalary = 0;
		int year = 2023;
		if (year - this.hireYear < 9) {
			raiseSalary = this.salary * 0.05;
			return raiseSalary;

		} else if ((year - this.hireYear > 9 && year - this.hireYear < 20)) {
			raiseSalary = this.salary * 0.10;
			return raiseSalary;

		} else {
			raiseSalary = this.salary * 0.15;
			return raiseSalary;
		}

	}

	void info() {
		System.out.println("Adı: " + this.name);
		System.out.println("Maaşı: " + this.salary);
		System.out.println("Çalışma Saati: " + this.workHours);
		System.out.println("Başlangıç Yılı: " + this.hireYear);
		System.out.println("Vergi: " + tax());
		System.out.println("Bonus: " + bonus());
		System.out.println("Maaş Artışı: " + raiseSalary());
		System.out.println("Vergi ve bonuslarla birlikte maas: " + (this.salary + bonus() - tax()));
		System.out.println("Toplam maaş: " + (this.salary + raiseSalary() + bonus() - tax()));

	}

}
