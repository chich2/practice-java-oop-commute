package dev.syntax.oop.step03practice.commuting;

public class Transportation {

	private int lineNumber;
	private int fare;
	private int numOfPassenger = 0;
	private int salesAmount = 0;
	
	
	public Transportation(int lineNumber, int fare) {
		this.lineNumber = lineNumber;
		this.fare = fare;
	}
	
	
	
	public int getLineNumber() {
		return lineNumber;
	}
	public int getFare() {
		return fare;
	}
	public int getNumOfPassenger() {
		return numOfPassenger;
	}
	public int getSalesAmount() {
		return salesAmount;
	}

	public void setNumOfPassenger(int numOfPassenger) {
		this.numOfPassenger = numOfPassenger;
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}
	
	public int confirm(int money) {
		if(money >= fare) {
			money -= fare;
//			subway.setNumOfPassenger(subway.getNumOfPassenger() + 1);
			numOfPassenger += 1;
//			subway.setSalesAmount(subway.getSalesAmount() + subway.getFare());
			salesAmount += fare;
			return money;
		}else {
			System.out.println("I need more money");
			return money;
		}
	}	
}
