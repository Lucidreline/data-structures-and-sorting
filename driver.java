class driver {
  public static void main(String[] args) {
    singleLinkedList singly = new singleLinkedList();
    for (int i = 5; i < 50; i += 5) {
      singly.pushLast(i);
    }
    singly.pushToIndex(8, 3);
    singly.pushToIndex(23, 10);
    singly.printInfo();
  }
}