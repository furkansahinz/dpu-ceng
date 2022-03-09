package ndk01;

import java.util.Scanner;

public class ConsoleIOv2 {

	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      System.out.print("How old are you? ");
	      int age = in.nextInt();
	      in.nextLine(); //workaround for the bug
	      System.out.print("What is your name? ");
	      String name = in.nextLine();
	      System.out.println("Hello, " + name + " " +
	    		  ". Next year, you'll be " + (age + 1) + ".");
	      in.close();
	}
}
