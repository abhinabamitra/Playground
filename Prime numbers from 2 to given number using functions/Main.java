import java.util.Scanner;
 
class Main
{
     //function to check number is prime or not
      public static boolean isPrime(int number){
          int i;
          boolean flgPrime=true;
          for(i=2; i<=number/2; i++){
              if(number%i==0){
                  flgPrime=false;
                  break;
              }
          }
          return flgPrime;
      }
      public static void main(String args[]){
          int loop,n;
           
          //System.out.print("Enter value of n: ");
          Scanner SC=new Scanner(System.in);
          n=SC.nextInt();
           
          //run loop from 1 to n
          for(loop=2; loop<n; loop++){
              if(isPrime(loop)){
                  System.out.println(loop);
              }
          }
          SC.close();
  }
}