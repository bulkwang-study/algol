public class QueueSample{
	Node first;
	Node last;
	
	void add(Node newNode){
		if (this.last != null){
			this.last.next = newNode;
		} 
		
		this.last = newNode;
		if (this.first == null){
			this.first = last;
		}
		
	}
	
	Node pop(){
		Node tmp = this.first;
		this.first = this.first.next;
		return tmp;
	}
	
	public static void main(String[] args) {
		QueueSample q = new QueueSample();
		q.add(new Node(1));
		q.add(new Node(4));
		q.add(new Node(3));
		q.add(new Node(8));
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		
	}
}

class Node{
	int number;
	Node next;
	
	Node(int number){
		this.number = number;
	}
	
	public String toString(){
		return "" + this.number;
	}
}