package Queue;
import java.util.*;
class customerList{
	Queue<String> customer = new LinkedList<>();
	void addCustomer(String str) {
		customer.add(str);
	}
	void serveCustomer() {
		if(customer.isEmpty()) {
			System.out.println("Empty");
		}else {
			System.out.println(customer.remove());
		}
	}
	void viewQueue() {
		for(String i:customer) {
			System.out.println(i);
		}
	}
}
public class fifo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		customerList ar = new customerList();
		int n;
		do {
			System.out.println("1.Insert customer\n2.Serve Next Customer\n3.View Queue\n4.Exit");
			System.out.println("Enter your choice: ");
			n = sc.nextInt();
			switch (n) {
			case 1: 
				System.out.println("Enter the customer name: ");
				String a = sc.next();
				ar.addCustomer(a);
				break;
			case 2:
				ar.serveCustomer();
				break;
			case 3:
				System.out.println("The playlist Contains");
				ar.viewQueue();
				break;
			case 4:
				System.out.println("Exiting");
			}
		}while(n!=4);				
}
}

