package com.upskill.java_1;

public class MethodType {
	
	/*    Types of Methods
	 
	 
	 1.Void Method
	 2.Static method 
	 3. Return Type Method 
	 */
	

	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		weeklyIncomeStatic();
	    
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());

	}
	
	public static int hourlyIncome = 65;
	
	//void Method
	public void annualIncomeVoid () {
		int calculateAnnualIncome =hourlyIncome * 2000;
			System.out.println ("My AnnualIncome= "+ calculateAnnualIncome);
			
	}

	// Return Type Method
	public int monthlyIncomeReturn() {
	int calculateMonthlyIncome = hourlyIncome * 200;
	return calculateMonthlyIncome;
	
    }

    //Static Method 
    public static void weeklyIncomeStatic() {
    	int calculateWeeeklyIncome = hourlyIncome * 40;
    	System.out.println("My Weekly Income = " +calculateWeeeklyIncome );
    }
}