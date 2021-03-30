package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriorityTake() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task(5, "low"));
        queue.put(new Task(1, "urgent"));
        queue.put(new Task(3, "middle"));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));

    }
}