package edu.handong.csee.java.lab14.prob6;

public class CustomID { //the class CustomID
	private String name; //declare String type instance variable name
	private String[] race = {"Vulcan", "Romulan", "Klingons"}; //initialize String type array race
	int age, step = 0; //declare instance variable age and initialize step value 0
	
	public void setName(String name) throws Exception { //this method checks name's length is smaller than 5 and set a name and ready to go to next step
		if(name.length() < 5)  //if name's length is smaller than 5
			throw new Exception("Your name is short! Try again!"); //notice about this situation
		else { //or not
			System.out.println("Name is valid\nName : " + name); //prints about name
			step++; //plus one step for next step
		}
	}
	
	public void setAge(int age) throws Exception { //this method checks age's value is smaller than 18 and set an age and ready to go to next step
		if(age < 18)  //if age value is smaller than 18
			throw new Exception("You are too young! Try again!"); //notice about this situation
		else { //or not
			System.out.println("Age is valid\nAge : " + age); //print about age
			step++; //plus one step for next step
		}
	}
	
	public void setRace(String str) throws Exception { //this method checks and print str value includes race and ready to go to setName step
		for(int i = 0; i < race.length; i++) { //repeat race's length times
			if(race[i].equals(str)) { //if race[i] value is same str value
				System.out.println("Race is valid\nRace : " + str); //print about str
				step = 0; //step is 0 for setName method
				break; //stop looping
			}
			throw new Exception("Human! Try again."); //if all race[i] value isn't same str value notice about this situation
		}
	}
	
	public int getStep() { //this method returns step
		return step; //returns step
	}
	

	
}
