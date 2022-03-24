import java.util.Scanner;

public class DuplicateRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char str[] = new char[40];
		String s;
		System.out.println("Enter the String : ");
		s = sc.nextLine();
		str = s.toCharArray();
		int n = str.length;
		for(int i=0 ; i<=n;i++) {
			for(int j=i+1 ; j<=n-1;j++) {
				if(str[i] == str[j]) {
					repl(str,j);
					n--;
					j=i+1;;
					
				}
			}
		}
		System.out.println(n);
		System.out.println(str);
		

	}

	private static void repl(char[] str, int j) {
		int i;
		for(i = j; i<str.length-1;i++) {
			str[i] = str[i+1];
		}
		str[i]='\0';
		
	}

}
