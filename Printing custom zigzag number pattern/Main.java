import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int flag = 1;
    for(int i = 1 ; i <= n ; i++)
    {
      if(flag==1)
      {
      	for(int j = 0 ; j< n-1 ; j++)
      	{
        	System.out.print(i);
        }
       	System.out.print(i+1);
        flag=0;
      }
      else
      {
        System.out.print(i+1);
        for(int j = 0;j<n-1;j++)
        {
          System.out.print(i);
        }
        flag=1;
      }
      System.out.println();
    }
  }
}