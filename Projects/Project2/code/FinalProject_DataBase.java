package DatabaseFinalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FinalProject_DataBase {
	
	private static String command = null;
	private static String name = null;
	static boolean running = true;
	static File f = new File("...\\cmpt220kurata\\Projects\\Project2\\data\\Database.txt");
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		Scanner file = new Scanner(f);
		ArrayList<String> memory = new ArrayList<String>();
		memory = readDatabase(memory);
		
		/**Initalize the Database + fill with known info**/
		Database db = new Database(memory, f);
		System.out.println("Accessing " + f.getName()); //Initialize the first name array
		System.out.println("Archived School Work Database: \nEnter a Command...");
		Scanner input = new Scanner(System.in);
		
		while (running) {
			/**Set Command and Name**/
			determineKeyWords(input.nextLine());
			/**Set Operator**/
			operator(db);
			
			/**Refreshed the ArrayList with any changes, generate new database object**/
			db.updateFile(db.getArray(), f); //Write to database.txt
			db = new Database(readDatabase(memory), f); //Make new Database Object
		}
		System.out.println("Stopped.");
	}
	
	private static ArrayList<String> readDatabase(ArrayList<String> memory) throws FileNotFoundException {
		Scanner file = new Scanner(f);
		memory = new ArrayList<String>();
		while (file.hasNextLine()) { //Fill ArrayList with values
			memory.add(file.nextLine());
		}
		file.close();
		return memory;
	}
	
	
	private static void determineKeyWords(String givenInput) {
		/**Set Command**/
		if (givenInput.equals("stop")){ //If "stop" dont collect any other info
			command = givenInput;
		}else if (givenInput.contains(" ")) {
			command = givenInput.substring(0, givenInput.indexOf(" ")); //Return first word as Keyword
		}else {
			command = givenInput;
			System.out.println("Enter a valid command.");
		}
		
		/**Set Name**/
		if (!command.equals("stop") && !command.equals("open") && !command.equals("remove") && !command.equals("add") && !command.equals("search")) { //If the name is not recogonized
			System.out.println("Enter a valid commmand.");
		}else {
			if (!command.equals("stop") || command.equals("open") || command.equals("remove") || command .equals("add") || command.equals("search")) {
				name = givenInput.substring(givenInput.indexOf(" ") + 1); //Return the remainder of the string
			}else if (command.equals("stop")) {
				//User enters 'stop' an no other parameter to end the program
			}
		}
	}
	
	
	/**Method used to call each function depending on Keyword**/
	private static void operator(Database db) throws IOException {
		if (command.equals("search")) { //Call Search
			db.search(name);
		}else if (command.equals("open")) { //Call Open
			if (db.search(name)) {
				db.open(name);
			}
		}else if (command.equals("remove")) { //Call Remove
			if (db.search(name)) {
				db.remove(name);	
			}
		}else if (command.equals("add")) { //Call Add
			db.add(name);
		}else if (command.equals("stop")) { //Stop the whole program
			running = false;
		}
		db.updateFile(db.getArray(), f);
	}
}
