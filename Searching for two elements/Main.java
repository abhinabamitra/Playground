import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i<n;i++)
      {
        arr[i] = s.nextInt();
      }
      int search_elem_1 = s.nextInt();
      int search_elem_2 = s.nextInt();
      int flag1 = 0, flag2 = 0, index1 = 0 , index2 = 0;
      for(int i = 0;i<n;i++)
      {
        if(arr[i] == search_elem_1){
          flag1=1;
          index1=i;
        }
        if(arr[i] == search_elem_2){
          flag2=1;
          index2=i;
        }
      }
      if(flag1==1)
        System.out.println(index1);
      else
        System.out.println("-1");
      if(flag2 ==1)
        System.out.println(index2);
      else
        System.out.println("-1");
    }
}