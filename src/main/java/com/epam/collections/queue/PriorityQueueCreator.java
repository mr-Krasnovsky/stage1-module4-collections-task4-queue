package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        Comparator<String> comparator = Comparator.reverseOrder();
        PriorityQueue<String> result = new PriorityQueue<String>(comparator);
        for (String listElement : secondList) {
            result.add(listElement);
        }
        for (String listElement : firstList) {
            result.add(listElement);
        }
        return result;
    }
}
