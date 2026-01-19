package dsa.stack;

public class Stack_program {
	int[] stack;
	int top=-1;
	public Stack_program(int size) {
		stack=new int[size];
	}
	
	public boolean isEmpty() {
		return top==-1;	
	}
	
	public boolean isFull() {
		return top==stack.length-1;
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
		
			stack[++top]=value;
			System.out.println("inserted value "+value+" in stack");
		}
	}
	public void pop() {
		if(isEmpty()) {
	       System.out.println("Stack is empty");
		}
		else {
			int value=stack[top--];
			System.out.println("value fetched is "+value);
		}
		
	}
	public void peek() {
		if(isEmpty()) {
			  System.out.println("Stack is empty");
		}
		else {
			System.out.println("the peek element is  "+stack[top]);
		}
		
	}
	public void delete() {
		stack=null;
		System.out.println("Stack deleted");
		
	}
	
	public static void main(String[] args) {
		Stack_program stack=new Stack_program(5);
		System.out.println("PUSH OPERATION");
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("\nPOP OPERATION");
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("\nPEEK OPERATION");
		stack.peek();
		System.out.println("\nDELETE OPERATION");
		stack.delete();
	}
}
