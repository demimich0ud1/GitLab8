import java.io.PrintStream;
import java.util.NoSuchElementException;

public class DoubleQueueImpl implements DoubleQueue{
	private static class Node{
		double data;
		Node next;
			
		Node(Double data){
			this.data = data;
			this.next = null;
			}
	}
	private Node head, tail;
	private int size;

	public DoubleQueueImpl(){
		head = tail = null;
		size = 0;
	}

	@Override
	public boolean isEmpty(){
		return head == null;
	}
	@Override
	public void put(double item){
		Node newNode = new Node(item);
		if (isEmpty()){
			head = tail = newNode;\
		} else { 
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	@Override
	public double get(){
		if (isEmpty()){
			throw new NoSuchElementException("Queue is Empty"); 
		}
		double item = head.data;
		head = head.next;
		if (head == null){
			tail = null;
		}
		size--;
		return item;
	}

	
}











