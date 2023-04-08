package com.vibhor.LinkedList.InternalWorking;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value) {
        if(tail == null) {
            insertFirst(value); 
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;

        return value;
    }

    public int lenghtOfCycle(Node node) {
        Node f = head;
        Node s = head;

        while(f != null && f.next != null) {
            s = s.next;
            f = f.next.next;

            if(s == f) {
                int length = 0;
                Node temp = s;

                do {
                    temp = temp.next;
                    length++;
                } while(temp != f);
                return length;
            }
        }
        return 0;
    }
    
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if(row == 0) {
            return;
        }

        if(col < row) {
            Node first = get(col);
            Node second = get(col+1);

            if(first.value > second.value) {
                //swap
                head = second;
                first.next = second.next;
                second.next = first;
            } else if (second == tail) {
                Node previous = get(col - 1);
                previous.next = second;
                tail = first;
                first.next = null;
                second.next = tail;
            } else {
                Node previous = get(col-1);
                previous.next = second;
                first.next = second.next;
                second.next = first;
            }
            bubbleSort(row, col+1);
        } else {
            bubbleSort(row-1, 0);
        }
    }

    public Node mergeSort(Node node) {
        if(node == null || node.next == null) {
            return head;
        }

        Node mid = getMid(node);
        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        return merge(left, right);

    }

    public Node getMid(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node first, Node second) {
        Node node = new Node();
        Node tail = node;

        while(first != null && second != null) {

            if(first.value >= second.value) {
                tail.next = second;
                second = second.next;
            } else {
                tail.next = first;
                first = first.next;
            }
            tail = tail.next;
        }
        tail.next = (first != null) ? first : second;
        return node.next;
    }

    public void revLLRec(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }
        revLLRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public int deleteLast() {
        if(size <= 1) {
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }



    public Node get(int index) {
        Node node = head;

        for(int i=0; i<index; i++) {
            node = node.next;
        }
        return node;
    }



    public Node fine(int value) {
        Node node = head;

        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print("[" + temp.value + "]" + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public class Node {
        private int value;
        private Node next;

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
