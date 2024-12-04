import java.io.PrintStream;
import java.util.NoSuchElementException;

public class StringStackImpl implements StringStackImpl{
	private static class Node{
		String data;
		Node next;
			
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
}