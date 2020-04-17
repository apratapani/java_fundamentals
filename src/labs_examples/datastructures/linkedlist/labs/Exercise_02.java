package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index.
 */


class Node <T> {

    T data;

    Node next;


    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }


}


class UsingLinkedListLab {

    public static void main(String[] args) {

        CustomLinkedListLab listLab = new CustomLinkedListLab("Hello","Bhavana","How");

        listLab.add("are");

        listLab.add("you");


        System.out.println("Index of are is " + listLab.getIndex("are"));

        System.out.println(listLab.getIndex("you"));

        System.out.println(listLab.getIndex("heck"));

        //listLab.removeEnd("you");

        System.out.println(listLab.getIndex("Hello"));

     //   listLab.removeFirst();

        System.out.println(listLab.getIndex("Hello"));

        //listLab.removeEnd();

     //   listLab.removeValue("are");

        System.out.println("Index for are is " + listLab.getIndex("are"));

        System.out.println("Size of the linked list now is " + listLab.size());

        StringBuilder output = new StringBuilder(" ");

        for(int i=0; i<=listLab.size(); i++) {

            output.append(" " + listLab.getVal(i));

        }

        System.out.println("Output is " + output);


      //  System.out.println(listLab.getIndex("you"));



    }



}
