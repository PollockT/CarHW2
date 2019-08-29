package Car;

import java.util.Scanner;
import java.util.logging.*;

public class MyCar {
		

	private int odometer = 0;
	private int tackometer = 0;
	private int speedCurrent = 0;
	private final int  YEAR = 2016;
	
	private int[] inGear = {1,2,3,4,5,6,7,8};

	
	private String type = "RC 200t";
	private String model = "Lexus";
	
	private  Boolean OnorOff = false; //true = on and false = off
	
	Scanner sc = new Scanner(System.in);
	/**
	 * class constructor
	 */
	public MyCar() {
		
	}
	
	public void ignition(){
		System.out.println("Would you like to start your car?");
		turnOn(OnorOff);
		
		if(OnorOff == true) {
			System.out.println("Vrooom, your engine is turned on.");
			//TODO: Do loop to check for continious true state that engine is on
			System.out.println("What would youl like to do now?");
			System.out.println("You can [A]ccelerate, [B]rake, [S]peed check, [G]ear check, [O]dometer check");
			System.out.println("[T]urn car off, [C]heck car stats => ");
			Scanner sc = new Scanner(System.in);
			String action = sc.next();
			
			
			if(action.equals("A")|| action.equals("a")) {
				System.out.print("How fast do you want to go in miles per hour? => ");
				Scanner sc1 = new Scanner(System.in);
				int gasPedal = sc1.nextInt();
				sc1.close();
				System.out.println("Accelerating " + gasPedal + " mph!");
				accelerateSpeed(gasPedal);
			}
			else if(action.equals("B") || action.equals("b")) {
				System.out.print("Brake by how many mph? => "); 
				Scanner sc1 = new Scanner(System.in);
				int brakePedal = sc1.nextInt();
				sc1.close();
				brakeSpeed(brakePedal);
				System.out.println("Slowing by " + brakePedal + " mph!");
				
			}
			else if(action.equals("S") || action.equals("s")) {
				toStringSpeed();
			}
			else if(action.equals("G") || action.equals("g")) {
				toStringGear();
			}
			else if(action.equals("O") || action.equals("o")) {
				toStringOdometer();
			}
			else if(action.equals("T") || action.equals("t")){
				turnOff();
			}sc.close();
		}
		else if(OnorOff == false) {
			System.out.println("Your car isn't started, its not goin anywhere!");
		}
		
	}
	
	/**
	 * Turns car off
	 * @return sets engine state to false
	 */
	public boolean turnOff() {
		return OnorOff = false;
	}
	
	/**
	 * Method to make the car accelerate faster in units of miles per hour
	 * @param x how much your asking the car to accelerate
	 * @return speed the car is traveling
	 */
	public int accelerateSpeed(int x) {
		int speed = getSpeedCurrent();
		//TODO: set speedCurrent with increase
		//TODO: return that amount to 		
		
		return x;
	}
	
	/**
	 * Method to make the car slow down in units of miles per hour
	 * @param x how much to slow the car down
	 * @return speed the car is traveling
	 */
	public int brakeSpeed(int x) {
		//TODO: slow down by a certain amount
		//TODO: set speedCurrent to the slowed rate
		//TODO: return that amount to x

		return x;
	}
	
	/**
	 * Method that increases the odometer measured in miles, will not roll back because 
	 * that's naughty and illegal!
	 * @param x the amount of miles to add
	//TODO:CHECK VALIDITY* @return total miles traveled?
	 */
	public int odometerIncrease(int x) {
		//TODO: get speed 
		//TODO: time traveled
		return x;
	}
	
	/**
	 * Method that contains the logic of which gear to keep the car in as if it's automatic
	 * @param x current gear
	 * @param y current tachometer
	 */
	public void gearShift(int x, int y) {
		//TODO: get tachometer and current gear, determine if shift up or shift down
	}
	
	/**
	 * Method for turning the car on so other attributes can change
	 * @param x is attribute to turn car on or off
	 * @return boolean for true or false, default manually set false so car will be off!
	 */
	public boolean turnOn(Boolean x) {
		System.out.println("Turn car on? Y/N? ");
		
		Scanner sc = new Scanner(System.in);
		String ignition = sc.nextLine();
		
		
		if(ignition.equals("Yes") || ignition.equals("Y") ||ignition.equals("yes") || ignition.equals("y")){
			System.out.println("Car Started!");
			return  OnorOff = true;
		}else if(ignition.equals("No") || ignition.equals("N") || ignition.equals("no") || ignition.equals("n")) {
			System.out.println("Car Not Started!");
			return OnorOff = false;
		}else {
			System.out.println("Unrecognized command");
			return false;
		}
		
	}
	
	public void toStringOdometer() {
		System.out.println(getOdometer() + " miles");
	}
	
	/*
	 * Method pulls and prints which gear the car is in
	 */
	public void toStringGear() {
		System.out.println(getInGear()+" gear");
	}
	
	/**
	 * Method to print out current traveling speed
	 */
	public void toStringSpeed() {
		System.out.println(getSpeedCurrent() + " MPH");
	}

	//setters and getters block, nothing interesting here
	public String getModel(){return model;}
	public void setModel(String model){this.model = model;}
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	public int getYear(){return YEAR;}//NO SETTER, attribute set to FINAL
	public int getSpeedCurrent(){return speedCurrent;}
	public void setSpeedCurrent(int speedCurrent){this.speedCurrent = speedCurrent;}
	public int[] getInGear(){return inGear;}
	public void setInGear(int[] inGear) {this.inGear = inGear;}
	public int getOdometer(){return odometer;}
	public void setOdometer(int odometer){this.odometer = odometer;}
	public int getTackometer() {return tackometer;}
	public void setTackometer(int tackometer) {this.tackometer = tackometer;}
	
	
}
