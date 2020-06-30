import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++)
    {
      arr[i] = s.nextInt();
    }
    int sum = arr[0] + arr[1] + arr[2];
    int flag = 1;
    for(int i = 0; i<n ; i += 3)
    {
      int sum1 = arr[i]+arr[i+1] +arr[i+2];
      if(sum1 != sum){
        flag = 0;
        break;
      }
    }
    if(flag == 0)
      System.out.println("Not a Perfect Batch");
    else
      System.out.println("Perfect Batch");
  }
}