public class singleLinkedList {
  class Node {
    public Node(int _value, Node _next) {
      value = _value;
      next = _next;
    }

    int value = 0;
    Node next = null;
  }

  public void push(int _value) {
    if (head == null) {
      head = new Node(_value, null);
      tail = head;
    } else {
      Node target = head;
      while (target.next != null) {
        target = target.next;
      }
      target.next = new Node(_value, null);
      tail = target.next;
    }

  }

  public void printList() {
    Node target = head;
    int counter = 0;
    while (target != null) {
      System.out.println(counter + ". " + target.value);
      counter++;
      target = target.next;
    }
  }

  int length = 0;
  Node tail = null;
  Node head = null;
}