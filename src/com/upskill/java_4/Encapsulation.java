package com.upskill.java_4;

public class Encapsulation {
	
	// Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";       //write & read
	private int ssn = 124562;              // write only
	private String username = "juiroy";    // read only
	
	
	//Setter Method - name                 //set the date, write
	public void setName (String value) {
		name = value;
	}

  
    // Getter Method -name                 // get the data, read
    public String getName() {
    	return name;
   }

  //Setter Method - ssn                //set the date, write
  	public void setSSN (int value){
  		ssn = value;
  	}

    
      // Getter Method - username                 // get the data, read
      public String getUserName() {
      	return username;
    }



  public static void main(String[] args) {
	  Encapsulation obj = new Encapsulation();
	  
	 
	  obj.setName("upskill2");
	  System.out.println(obj.getName());
	  
	  obj.setSSN(684368486);
	  
	  System.out.println (obj.getUserName());
  }
	  
  }