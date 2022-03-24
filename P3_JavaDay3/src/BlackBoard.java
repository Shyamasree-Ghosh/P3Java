import java.util.Scanner;

public class BlackBoard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row =0, col=0,i=0,j=0;
		System.out.println("Enter the rows and column: ");
		row = sc.nextInt();
		col = sc.nextInt();
		char arr[][] = new char[row][col];
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				if((i==0 || i==row-1)&&(j==0 || j<col-1)) {
					arr[i][j] = '#';
				}
				else if((i==row/2 || i==(row-1)/2) && (j==col/2 || j==(col-1)/2)){
					arr[i][j] = 'O';
					
				}
				else {
					arr[i][j] = ' ';
				}
				
			}
		}
		
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				System.out.print(arr[i][j]);
				
			}
			}

	}

}
