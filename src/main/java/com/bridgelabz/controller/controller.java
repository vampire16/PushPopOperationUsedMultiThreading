package com.bridgelabz.controller;

import com.bridgelabz.service.PopThread;
import com.bridgelabz.service.PushThread;
import com.bridgelabz.service.StackService;

public class controller {
    public static StackService stack = new StackService();
    public static void main(String[] args) {
        PushThread pushRunnable = new PushThread(stack);
        Thread pushThread = new Thread(pushRunnable);
        PopThread popRunnable = new PopThread(stack);
        Thread popThread = new Thread(popRunnable);
        pushThread.start();
        popThread.start();
    }
}
