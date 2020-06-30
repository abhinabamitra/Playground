import java.util.Scanner;
class Main{
  public static int som(int num)
  {
    int sum = 0;
    for(int i=num;i>0;i--)
    {
      sum += i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int sum_i = som(n);
      System.out.println(sum_i);
	}
}