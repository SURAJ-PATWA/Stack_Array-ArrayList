

import java.io.*;
import java.util.*;

    class MyStack_ArrayList{

        ArrayList<Integer> al=new ArrayList<>();
        void push(int x){
            al.add(x);
        }

        int pop(){
            int res=al.get(al.size()-1);
            al.remove(al.size()-1);
            return res;
        }

        int peek(){
            return al.get(al.size()-1);
        }

        int size(){
            return al.size();
        }

        boolean isEmpty(){
            return al.isEmpty();
        }


  //  class GFG{

        public static void main (String[] args)
        {
            MyStack_ArrayList s=new MyStack_ArrayList();
            s.push(5);
            s.push(10);
            s.push(20);
            System.out.println(s.pop());   // 20
            System.out.println(s.size());   // 2
            System.out.println(s.peek());    // 10
            System.out.println(s.isEmpty());  //false
        }
    }
