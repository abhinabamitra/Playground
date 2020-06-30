import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int square_num = num*num;
    return square_num;
  }
  public static void main (String[] args)
  {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int sq = square(num);
    System.out.println(sq);
	} 
}