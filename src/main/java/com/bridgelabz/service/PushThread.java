package com.bridgelabz.service;

public class PushThread implements Runnable {
    public StackService stack;

    public PushThread(StackService stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        for(int index=0;index<5;index++){
            stack.push(index);
            System.out.println("push : "+index);
        }
    }
}
