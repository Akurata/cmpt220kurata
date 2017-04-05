
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ex12_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the word to be romved from the file:");
		String nameRemove = input.nextLine();
		
		System.out.println("Enter the file name it should be removed from");
		String fileName = input.nextLine();
		
		File file = new File(fileName);
		
		nameRemove = nameRemove.replaceAll(args[0], "");
		
		try {
			PrintWriter output = new PrintWriter(fileName);
			System.out.println(nameRemove);
		    output.write(nameRemove);
		    output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.print("Done.");
       
	}

}
