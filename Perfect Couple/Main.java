import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i = 0 ; i<n ; i++)
      {
        arr[i] = s.nextInt();
      }
      int sum = s.nextInt();
      for(int i = 0 ; i<n ; i++)
      {
        for(int j = i ; j<n ; j++)
        {
          if(arr[i]+arr[j] == sum)
            System.out.println(arr[i]+", "+arr[j]);
        }
      }
    }
}