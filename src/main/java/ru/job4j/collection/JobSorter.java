package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new CompJobNameDown().thenComparing(new CompJobPriorityDown()));
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new CompJobNameUp());
        System.out.println("Сортировка по имени по убыванию: ");
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new CompJobNameDown());
        System.out.println("Сортировка по имени по возрастанию: ");
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new CompJobPriorityDown());
        System.out.println("Сортировка по приоритету по убыванию: ");
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new CompJobPriorityUp());
        System.out.println("Сортировка по приоритету по возрастанию: ");
        System.out.println(jobs);
        System.out.println();

        System.out.println();
        System.out.println("Сортировка всё по возрастанию: ");
        Comparator<Job> comb = new CompJobNameUpLn()
                .thenComparing(new CompJobNameUp())
                .thenComparing(new CompJobPriorityUp());
        jobs.sort(comb);
        System.out.println(jobs);
    }
}
