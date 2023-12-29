package dev.syntax.oop.step03practice.commuting;

public class Student {
	
	private String name;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void setMoney(int money) {
		this.money = money;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", money=" + money + "]";
	}

	public void takeBus(Bus bus) {
		setMoney(bus.confirm(money));
	}

	public void takeSubway(Subway subway) {
		setMoney(subway.confirm(money));
	}
}