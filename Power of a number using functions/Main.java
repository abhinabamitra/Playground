import java.util.Scanner;
class Main
{
  public static int exponent(int base, int expo)
  {
    int power = (int)Math.pow(base,expo);
    return power;
  }
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int power = exponent(n1,n2);
    System.out.println(power);
  }
}
