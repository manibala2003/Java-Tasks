package exception;

import java.util.*;


class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
class AgeValidator{
	void checkage(int n) {
			try {
				if(n<=0||n>=150) {
					throw new Exception("Age should be greater than 1");
				}else {
					System.out.println("Poceed");
				}
			}catch (Exception e) {
					System.out.print(e);
				}
		
	}
}


public class exception {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		AgeValidator age = new AgeValidator();
		age.checkage(a);
	
	}

}
