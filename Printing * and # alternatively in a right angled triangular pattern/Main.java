import java.util.Scanner;
class Main { 
	public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int i,j,num=0;
      for(i=1;i<=n;i++)
      {
        for(j = 1;j<=i;j++)
        {
          num = num+1;
          if(num%2==0)
          {
            System.out.print("#");
          }
          else
          {
            System.out.print("*");
          }
        }
        System.out.println();
      }
    }
}