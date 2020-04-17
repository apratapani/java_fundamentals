package labs_examples.datastructures.linkedlist.labs;

public class CustomLinkedListLab<T> {

    private Node<T> head;

    public CustomLinkedListLab(T ... data) {

        if (data.length <  1)
        {
            head = null;
        } else
        {
           for(int i=0; i < data.length; i++)
           {
               add(data[i]);
           }
        }


    }


    public void add(T data) {

        if(head == null) {

           head = new Node(data);

        }

        else {


            Node iterator = head;

            while(iterator.next != null) {

                iterator = iterator.next;

            }

            iterator.next = new Node(data);


        }


    }


    public void push(T data) {

        head = new Node(data,head);


    }


    public void removeFirst() {
        head = head.next;
    }


    public void removeEnd() {

        Node iterator = head;

        while(iterator.next.next == null) {

            iterator = iterator.next;

        }

        iterator.next = null;


    }


    public int getIndex(T data) {

        if(head == null) {
            return 0;
        }

        Node iterator = head;

        int count = 0;

        while(iterator.data != data && iterator.next != null ) {
            iterator = iterator.next;
            count ++;
        }

       if(iterator.next == null && iterator.data != data) {
          count = -1;
       }

        return count;

    }


    public void removeValue(T data) {

        Node iterator = head;

        Node previous = null;

        while(iterator.data != data) {
            previous = iterator;
            iterator = iterator.next;

        }

         previous.next = iterator.next;

         iterator.next = null;



    }

    public int size() {

        Node iterator = head;

        int count = 0;
        while(iterator.next!=null) {
            iterator = iterator.next;
            count++;
        }

        return count;

    }

    public T getVal(int index) {

        Node<T> iterator = head;

        int count = 0;

        if(index > size()) {
            return null;
        }

        while(count!= index ) {
            iterator = iterator.next;
            count++;
        }

        return iterator.data;


    }




}
