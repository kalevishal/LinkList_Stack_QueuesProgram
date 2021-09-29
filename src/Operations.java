
public class Operations {
    public static LinkedLists addElementAtStart(){
        LinkedLists linkedList= new LinkedLists();
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

}