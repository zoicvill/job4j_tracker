package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompJobNameUp() {
        int rsl = new CompJobNameUp().compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("NameUp " + rsl);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompJobNameDown() {
        int rsl = new CompJobNameDown().compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("NameDown " + rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompJobPriorityUp() {
        int rsl = new CompJobPriorityUp().compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("PriorityUp " + rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompJobPriorityDown() {
        int rsl = new CompJobPriorityDown().compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("PriorityDown " + rsl);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenNameUpAndPriorityUp() {
        Comparator<Job> combComp = new CompJobNameUp().thenComparing(new CompJobPriorityUp());
        int rsl = combComp.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("NameUp PriorityUp " + rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenNameDownAndPriorityDown() {
        Comparator<Job> combComp = new CompJobNameDown().thenComparing(new CompJobPriorityDown());
        int rsl = combComp.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("NameDown PriorityDown " + rsl);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenPriorityUpAndNameDown() {
        Comparator<Job> combComp = new CompJobPriorityUp().thenComparing(new CompJobNameDown());
        int rsl = combComp.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        System.out.println("PriorityUp NameDown " + rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenPriorityDownAndNameUp() {
        Comparator<Job> combComp = new CompJobPriorityDown().thenComparing(new CompJobNameUp());
        int rsl = combComp.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("PriorityDown NameUp " + rsl);
        assertThat(rsl, greaterThan(0));
    }


}