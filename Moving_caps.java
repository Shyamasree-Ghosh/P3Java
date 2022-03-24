import java.util.Scanner;

public class Moving_caps {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			char str[] = new char[10];
			char str2[] = new char[10];
			
			int i,j,k;
			
			String s;
			System.out.println("Enter the String : ");
			s = sc.nextLine();
			str = s.toCharArray();
			
			for(i=0,j=0; i<str.length;i++) {
				if(str[i]>=65 && str[i]<=90) {
					str2[j] = str[i];
					str[i] = '0';
					j++;
					
					}
				
				
			}
			
			System.out.println(str);
			System.out.println(str2);
			char result[] = new char[str.length+str2.length];
		
			System.arraycopy(str, 0, result, 0, str.length);
	        System.arraycopy(str2, 0, result, str.length, str2.length);
	        
	        System.out.println(result);
			
		for(i =0; i<result.length;i++ ) {
			
			if(result[i]=='0') {
				
			for(k=i+1,j=i; j<=result.length && k<result.length;j++,k++ ) {
					result[j] = result[k];
				}
			}
		}
			
			System.out.println(result);
				
			
	}

}
