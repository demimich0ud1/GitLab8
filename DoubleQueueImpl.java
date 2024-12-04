import java.io.PrintStream;
import java.util.NoSuchElementException;

public class StringStackImpl implements StringStackImpl{
	private static class Node{
		double data;
		Node next;
			
		Node(Double data){
			this.data = data;
			this.next = null;
			}
	}
}