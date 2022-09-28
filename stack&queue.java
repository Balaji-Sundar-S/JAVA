import java.util.Scanner;
public class Stack_Queue {
	public static void main (String args[]) {
		int op;
		while (true) {
			System.out.println("1. stack\n2. queue\n3. exit\nenter your choice : ");
			Scanner sc = new Scanner (System.in);
			op = sc.nextInt();
			switch (op) {
				case 1 :
					Stack obj1 = new Stack();
					obj1.stack();
					break;
				case 2 :
					Stack obj2 = new Stack();
					obj2.queue();
					break;
				case 3 : 
					System.exit(0);
			}
		}
	}
}
public class Stack extends Queue {
	public void stack() {
		Scanner sc = new Scanner (System.in);
		int ch, ele, n, top = -1, size, arr[], i;
		System.out.println("enter size of stack : ");
		n = sc.nextInt();
		arr = new int [n];
		while(true) {
			System.out.println("\n1. push\n2. pop\n3. display\n4. exit");
			System.out.println("enter your choice : ");
			ch = sc.nextInt();
			switch (ch) {
				case 1 :
					if (top == n) {
						System.out.println("stack is full...");
					}else {
						System.out.println("enter inserting element : ");
						ele = sc.nextInt();
						top++;
						arr[top] = ele;
					}
					break;
				case 2:
					if (top == -1) {
						System.out.println("stack is empty...");
					}else {
						System.out.println("deleting element : " +arr[top]);
						top--;
					}
					break;
				case 3:
					if (top == -1) {
						System.out.println("stack is empty...");
					}else {
						System.out.println("stack content is : ");
						for (i=0; i < top+1; i++) {
							System.out.println(arr[i]);
						}
					}
					break;
				case 4 :
					return;
			}
		}
	}	
}
public class Queue {
	   public void queue() {
		   Scanner sc = new Scanner (System.in);
		   int ch, ele, n, rear = -1, front = 0, arr[], i;
		   System.out.println("enter queue size : ");
		   n = sc.nextInt();
		   arr = new int[n];
		   while(true) {
			   System.out.println("\n1. insert\n2. delete\n3. display\n4. exit");
			   System.out.println("enter your choice : ");
			   ch = sc.nextInt();
			   switch (ch) {
			   		case 1 :
			   			if (rear == n) {
			   				System.out.println("queue is full...");
			   			}else {
			   				System.out.println("enter inserting element : ");
			   				ele = sc.nextInt();
			   				rear++;
			   				arr[rear] = ele;
			   			}
						break;
					case 2:
						if (rear == -1) {
							System.out.println("queue is empty...");
						} else {
							System.out.println("deleting element : " +arr[front]);
							front++;
						}
						break;
					case 3:
						if (rear == -1) {
							System.out.println("queue is empty...");
						}else {
							System.out.println("queue content is : ");
							for (i = front; i<rear+1; i++) {
								System.out.println(arr[i]);
							}
						}
						break;
					case 4 :
						return;
			   }
		   }
	   }
}
