package dev.syntax.oop.step03practice.commuting;

public class Subway extends Transportation{


	public Subway(int number, int fare) {
		super(number, fare);
	}

//	public void 
	
	@Override
	public String toString() {
		return "Subway [lineNumber=" + getLineNumber() + ", numOfPassenger=" + getNumOfPassenger() + ", salesAmount="
				+ getSalesAmount() + "]";
	}	
}
