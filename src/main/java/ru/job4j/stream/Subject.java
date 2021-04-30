package ru.job4j.stream;
/**Класс Subject описывает школьный предмет и аттестационный балл ученика.*/
public class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getNameSubject() {
        return name;
    }

    public int getScoreSubject() {
        return score;
    }
}
