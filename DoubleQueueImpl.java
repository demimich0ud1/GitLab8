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
	private Node peak;
	private int size;

	public StringStackImpl(){
		peak = null;
		size = 0;
	}

	@Override
	public boolean isEmpty(){
		return peak == null;
	}

	public void push(String item){
		Node newNode = new Node(item);
		newNode.next = top;
		peak = newNode;
		size++;
	}

	@Override
	public String pop(){
		if (isEmpty()){
			throw new NoSuchElementException("Stack is Empty"); 
		}
		String item = peak.data;
		peak = peak.next;
		size--;
		return item;
	}
}










