package LinkedList;
import java.util.*;
class Array{
	LinkedList<String> songList = new LinkedList<>();
	void addName(String str) {
		songList.add(str);
	}
	void remove(String k) {
		if(songList.contains(k)) {
			songList.remove(k);
		}else {
			System.out.println("There is no such song");
		}
	}
	void display() {
		for(String i:songList) {
			System.out.println(i);
		}
	}
	void peek() {
		System.out.println(songList.peek());
	}
}
public class list {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array ar = new Array();
		int n;
		do {
			System.out.println("1.Insert song\n2.Remove song\n3.Display\n4.Play first song\n5.Exit");
			System.out.println("Enter your choice: ");
			n = sc.nextInt();
			switch (n) {
			case 1: 
				System.out.println("Enter the song name: ");
				String a = sc.next();
				ar.addName(a);
				break;
			case 2:
				System.out.println("Enter the song name to remove: ");
				String rem = sc.next();
				ar.remove(rem);
				break;
			case 3:
				System.out.println("The playlist Contains");
				ar.display();
				break;
			case 4:
				System.out.println("The First song is :");
				ar.peek();
				break;
			case 5:
				return;
			}
		}while(n!=5);				
}
}

