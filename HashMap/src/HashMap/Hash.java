package HashMap;
import java.security.Key;
import java.util.*;
class studentGrade{
	HashMap<String,Integer> student = new HashMap<>();
	void addorUpdateStudent(String str,int n) {
		if(student.containsKey(str)) {
		student.put(str, n);
		System.out.println("Student updated successfully");
		}else {
			student.put(str, n);
			System.out.println("Student added successfully");
		}
	}
	void retriveStudentgrade(String str) {
		if(student.containsKey(str)) {
			System.out.println("The grade of "+str+" are :"+student.get(str));
		}else {
			System.out.println("Student name not found");
		}
	}
	void display() {
		for(String i:student.keySet())
		System.out.println(i+" : "+student.get(i));
}
	void sort() {
		TreeMap<String, Integer> tree = new TreeMap<>();
		for(String i:student.keySet()) {
			tree.put(i, student.get(i));
		}
		System.out.println("Sorted List");
		for(String i:tree.keySet()) {
			System.out.println(i+" : "+tree.get(i));
		}
	}
}
public class Hash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		studentGrade grade = new studentGrade();
		int n;
		do {
			System.out.println("1.Add/update student Grade\n2.Retrive Dtudent grade\n3.Display all students and Grade\n4.Sort students\n5.Exit");
			System.out.println("Enter your choice: ");
			n = sc.nextInt();
			switch (n) {
			case 1: 
				System.out.println("Enter the Student name: ");
				String name = sc.next();
				System.out.println("Enter Student Grade: ");
				int mark = sc.nextInt();
				grade.addorUpdateStudent(name,mark);
				break;
			case 2:
				System.out.println("Enter student name: ");
				name = sc.next();
				grade.retriveStudentgrade(name);
				break;
			case 3:
				System.out.println("List of students");
				grade.display();
				break;
			case 4:
				System.out.println("Sorted List");
				grade.sort();
				break;
			case 5:
				System.out.println("Exiting");
				break;
			}
		}while(n!=5);				
}
}



