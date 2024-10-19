package com.yash.multithreading;
import java.util.*;
/*
MyStack class is created, which uses java's stack to store
integers in it.
 */
class MyStack {
    private Stack<Integer> stack = new Stack<>();  //to encapsulate the stack operation and prevent direct access

    //the synchronizes thread ensures that a thread is executing the push method no other thread can access it
    //without the synchronized word there could be data corruption.
    //if two thread try to push values at the same time the internal state of the stack becomes inconsistent
    public synchronized void push(int value) {
        stack.push(value);
        System.out.println("Pushed: " + value);
    }


    public synchronized void pop() {
        if (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        } else {
            System.out.println("Stack is empty");
        }
    }
}

class PushThread extends Thread {
    MyStack myStack;

    PushThread(MyStack stack) {
        this.myStack = stack;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            myStack.push(i);
        }
    }
}

class PopThread extends Thread {
    MyStack myStack;

    PopThread(MyStack stack) {
        this.myStack = stack;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            myStack.pop();
        }
    }
}


public class StackExampleee {

    public static void main(String[] args) {
        MyStack stack = new MyStack();


        PushThread pushThread = new PushThread(stack);
        PopThread popThread = new PopThread(stack);

        pushThread.start();
        popThread.start();
    }
}
