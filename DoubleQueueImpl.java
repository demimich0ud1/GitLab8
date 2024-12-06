import java.io.PrintStream;
import java.util.NoSuchElementException; 

public class DoubleQueueImpl implements DoubleQueue {
	private static class Node{
		double data;
		Node next;
		
		Node(double data){
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	/** public constructor for empty queue**/
	public DoubleQueue(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void put(double item){		
		Node newNode = new Node(item);
		if (isEmpty()){
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public double get(){
		if (isEmpty()){
			throw new NoSuchElementException("The Queue is Empty");
		}
		double data = head.data;
		head = head.next;
		if (head == null){
			tail = null;
		}
		size--;
		return data;
	}
	
	public double peek(){
		if (isEmpty()){
			throw new NoSuchElementException("The Queue is Empty");
		}
		return head.data;
	}
	
	public void printQueue(PrintStream stream){
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