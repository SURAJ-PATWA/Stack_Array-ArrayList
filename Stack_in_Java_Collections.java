import java.util.*;

public class Stack_in_Java_Collections {
    public static void main (String[] args) {
         //Stack<Integer> stack=new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());   //30
        System.out.println(stack.pop());    //30
        System.out.println(stack.peek());     //20

    }
}
