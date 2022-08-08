package com.epam.collections.queue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> newList = Stream.concat(firstList.stream(), secondList.stream())
                .collect(Collectors.toList());;
        PriorityQueue<String> strings = new PriorityQueue<>(Comparator.reverseOrder());
        strings.addAll(newList);
        return strings;
    }
}
