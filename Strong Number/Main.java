import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
     int Reminder,Factorial,i,Temp = num,Sum = 0;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
            }
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
      if(Sum == num)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}