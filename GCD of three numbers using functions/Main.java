import java.util.Scanner;
public class Main
{
  public static int gcd(int n1,int n2)
  {
    int min = 0;
    if(n1>n2)
      min = n2;
    else
      min = n1;
    int gcd=0;
    while(min>1)
    {
      if(n1%min == 0 && n2%min == 0)
      {
        gcd = min;
        break;
      }
      min--;
    }
    return gcd;
  }
  
  public static void main (String[] args)
  {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int n3 = s.nextInt();
    int gcd_1 = gcd(n1,n2);
    int gcd_2 = gcd(n3,gcd_1);
    System.out.println(gcd_2);
  }
}