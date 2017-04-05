
import java.util.ArrayList;

// JA: There is no class to thest this
public class ex11_5 {

	public static void main(String[] args) {
		

	}
	
	class Course {

	    private String courseName;
	    private ArrayList<String> students = new ArrayList<>();

	    public Course(String courseName) {
	        this.courseName = courseName;
	    }

	    public void addStudent(String student) {

	        students.add(student);
	    }

	    public String[] getStudents() {
	        return students.toArray(new String[students.size()]);
	    }

	    public int getNumberOfStudents() {
	        return students.size();
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public void dropStudent(String student) {

	        students.remove(student);

	    }

	    public void clear(){
	        students.clear();
	    }

	}

}
