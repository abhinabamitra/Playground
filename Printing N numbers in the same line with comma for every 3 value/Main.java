import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i = 1;i<=n;i++)
    {
      if(i%3==0)
      {
        System.out.print(i);
        System.out.print(",");
      }
      else{
        System.out.print(i);
      }
    }
  }
}