package LinkedList;

public class LinkedList {
  
    Node head;
    int count = 0;

    //to add first
    public void add(Object ele){
      Node n = new Node(ele);
      if(head==null){
        head = n;
        count++;
        return;
      }

      //moving current to next
      Node current = head;
      while (current.next!= null) 
        current = current.next;
        current.next = n;
        count++;
      
    }

    public int size(){
        return count;
      }
      public boolean isEmpty(){
        return count ==0;
      }

    public void display(){
      Node current = head;
      while (current != null) {
        System.out.println(current.ele);
        current = current.next;
      }
    }

    public void addFirst(Object ele){
      Node n  = new Node(ele);
      n.next = head;
      head = n;
      count++;
    }

    public Object get(int index){
      if(index < 0 || index >=size())
        throw new IndexOutOfBoundsException();
      Node current = head;
      for(int i=1;i<= index;i++){
        current = current.next;
      }
      return current.ele;
    }
  
}
