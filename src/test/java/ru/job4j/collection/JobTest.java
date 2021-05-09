package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bu", 0),
                new Job("aaa", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAcs() {
        Comparator<Job> cmpNameAcs = new JobCompNameAscending();
        int rsl = cmpNameAcs.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityAcs() {
        Comparator<Job> cmpNameAcs = new JobCompPriorityAsxending();
        int rsl = cmpNameAcs.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameDesc() {
        Comparator<Job> cmpNamePriority = new JobDescByName();
        int rsl = cmpNamePriority.compare(
                new Job("Fix bu", 0),
                new Job("aaa", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByPriorityDesc() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Fix bu", 0),
                new Job("aaa", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByDescNameAscPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobCompPriorityAsxending());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bu", 0),
                new Job("aaa", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByAscNameDescPrority() {
        Comparator<Job> cmpNamePriority = new JobCompNameAscending().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }


}