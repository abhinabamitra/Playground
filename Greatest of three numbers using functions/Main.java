import java.util.Scanner;
class Main{
  public static int greatest(int a,int b)
  {
    int greatest = 0;
    if(a>b)
      greatest = a;
    else
      greatest = b;
    return greatest;
  }
  public static void main (String[] args)
  {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int n3 = s.nextInt();
    int great1 = greatest(n1,n2);
    int greatest = greatest(great1,n3);
    System.out.println(greatest);
  
  }
}