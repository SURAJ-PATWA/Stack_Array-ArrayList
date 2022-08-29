import java.util.*;
public class Next_Greater_Element_Stack {


    public static ArrayList<Integer> nextGreater(int arr[],int n) {
        ArrayList<Integer> v = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        s.push(arr[n-1]);
        v.add(-1);
        for(int i=n-2;i>=0;i--){
            while(!s.isEmpty()&& s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                v.add(-1);
            }
            else{
                v.add(s.peek());
            }
            s.push(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }


    
    public static void main(String[] args) {
        int[] arr=new int[]{5,15,10,8,6,12,9,18};

        for(int x: nextGreater(arr,arr.length)){
            System.out.print(x + " ");
        }
    }
}
