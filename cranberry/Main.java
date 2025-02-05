import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
// 		calling my methods in the main method
		Addition();
		Guessnum();
		positivenum();
		printy();
	}
	
	public static void Addition() {
	   // creating a random generator and a scanner to read user inputs
	    Random riri = new Random();
		Scanner ruru = new Scanner(System.in);
	    int rand1 = riri.nextInt(10);
		int rand2 = riri.nextInt(10);
		
		System.out.printf("What is %d + %d? ",rand1, rand2);
		
		int num = ruru.nextInt();
		// while the user's input is not the correct answer it will print
		while (num != rand1+rand2) {
		    System.out.printf("Wrong answer. Try again. What is %d + %d? ",rand1, rand2);
		    num = ruru.nextInt();
		}
		// prints this if it skips the loop or finishes the loop
		System.out.print("You got it!\n\n\n");
	    
	}
	public static void Guessnum() {
	    Random riri = new Random();
		Scanner ruru = new Scanner(System.in);
	    int rand3 = riri.nextInt(101);
		
		System.out.print("Guess a magic number between 0 and 100!!!");
		System.out.print("\n\n\nEnter your guess!!! ");
		
		int num1 = ruru.nextInt();
		// while the user's input does not equal the random number between 0-100
		while (num1 != rand3) {
		    if (num1 > rand3){System.out.print("\n\nYour guess is too high! ");}
		    else {System.out.print("\n\nYour guess is too low! ");}
		    num1 = ruru.nextInt();
		}
		System.out.printf("Yes, the number is %d", num1);
	    
	}
	public static void positivenum() {
	    Scanner ruru = new Scanner(System.in);
	    System.out.print("\n\n\nEnter a positive number: ");
		int num2 = ruru.nextInt();
		// while the number is less than 0 it will print
		while (num2 < 0) {
		    System.out.print("\n\nInvalid input. Try again: ");
		    num2 = ruru.nextInt();
		}
		// prints this if it skips the loop or finishes the loop
		System.out.printf("You entered: %d\n\n", num2);
	    
	}
	public static void printy() {
	    // prints 1 through 20 as long there is a remainder when i is divided by 3
    	for (int i=1; i<21; i++) {
    	    while (i % 3 != 0) {
    	        System.out.println(i);
    	        i++;
    	    }
	    }
	    
	}
}


    
