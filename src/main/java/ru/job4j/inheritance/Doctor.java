package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String salary;

    public Doctor(String salary) {
        this.salary = salary;
    }

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    void salaryMy() {
        System.out.println("my salary " + salary);
    }
}
