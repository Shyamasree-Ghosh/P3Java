import java.util.Scanner;

public class Print_Repeted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int i = 0, j=0, count=0;
		System.out.println("Enter the string :");
		s = sc.nextLine();
		char str[] = new char[s.length()];
		str = s.toCharArray();
		for(i = 0; i<s.length(); i++) {
			for(j = i+1; j<s.length(); j++ ) {
				if(str[i] == str[j] && str[j]!='X') {
					count++;
					str[j] ='X';
			}
			
			}
		}
		
		System.out.println(count);

	}

}
