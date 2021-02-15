package com.wcoding.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("d");
        queue.offer("e");

        // remove the item from the front and returns it/ returns exception is queue is null
        String front = queue.remove();

        // returns null if the queue is empty
        String front2 = queue.poll();

        System.out.println(front);
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
