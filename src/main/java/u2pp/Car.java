package u2pp;

/**
 * This class represents a car‘s gas intake and consumption
 * 
 * @author Connor Pak
 */
 
public class Car {
    private double gas=0; //The amount of gas in the tank
    private double mpg; //The fuel efficiency of the car in miles per gallon
    private String make; //The make of the car
    private String model; //The model of the car
    /**
     * YOUR COMMENT HERE
     * yes i see this, for the 
     * the efficency would be run as miles/gas
     * the amake and a moel would be formed as a string within my parameter
     * @param anEfficiency - the efficiency of the Car
     * @param aMake - the make of the Car
     * @param aModel - the model of the Car
     */ 
    public Car(double anEfficiency, String aMake, String aModel) {
    	mpg=anEfficiency;
    	make=aMake;
    	model=aModel;
       //YOUR CODE HERE 	
    }
    
    /**
     * YOUR COMMENT HERE
     * @param amount - the amount of gas to add to the tank
     */
    public void addGas (double amount) {
    	gas+=amount;
        //YOUR CODE HERE
    }
    
    /**
     * YOUR COMMENT HERE
     * @param distance - the distance that the car has driven
     */
    public void drive (double distance) {
        //YOUR CODE HERE
    	gas=gas-(distance/mpg);
    }
    
    /**
     * @return The amount of gas currently in the tank
     */
    public double getGasInTank() {
        //YOUR CODE HERE
        return gas;
    }
    
    /**
     * @return The make and model of the car
     */
     public String getMakeAndModel() {
       return make + " " + model;
     }
    
    /**
     * @return The efficiency of the car. Used for testing purposes
     */
    public double getMpg() {
        return mpg;
    }
}