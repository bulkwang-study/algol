public class StackSample{
	Node last;

	public void add(Node newNode){
		newNode.prev = this.last;
		this.last = newNode;
	}
	
	public Node pop(){
		Node tmp = this.last;
		this.last = this.last.prev;
		return tmp;
	}
	
	public static void main(String[] args) {
		StackSample s = new StackSample();
		s.add(new Node(1));
		s.add(new Node(3));
		s.add(new Node(5));
		s.add(new Node(7));
		s.add(new Node(9));
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}
}

class Node{
	int number;
	Node prev;
	
	public Node(int number){
		this.number = number;
	}
	
	public String toString(){
		return "" + this.number;
	}
}