package ArrayList;
import java.util.*;
class Array{
	ArrayList<String> studentList = new ArrayList<>();
	void addName(String str) {
		studentList.add(str);
	}
	void remove(String k) {
		if(studentList.contains(k)) {
			studentList.remove(k);
		}else {
			System.out.println("There is no such name");
		}
	}
	void display() {
		for(String i:studentList) {
			System.out.println(i);
		}
	}
	void nameCheck(String str) {
		if(studentList.contains(str)) {
			System.out.println("Name in the List");
		}else {
			System.out.println("Name Not in the list");
		}
	}
}
public class list {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array ar = new Array();
		int n;
		do {
			System.out.println("1.Insert\n2.Delete\n3.Display\n4.Check\n");
			System.out.println("Enter your choice: ");
			n = sc.nextInt();
			switch (n) {
			case 1: 
				System.out.println("Enter the name: ");
				String a = sc.next();
				ar.addName(a);
				break;
			case 2:
				System.out.println("Enter the name to remove: ");
				String rem = sc.next();
				ar.remove(rem);
				break;
			case 3:
				ar.display();
				break;
			case 4:
				System.out.println("Enter the name to check: ");
				rem = sc.next();
				ar.nameCheck(rem);
		}
		}while(n<=4);				
}
}
