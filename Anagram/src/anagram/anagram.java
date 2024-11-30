package anagram;

import java.util.Scanner;

class anag{
	boolean anagram(String a,String b){
		if(a.length()!=b.length()) {
			return false;
		}
		int[] n=new int[26];
        for(int i=0;i<a.length()-1;i++){
            n[a.charAt(i)-'a']++;
            n[b.charAt(i)-'a']--;
        }
        boolean bool = true;
        for(int i=0;i<n.length-1;i++){
            if(n[i]!=0){
            	bool = false;
                break;
            }
        }
        return bool;
	}
}
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b = sc.nextLine();
		anag ag = new anag();
		boolean c = ag.anagram(a, b);
		if(c) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		

	}

}
