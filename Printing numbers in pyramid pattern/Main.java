import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int num = 1;
      for (int i=0; i<n; i++) 
        { 
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=n-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print(num+" "); 
              num = num + 1;
            } 
            // ending line after each row 
            System.out.println(); 
      }
    }    
}