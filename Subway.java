package dev.syntax.oop.step03practice.commuting;

public class Subway {
	
	int lineNumber;
	int fare;
	int numOfPassenger = 0;
	int salesAmount = 0;

	public Subway(int number, int fare) {
		lineNumber = number;
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Subway [lineNumber=" + lineNumber + ", numOfPassenger=" + numOfPassenger + ", salesAmount="
				+ salesAmount + "]";
	}	
}
