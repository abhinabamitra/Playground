import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int arr_size = s.nextInt();
    int arr[] = new int[arr_size];
    int index = 0;
    for(int i = 0 ; i < arr_size ; i++)
    {
      arr[i] = s.nextInt();
    }
    int greatest = arr[0];
    for(int i = 0 ; i < arr_size ; i++)
    {
      if(arr[i]>greatest){
        greatest = arr[i];
        index = i;
      }
    }
    System.out.println(index);
  }
}