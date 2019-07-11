import java.util.Random;
import java.util.Scanner;

public class dice{
    public static void main(String[] args){
	Random r = new Random();
	System.out.println("What is your name?");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	
	System.out.println("Hello, " +str+ "!");
	System.out.println("Rolling the dice...");
	
	int die1 = 1 + r.nextInt(6);
	int die2 = 1 + r.nextInt(6);

	System.out.println("Die 1: " + die1);
	System.out.println("Die 2: " + die2);
	System.out.println("Total value: " + (die1+die2));

	if((die1+die2)>7){
	    System.out.println("You won");
	}else{
	    System.out.println("You lost");
	}
    }
}
