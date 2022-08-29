import java.util.*;
public class Previous_Greater_Element_Stack {
  public static void printPrevGreater(int arr[],int n){
      Stack<Integer>s=new Stack<>();
      s.add(arr[0]);
      for(int i=0;i<n;i++){
          while(!s.isEmpty()&& s.peek()<=arr[i]){
              s.pop();
          }
          if(s.isEmpty()){
              System.out.print(-1+" ");
          }
          else{
              System.out.print(s.peek()+" ");
          }
          s.push(arr[i]);
      }
  }











    public static void main (String[] args) {

        int[] arr=new int[]{20,30,10,5,15};

        printPrevGreater(arr,arr.length);

    }
}
