class driver {
  public static void main(String[] args) {
    singleLinkedList singly = new singleLinkedList();
    singly.push(5);
    singly.push(10);
    singly.push(15);
    singly.push(20);
    singly.push(25);
    singly.printList();
    System.out.println(singly.head.value + " " + singly.tail.value);
  }
}