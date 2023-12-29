package dev.syntax.oop.step03practice.commuting;

public class Bus {
	
	int lineNumber;
	int fare;
	int numOfPassenger = 0;
	int salesAmount = 0;
	
	public Bus(int number, int fare) {
		lineNumber = number;
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Bus [lineNumber=" + lineNumber + ", numOfPassenger=" + numOfPassenger + ", salesAmount=" + salesAmount
				+ "]";
	}
}
