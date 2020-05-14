package com.bridgelabz.service;

import java.util.stream.Stream;

public class StackService {
    Integer stack[] = new Integer[5];
    int top = 0;

    public void push(int data){
        stack[top]=data;
        top++;
    }

    public void show(){
        Stream.of(stack).forEach(System.out::println);
    }

    public int pop(){
        if(this.isEmpty()){
            System.out.println("null");
        }else {
            int data;
            top--;
            data = stack[top];
            stack[top] = 0;
            return data;
        }
        return 0;
    }

    public int peek(){
        top--;
        return stack[top++];
    }

    public int size(){
        return stack.length;
    }

    public boolean isEmpty(){
        return stack[0].equals(null);
    }
}
