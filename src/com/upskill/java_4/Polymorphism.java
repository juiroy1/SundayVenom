package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		car (7);
		car ();
		car ("red");
		car (4, "dual motors");
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
	}
		
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourlyIncome * 2000;
		int rent = 3000;
		int bonus = 13000;
		int sidehussle = 24000;
		int newIncome = calculateAnnualIncome + rent + bonus + sidehussle;
			System.out.println("My Annual Income= " + newIncome);
				
	}
	
		

	
	
public static void car() {
	System.out.println("My car is tesla!");
}

public static void car (int seat) {
	System.out.println("My car has seat: " +seat);
	}
	
public static void car (String color) {
	System.out.println("My car has color: " +color);
	}

public static void car (int door, String hp) {
	System.out.println("My car has door: " +door + " It has hp: "+hp);
    }
}