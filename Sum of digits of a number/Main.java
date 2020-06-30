import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      int sum = 0,i = 0;
      
      while(num!=0)
      {
         i = num%10;
        sum = sum + i;
        num = num/10;
      }
      System. out. println(sum);
	}
}