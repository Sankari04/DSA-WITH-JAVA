class MyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    // Get the value at the given index
    public int get(int index) {

        Node ptr = head;

        for (int i = 0; i < index; i++) {

            if (ptr == null) {
                return -1;
            }

            ptr = ptr.next;
        }

        if (ptr == null) {
            return -1;
        }

        return ptr.data;
    }

    // Add a node at the beginning
    public void addAtHead(int val) {

        Node newnode = new Node(val);

        newnode.next = head;
        head = newnode;
    }

    // Add a node at the end
    public void addAtTail(int val) {

        Node newnode = new Node(val);

        // If list is empty
        if (head == null) {
            head = newnode;
            return;
        }

        Node ptr = head;

        // Move to the last node
        while (ptr.next != null) {
            ptr = ptr.next;
        }

        // Connect last node to new node
        ptr.next = newnode;
    }

    // Add a node at a particular index
    public void addAtIndex(int index, int val) {

        // If index is 0, add at head
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node ptr = head;

        // Move to the node before the required index
        for (int i = 0; i < index - 1; i++) {

            if (ptr == null) {
                return;
            }

            ptr = ptr.next;
        }

        // If index is greater than list length
        if (ptr == null) {
            return;
        }

        Node newnode = new Node(val);

        newnode.next = ptr.next;
        ptr.next = newnode;
    }

    // Delete the node at a particular index
    public void deleteAtIndex(int index) {

        // If list is empty
        if (head == null) {
            return;
        }

        // Delete head
        if (index == 0) {
            head = head.next;
            return;
        }

        Node ptr = head;

        // Move to the node before the one we want to delete
        for (int i = 0; i < index - 1; i++) {

            if (ptr == null) {
                return;
            }

            ptr = ptr.next;
        }

        // Index doesn't exist
        if (ptr == null || ptr.next == null) {
            return;
        }

        // Skip the node we want to delete
        ptr.next = ptr.next.next;
    }
}
