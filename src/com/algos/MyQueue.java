package com.algos;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        st1.push(x);
    }

    private void moveToStack(){
        while( !st1.isEmpty()){
            st2.push(st1.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if( !st2.isEmpty()) moveToStack();
        return st2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if( !st2.isEmpty())moveToStack();
        return st2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if( st1.isEmpty() && st2.isEmpty() ) return true;
        return false;
    }
}
