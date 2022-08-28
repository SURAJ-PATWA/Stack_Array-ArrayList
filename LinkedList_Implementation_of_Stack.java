public class LinkedList_Implementation_of_Stack {
    Node head = null;
    int size = 0;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int x) {
        Node temp = new Node(x);
        if (head == null) {
            head = temp;
            //return;
            size++;
        } else {
            temp.next = head;
            head = temp;
            size++;
        }
    }

    public int pop() {
        if (head == null) {
            System.out.println("underflow! ");
            return -1;
        } else {
            int res = head.data;
            head = head.next;
            size--;
            return res;
        }

    }


    public boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }

    public int size() {
        return size;
    }

    public int peek() {
        if (head == null) {
            return -1;
        } else {
            int data = head.data;
            return data;
        }

    }



        public static void main(String[] args) {
            LinkedList_Implementation_of_Stack s = new LinkedList_Implementation_of_Stack();
            s.push(5);
            s.push(10);
            s.push(20);
            System.out.println(s.pop());  //20
            System.out.println(s.size());  //2
            System.out.println(s.peek());  //10
            System.out.println(s.isEmpty());   //false
     

    }
}

