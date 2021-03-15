package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String specialty;

    public Engineer(String spcl) {
        this.specialty = spcl;
    }

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void specialtyMy() {
        System.out.println(specialty);
    }

}
