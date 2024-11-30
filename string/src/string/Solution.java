package string;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        if(s.length()==0) {
        	System.out.println(0);
        	return;
        }
        s.trim();
        String[] sc = s.split("[^a-zA-Z]+"); 
        System.out.println(sc.length);
        
        for(String c: sc) {
        	System.out.println(c);
        }
        
        
    }
}

