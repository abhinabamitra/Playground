import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int count = 0;
    int n = num;
    while(n!=0)
    {
      count++;
      n=n/10;
    }
    int divisor = (int)Math.pow(10,count-2);
    int res = num/divisor;
    System. out. print(res%10);
  }
}