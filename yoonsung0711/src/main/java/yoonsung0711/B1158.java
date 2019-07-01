public class B1158{
	public static void main(String[] args) {
		Node startNode; 
		Node prevNode;
		Node currNode;
		Node tmpNode;
		
		int NUM = 7;
		int STEP = 3;
		
		startNode = prevNode = currNode = new Node(0);
		
		int i = 0;
		while(++i <= NUM){
			currNode = new Node(i);
			prevNode.setNext(currNode);
			currNode.setPrev(prevNode);
			startNode.getNext().setPrev(currNode);
			currNode.setNext(startNode.getNext());
			prevNode = currNode;
		}
			
		currNode = startNode;
		i = 0;
		while(++i <= NUM){
			for (int j = 0; j < STEP; j++){
				currNode = currNode.getNext();				
			}
			System.out.println(currNode);
			tmpNode = currNode;
			currNode = null;
			currNode = tmpNode.del();
		}
	}
}

class Node {
	int num;
	Node prev;
	Node next;
	
	Node(int num){
		this.num = num;
	}
	
	void setPrev(Node node){
		this.prev = node;
	}
	void setNext(Node node){
		this.next = node;
	}
	
	Node del(){
		// System.out.println(this.prev.toString() + "->" + "(" + this + ")" + "->"+ this.next.toString());
		this.prev.setNext(this.next);
		this.next.setPrev(this.prev);
		return this.prev;
	}
	
	Node getPrev(){
		return this.prev;
	}
	
	Node getNext(){
		return this.next;
	}
	
	@Override
	public String toString(){
		return "" + this.num;
	}
}

		
