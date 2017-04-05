
import java.util.ArrayList;
import java.util.Scanner;

public class ex11_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) list.add(input.nextInt());

        System.out.println("Sorting numbers...");
        sort(list);
        System.out.println("Displaying numbers...");
        System.out.println(list);

    }

    public static void sort(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i);
            int index = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (min > list.get(j)) {
                    min = list.get(j);
                    index = j;
                }
            }

            if (index != i) {
                list.set(index, list.get(i));
                list.set(i, min);
            }
        }

    }

}


