import java.util.Arrays;

public class ex10_9 {

	public static void main(String[] args) {
		
		Course c = new Course("NewCourse");
		
		c.addStudent("Tom");
		c.addStudent("Jerry");
		c.addStudent("CreativeName");
		
		c.dropStudent("CreativeName");
	
		System.out.println(Arrays.toString(c.getStudents()));
	}

}
