package DatabaseFinalProject;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;


public class Database {
	
	File fileName;
	FileWriter fw;
	
	/**An ArrayList that keep a string record of all the file paths 
	 * saved in the database that are updated every time an operation is performed.**/
	ArrayList<String> a;
	
	
	/**A String Array that keeps record of just the file names,
	 * so that a user doesn't have to use the complete path name to perform an operation.**/
	String[] names;
	
	
	//Constructor
	Database(ArrayList<String> a, File fileName) throws IOException{ 
		this.a = a; //Values in file
		this.fileName = fileName; //Name of file
		createNameArray();
	}
		
	/**Updates the name array after a change is made**/
	public void createNameArray() {
		File temp = null;
		names = new String[a.size()];
		for(int i = 0; i < a.size(); i++) {
			temp = new File(a.get(i)); //Get file names from fake File
			names[i] = temp.getName(); //Fill names array with file names
		}
	}
	
	/**Updates the File Path array every time a change is made**/
	public void updateFile(ArrayList<String> a, File fileName) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)); //Establish Buffered Writer to write to file
		for (int i = 0; i < a.size(); i++) { //Write each line of the array
			bw.write(a.get(i).toString());
			bw.newLine();
		}
		bw.close(); //Commit the writing to the file
	}
	
	
	/**Getter to return the Path Array**/
	public ArrayList<String> getArray() {
		return a;
	}
	
	
	
	/**Search for file**/
	public boolean search(String fileName) {
		boolean found = false; //Initialize a test
		int foundAt = 0; //Records where the file is found
		for(int i = 0; i < a.size(); i++) {
			if (names[i].equals(fileName)) {
				found = true;
				foundAt = i;
			}
		}
		if (found) { //Different outcomes depending on return
			System.out.println("File found at index: " + foundAt);
			return true;
		}else {
			System.out.println("File not found.");
			return false;
		}
	}
	/**Open a File**/
	public void open(String fileName) throws IOException {
		int matchIndex = searchNameArray(fileName); //Search for file in array
		if (matchIndex == -1) {
			System.out.println("File not found");
		}else {
			Desktop.getDesktop().open(new File(a.get(matchIndex))); //Desktop Object to open file
			System.out.println("Success.");
		}	
	}
	/**Remove a File**/
	public void remove(String fileName) throws IOException {
		int matchIndex = searchNameArray(fileName); //Search for file in array
		if (matchIndex == -1) {
			System.out.println("File not found");
		}else {
			a.remove(matchIndex);
			createNameArray();
			
			File temp = new File(fileName);
			System.out.println(temp.getName() + " Successfully removed.");
		}
	}
	/**Add a File**/
	public void add(String fileName) throws IOException {
		int exists = searchNameArray(fileName);
		if (exists == -1) {
			a.add(fileName);
			createNameArray();
			
			File temp = new File(fileName);
			System.out.println( temp.getName()+ " Successfully added.");
		}else {
			System.out.println("File already exists at index: " + exists);
		}
		
	}

	/**Search Algorithm to find a match between the name array and overall ArrayList**/
	private int searchNameArray(String fileName) {
		int matchIndex = -1;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(fileName)) {
				matchIndex = i;
			}
		}
		return matchIndex;	
	}
}
