package com.vibhor.OOP.StackAndQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if(isFull()) {
            System.out.println("stack is full!!");
            return false;
        }

        if(isEmpty()) {
            System.out.println("Stack is Empty!!");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()) {
                throw new Exception("Cannot pop from an empty Stack!!");
        }
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()) {
            throw new Exception("Cannot peek from an empty Stack!!");
        }
        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    protected boolean isFull() {
        return (data.length - 1) == ptr;
    }
}
