package session4_assignment2;

//A subclass which extends for vehicle

public class Car extends Vehicle{
	
	int CC;
	int gears;
	
	void attributescar(){
		
		   // The subclass refers to the members of the superclass

		System.out.println("Colour of car : " + colour);
		System.out.println("Speed of car : " + speed);
		System.out.println("Size of car : " + size);
		System.out.println("CC of car : " + CC);
		System.out.println("No of gears of car : " + gears);
	}

}

