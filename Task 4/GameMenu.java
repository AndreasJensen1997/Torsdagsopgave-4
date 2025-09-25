import java.util.ArrayList;
import java.util.Scanner;

class GameMenu {
	
private ArrayList<String> actions;

GameMenu(ArrayList<String> actions) {
this.actions = actions;
}

public void displayMenu(){
System.out.print(actions);
}


public String promptUser(){
System.out.print("Type a number to choose an action" + "\n" + String.join("\n",actions));

Scanner scanner = new Scanner(System.in);
	String choice = scanner.nextLine();
		return choice;


}


}