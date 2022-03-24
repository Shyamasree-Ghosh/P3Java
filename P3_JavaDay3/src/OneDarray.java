import java.util.Scanner;

public class OneDarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col;
		System.out.println("Enter rows and colums");
		row = sc.nextInt();
		col = sc.nextInt();
		int d_row = 0, d_col =0;
		System.out.println("Enter Elements");
		int a[] = new int[row*col];
		for(int i=0;i<row*col;i++) {
			a[i] = sc.nextInt();
		}
		int min=a[0];
		int index=0;
		
		for(int i =0;i<row*col;i++) {
			if (a[i]<min) {
				min = a[i];
				index= i;
			}
		}
		d_col = index % col;
		
		
		for(int i =0; i<=col; i++) {
			if(index<col * i) {
				d_row = i-1;
				break;
			}
		}
		System.out.println("Min Element found in row = "+d_row+ "And colunm = "+d_col);
		
	}

}
