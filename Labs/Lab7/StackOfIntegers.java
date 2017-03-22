
public class StackOfIntegers {

	 private int[] elements;
	    private int size;

	    public StackOfIntegers() { //Creating stack of 15
	        this(15);
	    }

	    public StackOfIntegers(int capacity) { //Construct a stack
	        elements = new int[capacity];
	    }

	    public int push(int value) { //Push new int
	        if (size >= elements.length) {
	            int[] temp = new int[elements.length * 2];
	            System.arraycopy(elements, 0, temp, 0, elements.length);
	            elements = temp;
	        }
	        return elements[size++] = value;
	    }

	    public int pop() { //Get first element from stack
	        return elements[--size];
	    }

	    public int peek() { //Return the top
	        return elements[size - 1];
	    }
	    
	    public boolean empty() { //Check if stack is empty
	        return size == 0;
	    }

	    public int getSize() { //Return stack size
	        return size;
	    }
	
	
}
