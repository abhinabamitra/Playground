import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      int n = num;
      int count = 0;
      while(n!=0)
      {
        count++;
        n=n/10;
      }
      int last = num%10;
      int l = count;
      int divisor = (int)Math.pow(10,l-1);
      int first = num/divisor;
      int sum = last+first;
      System.out.println(sum);
	}
}