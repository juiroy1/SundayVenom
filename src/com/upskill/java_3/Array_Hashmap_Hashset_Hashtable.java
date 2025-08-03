package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		
		// Array store multiple data using index
		
		int age = 30;
		int [] ageVenom = new int[] {25, 32, 29, 23, 19, 18};
		
		//Array index               [0] [1] [2] [3] [4] [5]
		
		System.out.println ("Student Age: " + ageVenom[3]);
		System.out.println (" Total Student : " + ageVenom.length);

		
		String [] nameVenom = new String [] { "abcxyz","Jui", "Happy","Fokrul", "Sazu", "Fahim"};
		System.out.println ("Student Name: " + nameVenom[3]);
		System.out.println (" Total Student Name : " + nameVenom.length);
		
		// Multi-Dimentional Array
		int [][]ageVenom2D = {{ 25, 32, 29, 23, 19, 18},
				              {26,31,27,24}};
		System.out.println("Student Age 2d : " + ageVenom2D [0] [3]);
		
		
		
		// HashMap store multiple data using key - value pair , Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap < String, Integer>();
		
		Student.put("Abcxyz", 18);
		Student.put("Fahim", 20);
		Student.put("Jui", 23);
		Student.put("Fokrulz", 24);
		
		System.out.println("HashMap Student Age : "+ Student.get("Abcxyz"));
		
		// Country,Capital
		HashMap<String, String> Capital = new HashMap<String,String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		System.out.println("Capital City : " +Capital.get("BD"));
		
		// HashTable store multiple data using key- value pair, No duplicate,also is synchronized 
		Hashtable<String, String> Region = new Hashtable <String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Region: " + Region.get("BD"));
		
		//HashSet  store unordered collection containing unique value, Implement of Set interface
		
		
		HashSet<String> car = new HashSet<String>();
		
		car.add ("BMW");
		car.add ("Toyota");
		car.add ("Audi");
		car.add ("Ford");
		
		System.out.println("Car : " +car);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
				
		};
				
				
			
		
		
		
	}


