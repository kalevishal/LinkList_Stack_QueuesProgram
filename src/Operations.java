public class Operations {
    public static LinkedLists addElementAtStart() {
        LinkedLists linkedList = new LinkedLists();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        return linkedList;
    }

    public static void appendElement() {
        LinkedLists linkedList = new LinkedLists();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }

    public static void insertInBetween() {
        LinkedLists linkedList = new LinkedLists();
        linkedList.insert(56);
        linkedList.insert(70);
        linkedList.insert(30);
        linkedList.print();
    }

    public static void deleteFirstNode() {
        LinkedLists linkedList = addElementAtStart();
        linkedList.popFirst();
        linkedList.print();
    }

    public static void deleteLastNode() {
        LinkedLists linkedList = addElementAtStart();
        linkedList.popLast();
        linkedList.print();

    }

    public static void findNodeBaseOnValue() {
        LinkedLists linkedList = addElementAtStart();
        linkedList.searchNode(30);
    }

    public static LinkedLists insertAfterSearchNode() {
        System.out.println("Before Insertion");
        LinkedLists linkedList = addElementAtStart();
        Node newNode = new Node(40);
        Node previousNode = linkedList.insertAfter(30, newNode);
        System.out.println("After Insertion");
        linkedList.print();
        return linkedList;
    }

    public static void deleteSpecificNode() {
        System.out.println("Before deletion:");
        LinkedLists linkedList = insertAfterSearchNode();
        System.out.println("After");
        linkedList.deleteNode(40);
        System.out.println("After deletion:");
        linkedList.print();
        int size = linkedList.size();
        System.out.println("Linked size is " + size);

    }

    public static void sortNode() {
        System.out.println("Before sorting");
        LinkedLists linkedList = addElementAtStart();
        linkedList.sort();
        System.out.println("After sorting");
        linkedList.print();
    }
}