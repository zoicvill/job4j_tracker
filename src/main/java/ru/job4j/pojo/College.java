package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(30);
        student.setCourse(5);
        student.setName("Feofan");

        System.out.println("My name is " + student.getName() + " I'm "
                + student.getAge() + " years old I'm a " + student.getCourse() +"th year student and I'm an alcoholic");
    }
}
