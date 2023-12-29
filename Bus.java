package dev.syntax.oop.step03practice.commuting;

public class Bus extends Transportation {

	
	public Bus(int number, int fare) {
		super(number, fare);
	}

	@Override
	public String toString() {
		return "Bus [lineNumber=" + getLineNumber() + ", numOfPassenger=" + getNumOfPassenger() + ", salesAmount=" + getSalesAmount()
				+ "]";
	}
}
