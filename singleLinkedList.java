public class singleLinkedList {
  class Node {
    public Node(int _value, Node _next) {
      value = _value;
      next = _next;
    }

    int value = 0;
    Node next = null;
  }

  public void pushFirst(int _value) {
    Node target = new Node(_value, head);
    length++;
    if (head == null) {
      tail = target;
    }
    head = target;
  }

  public void pushLast(int _value) {
    length++;
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

  public void pushToIndex(int _value, int _index) {
    if (_index == 0)
      this.pushFirst(_value);

    else if (_index == this.length) {
      this.pushLast(_value);

    } else if (_index >= 0) {
      try {
        Node target = head;
        for (int i = 0; i < _index - 1; i++) {
          target = target.next;
        }
        Node nextInLine = target.next;
        target.next = new Node(_value, null);
        target.next.next = nextInLine;
        this.length++;

      } catch (NullPointerException e) {
        System.out.println("Unable to add " + _value + ". " + _index + " is too high of an index.");
      }
    } else {
      System.out.println("Unable to add " + _value + ". " + _index + " must be higher than -1.");
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

  public void printInfo() {
    System.out.println("List: ");
    this.printList();

    System.out.println("Head: " + this.head.value);
    System.out.println("Tail: " + this.tail.value);
    System.out.println("Length: " + this.length);
  }

  int length = 0;
  Node tail = null;
  Node head = null;
}