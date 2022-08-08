package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        Integer remove1 = firstQueue.remove();
        arrayDeque.offer(remove1);
        Integer remove2 = secondQueue.remove();
        arrayDeque.offer(remove2);
        System.out.println(arrayDeque);
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()){
            Integer first = arrayDeque.removeFirst();
            firstQueue.offer(first);
            Integer peek1 = firstQueue.remove();
            arrayDeque.offer(peek1);
            Integer peek2 = firstQueue.remove();
            System.out.println(arrayDeque);
            arrayDeque.offer(peek2);
            System.out.println(arrayDeque);


            Integer first1 = arrayDeque.removeFirst();
            secondQueue.offer(first1);
            Integer peek1_2 = secondQueue.remove();
            Integer peek2_2 = secondQueue.remove();
            arrayDeque.offer(peek1_2);
            arrayDeque.offer(peek2_2);
        }
        System.out.println(arrayDeque);
        return arrayDeque;
    }
}
