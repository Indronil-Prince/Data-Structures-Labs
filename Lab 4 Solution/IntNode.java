public class IntNode {
    private int data;
    private IntNode link;

  //No-argument constructor
  public IntNode() {
      this.data = 0;
      this.link = null;
    }

  //Constructor with arguments
  public IntNode(int _data, IntNode _node) {
    this.data = _data;
    this.link = _node;
  }

  //get and set functions
  public int getData() {
    return this.data;
  }

  public void setData(int _data) {
    this.data = _data;
  }

  public IntNode getLink() {
    return this.link;
  }

  public void setLink(IntNode _node) {
    this.link = _node;
  }

  //toString() function will print the node data and links among them
    public String toString() {
      String result = "";
      IntNode node = this;
      while(node != null) 
      {
          result += node.data + " -> ";
          node = node.link;
      }
      result += "null";
      return result;
    }

    public void addNodeAfterThis(int newdata) {
        IntNode newNode = new IntNode(newdata, this.link);
        this.link = newNode;
    }

public void removeNodeAfterThis() {
  if (this.link == null) {
    return; // nothing to remove
  }
  this.link = this.link.link;
}
public static int listLength(IntNode head) {
  int count = 0;
  while (head != null) {
    count++;
    head = head.link;
  }
  return count;
}
public static boolean search(IntNode head, int data) {
  while (head != null) {
    if (head.data == data) {
      return true;
    }
    head = head.link;
  }
  return false;
}
public static IntNode listSort(IntNode head) {
  IntNode sortedHead = null;
  while (head != null) {
    IntNode maxNode = head;
    IntNode prevMaxNode = null;
    IntNode curr = head;
    while (curr.link != null) {
      if (curr.link.data > maxNode.data) {
        maxNode = curr.link;
        prevMaxNode = curr;
      }
      curr = curr.link;
    }
    if (prevMaxNode != null) {
      prevMaxNode.link = maxNode.link;
    } else {
      head = maxNode.link;
    }
    maxNode.link = sortedHead;
    sortedHead = maxNode;
  }
  return sortedHead;
}

void deleteNode(int key) {
  IntNode temp = this, prev = null;
  if (temp != null && temp.data == key) {
    temp = temp.link;
    return;
  }
  while (temp != null && temp.data != key) {
    prev = temp;
    temp = temp.link;
  }
  if (temp == null)
    return;
 prev.link = temp.link;
}

public static IntNode subtract(IntNode list1, IntNode list2) {
  IntNode result = null;
  IntNode tail = null;
  while (list1 != null && list2 != null) {
    if (!search(list2, list1.data)) {
      IntNode newNode = new IntNode(list1.data, null);
      if (result == null) {
        result = newNode;
      } else {
        tail.link = newNode;
      }
      tail = newNode;
    }
    list2.deleteNode(list1.data);
    list1 = list1.link;
  }
  return result;
}


  public static void main(String[] args) {
    IntNode list = new IntNode(1, new IntNode(2, new IntNode(3, null)));
    System.out.println(list.toString()); // prints "1 -> 2 -> 3 -> null"
    
    // Test case for addNodeAfterThis()
    list.addNodeAfterThis(4);
    System.out.println(list.toString()); // prints "1 -> 4 -> 2 -> 3 -> null"
    System.out.println(list.link.link.toString()); // prints "2 -> 3 -> null"

    // Test case for removeNodeAfterThis()
    list.removeNodeAfterThis();
    System.out.println(list.toString()); // prints "1 -> 2 -> 3 -> null"
    
    // Test case for listLength()
    int length = IntNode.listLength(list);
    System.out.println(length); // prints "3"
    
    // Test case for search()
    boolean found = IntNode.search(list, 3);
    System.out.println(found); // prints "true"
    
    // Test case for listSort()
    IntNode unsorted = new IntNode(6, new IntNode(8, new IntNode(5, new IntNode(5, new IntNode(4, new IntNode(1, new IntNode(4, new IntNode(6, null))))))));
    IntNode sorted = IntNode.listSort(unsorted);
    System.out.println(sorted); // prints "1 -> 4 -> 4 -> 5 -> 5 -> 6 -> 6 -> 8 -> null"
    
    // Test case for subtract()
    IntNode list1 = new IntNode(1, new IntNode(2, new IntNode(3, new IntNode(3, null))));
    IntNode list2 = new IntNode(2, new IntNode(4, new IntNode(3, null)));
    IntNode result = IntNode.subtract(list1, list2);
    System.out.println(result); // prints "1 -> 3 -> null"
  }
}