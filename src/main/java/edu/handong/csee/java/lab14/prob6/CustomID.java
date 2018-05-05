package edu.handong.csee.java.lab14.prob6;

public class CustomID {
	String name;
	String[] race = {"Vulcan", "Romulan", "Klingons"};
	int age, step = 0;
	
	public void setName(String name) throws Exception {
		if(name.length() < 5) 
			throw new Exception("Your name is short! Try again!");
		else {
			System.out.println("Name is valid\nName : " + name);
			step++;
		}
	}
	
	public void setAge(int age) throws Exception {
		//step = 1;
		if(age < 18) 
			throw new Exception("You are too young! Try again!");
		else {
			System.out.println("Age is valid\nAge : " + age);
			step++;
		}
	}
	
	public void setRace(String str) throws Exception {
		//step = 2;
		for(int i = 0; i < race.length; i++) {
			if(race[i].equals(str)) {
				System.out.println("Race is valid\nRace : " + race[i]);
				step = 0;
				break;
			}
			throw new Exception("Human! Try again.");
		}
	}
	
	public int getStep() {
		return step;
	}
	

	
}
