import java.util.ArrayList;


public class Queue {
	
	int n;
	int max;
	int count = 0;
	ArrayList<Integer> lst = new ArrayList<Integer>();
	
	public Queue() {
		n = 50;
	}
	
	public Queue(int size) {
		this.max = size;
	}
	
	//Adaugare element
	
	public void push(int n) {
		lst.add(n);
		System.out.println("Element: " + n) ;
		this.n = n + 1;
		this.count ++;
		
	}
	
	//Stergerea Element
	public void pop() {
		lst.remove(1);
		this.n = n -1;
		this.count --;
		System.out.println("I deleted an item");
	}
	
	//Empty
	public void empty() {
        if (this.count == 0)
            System.out.println("The List is empty");

	}
	
	//Full 
	public void full() {
		if(this.count == this.max)
			System.out.println("The list is full");
		else
			System.out.println("The list is not full, and she has " + lst.size() + " elements.");
	}
}

