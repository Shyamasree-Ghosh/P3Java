import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s= sc.nextLine();
		char str[] = new char[s.length()];
		str = s.toCharArray();
		int loc[] = new int[26];
		int roc[] = new int[26];
		for(int i=0,j=s.length()-1; i<j; i++,j--) {
			loc[s.charAt(i)-'a']++;
			roc[s.charAt(j)-'a']++;
			
		}
		
		for(int i=0;i<26;i++) {
			if(loc[i]!=roc[i]) {
				System.out.println("Both halves are Not equal");
				break;
			}
			else {
				System.out.println("Both halves are  equal");
			}
		}
		
  
	}

}
