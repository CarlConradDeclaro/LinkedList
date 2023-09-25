class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
        next = null;
    }
}


class LinkedList{
    Node head;

    void add(int data){
        Node node = new Node(data);
        node.next = head;
        head =node;
    }

     static int size(){
        Node current = head;
        int count =0;
        while(current != null){
           count++;
           current = current.next;
        }

        return count;
     }

     void printMiddle(){
        Node current = head;
        int n = size();
        int count =0;
        int num=0;
        while(current != null){
            
            if(count == n ){
                num = current.data;
                break;
            }
            current = current.nex;
            count++;
        }
        System.out.println("Middle number is: " + num);
     }

}


public class FindTheMiddle {
    public static void main(String[] args) {
      
      LinkedList list = new LinkedList();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      
    //   list.length();
    //   System.out.println( list.getCount());
     System.out.println("");
    }
}