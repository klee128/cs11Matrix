
import java.util.Scanner;

class Matrix  {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = 1;
		int s = 1;
		
		
		int matrix [][] = new int [m][n]; //create a mxn matrix
		
		for(int i = 0; i < m; i++) {  //fill out the matrix
	   	    for(int j = 0; j < n; j++) {
	        	matrix[i][j] = sc.nextInt();
	            }
	   	    System.out.println("");
	  	}
		
		
		String c = sc.next();
		while (!(c.equals("Q"))) { //Q means quit
            
		if (c.equals("T")) { 
			//transpose the matrix
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(matrix[j][i]);
                    if (j < (m-1)) {
                        System.out.print(" ");
                    }
				}
				System.out.println("");
			}
			
		}
		
		if (c.equals("R")) {
			//multiply all the elements in the matrix
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					k = k*(matrix[i][j]);
					
			}
			System.out.print(k);
            if (i < m-1){
                System.out.print(" ");
            }
			k = 1;
			
		}
			System.out.println("");
	}
	if (c.equals("C")) {
			//finds the smallest value in each of the columns and prints the
			//results in one line, separated by space.
        if (m > 1)
        {
			for (int j = 0; j < n; j++) {
				for (int i = 0; i < (m-1); i=i+2) {
					s = Math.min(matrix[i][j], matrix[i+1][j]);
				}
				System.out.print(s + " ");
			}
        }
        else {
            for (int j = 0; j < n; j++) {
				System.out.print(matrix[0][j] + " ");
				}	
			}
        
			System.out.println("");
		}
	c = sc.next();
	}
	}
	
}
