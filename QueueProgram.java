package dsa.queue;

public class QueueProgram {
 int[] queue;
 int top,bottom;
 public QueueProgram(int size) {
	 
	 queue=new int[size];
	 top=bottom=-1;
 }
 public Boolean isFull() {
	 return top==queue.length-1;
	
}
 public boolean isEmpty() {
	 return top==-1 || bottom==queue.length;
	
}
 public void enqueue(int data) {
	 if(isFull()) {
		 System.out.println("Queue is Full");
	 }
	 else if(bottom==-1) {
		 bottom=0;
		 queue[++top]=data;
		 System.out.println("Value "+data+" inserted");
		 
	 }
	 else {
		 queue[++top]=data;
		 System.out.println("Value "+data+" inserted");
		 
	 }
}
 public void dequeue() {
	 if(isEmpty()) {
		 System.out.println("Queue is Empty");
	 }
	 else {
		 int value=queue[bottom];
		 bottom++;
		 if(top>bottom) {
			 top=bottom=-1;
		 }
	System.out.println("the value fetched is "+value);
}
 
 }
 public void peek() {
	 if(isEmpty()) {
		 System.out.println("Queue is Empty");
	 }
	 else {
		 System.out.println("The Peek element is "+ queue[bottom]);
		
	 }
	 

 }
 public void delete() {
	 queue=null;
	 System.out.println("Queue is deleted");
	
}
 public static void main(String[] args) {
	QueueProgram queue=new QueueProgram(4);
	queue.enqueue(10);
	queue.enqueue(20);
	queue.enqueue(30);
	queue.enqueue(40);
	queue.dequeue();
	queue.dequeue();
	queue.dequeue();
	queue.dequeue();
	queue.enqueue(10);
	queue.enqueue(60);
	queue.enqueue(50);
	queue.enqueue(60);
	queue.peek();
}
}



