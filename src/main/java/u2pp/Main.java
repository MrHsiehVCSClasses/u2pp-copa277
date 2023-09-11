package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * YOUR COMMENTS HERE
 * 
 * 
 * so what i am dong here is creating a new varrialbe for each new scanner input to be stored in so that icould use it later to construct the object
 * i then construct the gas added and distnace wnet as variabls and place holders for actual nubmers to go into so that i can use the method drive and add gas, to get the intended values
 * then i would just use the return methods to make it actually be typed, and this saves me time
 */

class Main {
  public static void main(String[] args) {
	  double apple;
	  String a;
	  String b;
	  double gasadded;
	  double distancewent;
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a fuel efficiency: ");
	  apple= Double.parseDouble(sc.nextLine());
	  System.out.print("Enter a make: ");
	  a=sc.nextLine();
	  System.out.print("Enter a model: ");
	  b=sc.nextLine();
	  Car wop=new Car(apple, a,b);
	  System.out.print("Enter amount of gas to add: ");
	  gasadded= Double.parseDouble(sc.nextLine());
	  wop.addGas(gasadded);
	  System.out.print("Enter distance to drive: ");
	  distancewent= Double.parseDouble(sc.nextLine());
	  wop.drive(distancewent);
	  System.out.print("Your " + wop.getMakeAndModel()+" currently has " + wop.getGasInTank()+ " gallons of gas left in the tank");
	  sc.close();
	  
	
	  
    //YOUR CODE HERE
    
  }
  
/**
   * YOUR COMMENT HERE
   * THIS ONE IS VERY SIMPLE, I AM JUST GOING TO HAVE TWO SEPEERATE VARIABLES THAT CREATE A SUBSTRING BASED ON THE INDEX FOR EACH WORD, AND BECUASE IT IS CONCLUSIVE I NEED TO MAKE THE END 1PLUS 1 AND FINALLY I AM JUST GOING TO RETURN THEM ADDED TOOGETHER THANK YOU 
   * @param word1 The first string to take a piece out of
   * @param start1 The starting index of the substring of word1
   * @param end1 The ending index of the substring of word1 (inclusive)
   * @param word2 The second string to take a piece out of
   * @param start2 The starting index of the substring of word2
   * @param end2 The ending index of the substring of word2 (inclusive)
   * @return YOUR COMMENT HERE
   */
  public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
	  String poop=word1.substring(start1, end1+1);
	  String poop2=word2.substring(start2, end2+1);
	  
	  
    //YOUR CODE HERE
    return poop+poop2;
  }
}