import java.util.Scanner;

public class SplitUDF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s= sc.nextLine();
		
		int i=0,j=0,c=0,k=0,len=0;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')
				len++;
		}
		
		String store[] = new String[len+1];
		for(i = 0,j=0; i<s.length();i++) {
			if (s.charAt(i)==' ')
			{
				
				store[j] = s.substring(c,i);
				
				c=i+1;
				j++;
			}
		}
		
			store[j]=s.substring(c,i);
		
		for(i=0;i<store.length;i++) {
			System.out.println(store[i]);
		}
		int a[] = new int[len+1];
		for(i=0;i<store.length;i++) {
			a[i] = store[i].length();
		}
		for(i=0;i<len+1;i++) {
		System.out.println(a[i]);
		}
		
		int max=a[0];
		c=0;
		for(i=0;i<a.length;i++) {
			if(a[i]>max) {
				max= a[i];
				c=i;
			}
		}
		System.out.println(store[c]);

	}

}
