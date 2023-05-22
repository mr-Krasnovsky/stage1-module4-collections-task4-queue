package com.epam.collections.queue;
import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Deque<Integer> dishes = new ArrayDeque<>(numberOfDishes);;
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        int count = 0;

        while (!dishes.isEmpty()) {
            int val = dishes.pollFirst();
            count++;
            if (count % everyDishNumberToEat != 0) {
                dishes.addLast(val);
            } else {
                result.add(val);
                count %= everyDishNumberToEat;
            }
        }

        return result;
    }
}
