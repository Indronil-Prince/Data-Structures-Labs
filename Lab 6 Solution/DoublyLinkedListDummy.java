public class DoublyLinkedListDummy {
    private DIntNode head;
    private DIntNode tail;

    public DoublyLinkedListDummy() {
        head = new DIntNode();
        tail = new DIntNode();
        head.setNext(tail);
        tail.setPrev(head);
    }

    public DIntNode getHead() {
        return head;
    }

    public void setHead(DIntNode node) {
        head = node;
    }

    public DIntNode getTail() {
        return tail;
    }

    public void setTail(DIntNode node) {
        tail = node;
    }

    public void addEnd(int element) {
        DIntNode newNode = new DIntNode(element);
        newNode.setPrev(tail.getPrev());
        tail.getPrev().setNext(newNode);
        newNode.setNext(tail);
        tail.setPrev(newNode);
        // Time complexity: O(1)
    }

    public void removeFromHead() {
        if (head.getNext() != tail) {
            head.setNext(head.getNext().getNext());
            head.getNext().setPrev(head);
        }
        // Time complexity: O(1)
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(Forward) ");
        DIntNode curr = head.getNext();
        while (curr != tail) {
            sb.append(curr.getData());
            if (curr.getNext() != tail) {
                sb.append("<->");
            }
            curr = curr.getNext();
        }
        sb.append("\n(Backward) ");
        curr = tail.getPrev();
        while (curr != head) {
            sb.append(curr.getData());
            if (curr.getPrev() != head) {
                sb.append("<->");
            }
            curr = curr.getPrev();
        }
        return sb.toString();
        // Time complexity: O(n)
    }

    public int countOccurrence(int e) {
        int count = 0;
        DIntNode curr = head.getNext();
        while (curr != tail) {
            if (curr.getData() == e) {
                count++;
            }
            curr = curr.getNext();
        }
        return count;
        // Time complexity: O(n)
    }

    public boolean removeAll(int e) {
        boolean removed = false;
        DIntNode curr = head.getNext();
        while (curr != tail) {
            if (curr.getData() == e) {
                curr.getPrev().setNext(curr.getNext());
                curr.getNext().setPrev(curr.getPrev());
                curr = curr.getNext();
                removed = true;
            } else {
                curr = curr.getNext();
            }
        }
        return removed;
        // Time complexity: O(n)
    }

    public DoublyLinkedListDummy removeDuplicates() {
        DoublyLinkedListDummy newList = new DoublyLinkedListDummy();
        DIntNode curr = head.getNext();
        while (curr != tail) {
            if (newList.countOccurrence(curr.getData()) == 0) {
                newList.addEnd(curr.getData());
            }
            curr = curr.getNext();
        }
        return newList;
        // Time complexity: O(n^2)
    }

    public static void pairs(DoublyLinkedListDummy l2, int y) {
        DIntNode left = l2.head.getNext();
		DIntNode right = l2.tail.getPrev();
		String result = "";
		while(!left.equals(right) && right.getData()>left.getData()) {
			int sum = left.getData()+right.getData();
			if(sum==y) {
				result+="("+left.getData()+","+right.getData()+"),";
				left = left.getNext();
				right = right.getPrev();
			}
			else if(sum<y) {
                left = left.getNext();
            }
			else{
                right = right.getPrev();
            }
		}
		System.out.println(result);
        // Time complexity: O(n)
    }
}
