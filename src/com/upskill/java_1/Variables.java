package com.upskill.java_1;

public class Variables {

	public static void main(String[] args) {
		
		
		// Variables in Java
		//Instance or global variable
		//static variable
		//Local variable
		//Method parameter
		
		System.out.println(region);
		
		Variables obj = new Variables();
		System.out.println(obj.country);
		
		obj.nj("Jhon");
	}
	
	String country = "USA";
	static String region = "North America";
	
	public void ny() {
		String city = "Jackson Heights";
		String County = "Queens";
		
		public void nj(String mayor){
			String city = "Paterson";
			String county = "Essex";
			System.out.println(mayor);
		}
		
			public void CT () {
				String city = "Stamford";
				String county = "Fairfield";
			}
			
		}
	}

}
