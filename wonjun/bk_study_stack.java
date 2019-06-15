package bj;

import java.util.ArrayList;
import java.util.List;

class Stack{
	List stack;
	
	Stack(){
		this.stack = new ArrayList<Integer>();
	}
	
	void push(int num) {
		stack.add(num);
	}
	
	int pop() {
		if(stack.size() == 0) {
			System.out.println("Stack is empty!");
			return -999;
		}else {
			int lastIndex = stack.size()-1;
			int lastNum = (int) stack.get(lastIndex);
			stack.remove(lastIndex);
			return lastNum;
		}
	}
	
	void print(List stackTest) {
		System.out.println(stackTest);
	}
}

public class bk_study_stack {
	public static void main(String[] args) {
		Stack stackTest = new Stack();
		stackTest.push(1);
		stackTest.push(2);
		stackTest.push(3);
		stackTest.pop();
		stackTest.push(4);
		stackTest.print(stackTest.stack);
	}
}
