import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i = 0 ; i<n ; i++)
      {
        arr[i] = s.nextInt();
      }
      int greatest = arr[0];
      for(int i = 0;i<n;i++)
      {
        if(arr[i]>greatest)
        {
          greatest = arr[i];
        }
      }
      System.out.println(greatest);
    }
}