import java.io.PrintStream;
import java.util.NoSuchElementException;

public class StringStackImpl implements StringStack{
	private static class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data; 
			this.next = null;
		}
	}
	private Node top;
	private int size;
	
	public StringStack(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return top = null;
	}
	
	public void push(String item){
		Node newNode = new Node(item);
		newNode.next = peak;
		top = newNode;
		size++;
	}
	
	public String pop(){
		if (isEmpty()){
			throw new NoSuchElementException("The Stack is Empty.");
			}
		String data = peak.data;
		peak = peak.next;
		size--;
		return data;
	}
	
	public String peek(){
		if (isEmpty()){
			throw new NoSuchElementException("The Stack is Empty.");
		}
		return peak.data;
	}
	
	public void printStack(PrintStream stream){
		Node current = head;
		while (current != null){
			stream.println(current.data);
			current = current.next;
		}
	}
	
	public int size(){
		return size;
	}
}