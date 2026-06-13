class MyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {

        if(index < 0 || index >= size)
            return -1;

        Node temp = head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public void addAtHead(int val) {

        Node newnode = new Node(val);

        newnode.next = head;

        head = newnode;

        size++;
    }

    public void addAtTail(int val) {

        Node newnode = new Node(val);

        if(head == null) {
            head = newnode;
        }
        else {

            Node temp = head;

            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = newnode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        if(index < 0 || index > size)
            return;

        if(index == 0) {
            addAtHead(val);
            return;
        }

        Node newnode = new Node(val);

        Node temp = head;

        for(int i=0;i<index-1;i++) {
            temp=temp.next;
        }

        newnode.next=temp.next;

        temp.next=newnode;

        size++;
    }

    public void deleteAtIndex(int index) {

        if(index<0 || index>=size)
            return;

        if(index==0) {
            head=head.next;
            size--;
            return;
        }

        Node temp=head;

        for(int i=0;i<index-1;i++) {
            temp=temp.next;
        }

        temp.next=temp.next.next;

        size--;
    }
}