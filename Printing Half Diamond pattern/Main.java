import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for (int i = 1; i <= n; i++)
		{
			// Print space
			for (int j = i; j < n; j++) {
				System.out.print(' ');
			}

			// Print '*'
			for (int k = 1; k < 2*i; k++) {
				System.out.print('*');
			}

			// Move to the next line
			System.out.print(System.lineSeparator());
		}
	}
}