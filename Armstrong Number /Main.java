import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      int n = num;
      int n1 = num;
      int count = 0,digit;
      while(n!=0)
      {
        n = n/10;
        count++;
      }
      int sum = 0;
      for(int i = 1; i<=count; i++)
      {
        digit = n1%10;
        sum = sum + (int)Math.pow(digit,count);
        n1 = n1/10;
      }
      if(sum == num)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}