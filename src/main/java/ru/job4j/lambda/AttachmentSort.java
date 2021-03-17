package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> list = Arrays.asList(
                new Attachment("Puppi", 50),
                new Attachment("Kolop", 56),
                new Attachment("Gilom", 7),
                new Attachment("Fehil", 15)
        );
        Comparator<Attachment> comparator = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        list.sort(comparator);
        System.out.println(list);

        Comparator<Attachment> attCompr = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        list.sort(attCompr);
        System.out.println(list);
    }
}
