package Email;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Pattern pattern = Pattern.compile("[a-zA-Z0-9._\\-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(s);
		if(matcher.find()) {
			System.out.println("Valid");
		}else {
			System.out.println("Not valid");
		}
	}

}
