package dev.syntax.oop.step03practice.commuting;

public class CommuteApp {

	public static void main(String[] args) {

		Bus bus9711 = new Bus(9711, 2800);
		Subway subway1 = new Subway(1, 1400);
		Student won = new Student("wonseop", 10000);
		
		System.out.println("탑승 전");
		System.out.println(bus9711.toString() + "\n");

		won.takeBus(bus9711);
		System.out.println(won.toString());
		
		System.out.println("\n 탑승 후");
		System.out.println(bus9711.toString());
		
		System.out.println("\n 원섭이는 내렸다. 지하철 타러간당~ \n");
		
		System.out.println("탑승 전");
		System.out.println(subway1.toString() + "\n");
		
		won.takeSubway(subway1);
		System.out.println(won.toString());
		
		System.out.println("\n 탑승 후");
		System.out.println(subway1.toString());
				
	}
}
