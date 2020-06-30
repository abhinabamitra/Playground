import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      int j;
      for(int i = 1; i<=num; i++)
      {
        j=1;
        while(j<=num)
        {
          System.out.print(i);
          j++;
        }
        System.out.println();
      }
	}
}