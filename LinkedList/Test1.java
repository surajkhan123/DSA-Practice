package LinkedList;

public class Test1 {
  public static void main(String[] args) {
    LinkedList l = new LinkedList();

    System.out.println(l.isEmpty());

    l.add(10); 
    l.add(20); 
    l.add(30); 
    l.add(40); 
    l.add(50);

    System.out.println(l.size());
    l.display();

    System.out.println(l.get(0));
  }
}
