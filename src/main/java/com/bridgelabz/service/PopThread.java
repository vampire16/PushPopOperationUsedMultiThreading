package com.bridgelabz.service;

public class PopThread implements Runnable {
    public StackService stack;

    public PopThread(StackService stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int index = 0; index < 5; index++) {
            if (stack.isEmpty())
                System.out.println("The Stack is Empty");
            else {
                System.out.println("Pop Value : " + stack.pop());
            }
        }
    }
}
