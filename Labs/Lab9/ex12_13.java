
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex12_13 {

	public static void main(String[] args) {

        File filename = new File(args[0]);

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                String s = input.nextLine();
                lines++;
                characters += s.length();
                String[] split = s.split(" ");
                for (String word : split) {
                    words++;
                }
            }

        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}
