package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();

        addNextElements(result, firstQueue);
        addNextElements(result, secondQueue);

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {

            firstQueue.add(result.pollLast());
            addNextElements(result, firstQueue);

            secondQueue.add(result.pollLast());
            addNextElements(result, secondQueue);
        }
        return result;
    }

    private <Integer> void addNextElements (ArrayDeque<Integer> result, Queue <Integer> queue) {
        result.add(queue.poll());
        result.add(queue.poll());
    }
}
