import java.util.Scanner;

class Main{
	



public static void main (String [] args){
	


System.out.print("Please type your name");

Scanner scanner = new Scanner(System.in); 

String name = scanner.nextLine();

System.out.print ("hello " + name + "Please type your age");

int age = scanner.nextInt();

System.out.print("You are " + age + " years old.");


int yearsToRetire = 67 - age;

System.out.print(" You have " + yearsToRetire + " Years left until retirement.");


	}

}

	