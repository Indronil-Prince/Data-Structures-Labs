public class Main {
    public static void main(String[] args) {
        // Q2:
        System.out.println("---------Q2---------");
		DoublyLinkedListDummy list = new DoublyLinkedListDummy();
        DIntNode head = new DIntNode(1);
        DIntNode tail = new DIntNode(2);
        list.setHead(head);
        list.setTail(tail);
        System.out.println(head.toString());
        System.out.println(tail.toString());
        // Q3:
		System.out.println("---------Q3---------");
        DoublyLinkedListDummy list2 = new DoublyLinkedListDummy();
        list2.setHead(new DIntNode(3));
        list2.setTail(new DIntNode(4));
        System.out.println(list2.getTail().toString());
        System.out.println(list2.getHead().toString());
        // Q4:
		System.out.println("---------Q4---------");
        DoublyLinkedListDummy list3 = new DoublyLinkedListDummy();
        list3.addEnd(1);
        list3.addEnd(2);
        list3.addEnd(3);
        System.out.println(list3.toString());
        // Q5:
		System.out.println("---------Q5---------");
        DoublyLinkedListDummy list4 = new DoublyLinkedListDummy();
        list4.addEnd(5);
        list4.addEnd(6);
        list4.addEnd(7);
        list4.removeFromHead();
        System.out.println(list4.toString());
        // Q6:
		System.out.println("---------Q6---------");
        DoublyLinkedListDummy list5 = new DoublyLinkedListDummy();
        list5.addEnd(12);
        list5.addEnd(28);
        list5.addEnd(12);
        list5.addEnd(34);
        System.out.println(list5.toString());
        // Q7:
		System.out.println("---------Q7---------");
        DoublyLinkedListDummy list6 = new DoublyLinkedListDummy();
        list6.addEnd(1);
        list6.addEnd(3);
        list6.addEnd(7);
        list6.addEnd(1);
        System.out.println(list6.countOccurrence(1));
        System.out.println(list6.countOccurrence(2));
        System.out.println(list6.countOccurrence(3));
        // Q8:
		System.out.println("---------Q8---------");
        DoublyLinkedListDummy list7 = new DoublyLinkedListDummy();
        list7.addEnd(1);
        list7.addEnd(2);
        list7.addEnd(3);
        list7.addEnd(2);
        list7.addEnd(4);
        list7.removeAll(2);
        System.out.println(list7.toString());
        list7.removeAll(1);
        System.out.println(list7.toString());
        // Q9:
		System.out.println("---------Q9---------");
        DoublyLinkedListDummy list8 = new DoublyLinkedListDummy();
        list8.addEnd(9);
        list8.addEnd(8);
        list8.addEnd(3);
        list8.addEnd(8);
        list8.addEnd(4);
        list8.addEnd(4);
        list8.addEnd(5);
        list8.addEnd(5);
        DoublyLinkedListDummy newList = list8.removeDuplicates();
        System.out.println(newList.toString());
        // Q10:
		System.out.println("---------Q10---------");
        DoublyLinkedListDummy list9 = new DoublyLinkedListDummy();
        list9.addEnd(1);
        list9.addEnd(3);
        list9.addEnd(4);
        list9.addEnd(6);
        list9.addEnd(7);
        list9.addEnd(9);
        list9.addEnd(10);
        DoublyLinkedListDummy.pairs(list9, 10);
        DoublyLinkedListDummy.pairs(list9, 7);
    }
}