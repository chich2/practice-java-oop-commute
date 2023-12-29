package dev.syntax.oop.step03practice.commuting;

public class Student {
	
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", money=" + money + "]";
	}

	public void takeBus(Bus bus) {
		if(this.money >= bus.fare) {
			this.money -= bus.fare;
			bus.numOfPassenger += 1;
			bus.salesAmount += bus.fare;
		}else {
			System.out.println("You need more money");
		}
	}

	public void takeSubway(Subway subway) {
		if(this.money >= subway.fare) {
			this.money -= subway.fare;
			subway.numOfPassenger += 1;
			subway.salesAmount += subway.fare;
		}else {
			System.out.println("You need more money");
		}
	}
}