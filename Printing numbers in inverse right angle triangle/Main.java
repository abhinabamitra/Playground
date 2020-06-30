import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int num = 1;
      for(int i=n;i>0;i--)
      {
        num = i;
        for(int j=num;j>0;j--)
        {
          System.out.print(num);
          num = num - 1;
        }
        System.out.println();
      }
	}
}