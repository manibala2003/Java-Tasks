package comparator;

import java.util.*;


class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Marks: " + marks + ")";
    }
}
class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Alphabetical order
    }
}

class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age); // Ascending order
    }
}

class SortByMarks implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.marks, s1.marks); // Descending order
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22, 85));
        students.add(new Student("Bob", 20, 90));
        students.add(new Student("Charlie", 23, 80));

        System.out.println("Original List:");
        System.out.println(students);

        // Sort by Name
        Collections.sort(students, new SortByName());
        System.out.println("\nSorted by Name:");
        System.out.println(students);

        // Sort by Age
        Collections.sort(students, new SortByAge());
        System.out.println("\nSorted by Age:");
        System.out.println(students);

        // Sort by Marks
        Collections.sort(students, new SortByMarks());
        System.out.println("\nSorted by Marks:");
        System.out.println(students);
    }
}

