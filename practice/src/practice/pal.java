package practice;
import java.util.*;

public class pal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int c=0;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					c++;
					break;
				}
			}
			if(c==0) {
				int s=0;
				for(int k=0;k<n;k++) {
					if(a[k]==a[i]) {
						s++;
					}
				}
				System.out.println(a[i]+" - "+s);
			}	
		}
	}
}
