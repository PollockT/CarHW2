package Car;
	
	public class MyCar {
		
	
	    private boolean engineRunning = false;
	    private int speedCurrent = 0;
	    private int odometer;
	    private int currentGear;
	    private String make;
	    private String model;


	    /**
	     * Constructor for MyCar Class, requires following attributes
	     * @param odometer the amount of miles on the car
	     * @param make the make of the car, ie Ford, or Chevy
	     * @param model the type of car, like F150 or C320
	     */
	    public MyCar(int odometer, String make, String model) {
	        this.odometer = odometer;
	        this.make = make;
	        this.model = model;

	    }

	    /**
	     * Method directly controls what gear the car is in, like an automatic car.
	     * @param x is the current speed
	     * @return the current gear
	     */
	    public int checkGear(int x){
	        final int FIRST_GEAR_START = 0;
	        final int FIRST_GEAR_END = 30;
	        final int SECOND_GEAR_START = 31;
	        final int SECOND_GEAR_END = 45;
	        final int THIRD_GEAR_START = 46;
	        final int THIRD_GEAR_END = 60;
	        final int FOURTH_GEAR_START = 61;
	        final int FOURTH_GEAR_END = 73;
	        final int FIFTH_GEAR_START = 74;
	        final int FIFTH_GEAR_END = 89;
	        final int SIX_GEAR_START = 90;
	        final int SIX_GEAR_END = 120;

	        if(getSpeedCurrent() >= FIRST_GEAR_START  && getSpeedCurrent() <= FIRST_GEAR_END){
	            setCurrentGear(1);
	        }if(getSpeedCurrent() >= SECOND_GEAR_START && getSpeedCurrent() <= SECOND_GEAR_END){
	            setCurrentGear(2);
	        }if(getSpeedCurrent() >= THIRD_GEAR_START && getSpeedCurrent() <= THIRD_GEAR_END){
	            setCurrentGear(3);
	        }if(getSpeedCurrent() >= FOURTH_GEAR_START && getSpeedCurrent() <= FOURTH_GEAR_END){
	            setCurrentGear(4);
	        }if(getSpeedCurrent() >= FIFTH_GEAR_START && getSpeedCurrent() <= FIFTH_GEAR_END){
	            setCurrentGear(5);
	        }if(getSpeedCurrent() >= SIX_GEAR_START && getSpeedCurrent() <= SIX_GEAR_END){
	            setCurrentGear(6);
	        }
	       return x;
	    }

	    /**
	     * Method prints out the current gear the class is in.
	     */
	    public void toStringGear() {
	        checkGear(getSpeedCurrent());
	        System.out.println("Your in gear " + getCurrentGear());
	    }
	    /**
	     * Method that prints the speed the car is currently traveling at.
	     */
	    public void toStringSpeed(){

	        System.out.println("Your current speed is " + getSpeedCurrent() + "mph!");

	    }

	    /**
	     * Method to print out the current mileage on the car.
	     */
	    public void toStringOdometer(){
	        System.out.println("The current mileage on the car is " + getOdometer() + " miles.");
	    }

	    /**
	     * Method allows the object to de-accelerate speed, and then adds it to the current speed while
	     * printing to the screen only the amount of the de-acceleration
	     * @param x brake amount
	     * @return final speed
	     */
	    public int brakeSpeed(int x){
	        System.out.println("Braking down " + x + "mph!");
	        setSpeedCurrent(getSpeedCurrent() - x);
	        return x;
	    }

	    /**
	     * Method allows the object to accelerate speed, and then adds it to the current speed while
	     * printing to the screen only the amount of the acceleration
	     * @param x acceleration
	     * @return final speed
	     */
	    public int accelerateSpeed(int x){
	        System.out.println("Accelerating up " + x + "mph!");
	        setSpeedCurrent(getSpeedCurrent() + x);
	        return x;
	    }

	    /**
	     * Method to turn car on and off using boolean types. Each call will flip the method's value
	     */
	    public void useIgnition(){
	        if (engineRunning == false){
	            engineRunning = true;
	            System.out.println("Vrrooommm! Car is on!");

	        }else if(engineRunning){
	            engineRunning = false;
	            System.out.println("Putter putter! Car is off!");

	        }
	    }

	    public void carStatus(){
	        System.out.println("Your car is traveling at " + getSpeedCurrent() + "mph.");
	        System.out.println("Your car is in gear " + getCurrentGear() + ".");
	        System.out.println("You have " + getOdometer() + "miles on the car.");
	        System.out.println("The car is a " + getModel() + " made by " + getMake());
	    }

	    //public boolean isEngineRunning() {return engineRunning;}
	    //public void setEngineRunning(boolean engineRunning){this.engineRunning = engineRunning;}
	    //public int setOdometer(int odometer){this.odometer = odometer;}
	    public int getOdometer(){return odometer;}
	    public int getSpeedCurrent(){return speedCurrent;}
	    public void setSpeedCurrent(int speedCurrent){this.speedCurrent = speedCurrent;}
	    public void setCurrentGear(int currentGear){this.currentGear = currentGear;}
	    public int getCurrentGear(){return currentGear;}
	    public String getMake(){return make;}
	    //public String setMake(String make){this.make = make;}
	    public String getModel(){return model;}
	    //public String setModel(String model){this.model = model;}
	}

