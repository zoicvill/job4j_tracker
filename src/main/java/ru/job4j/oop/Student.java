package ru.job4j.oop;

public class Student {
    public static void main(String[] args) {
        Student studentSongAMus = new Student();
        studentSongAMus.song();
        studentSongAMus.music();
        studentSongAMus.song();
        studentSongAMus.song();
        studentSongAMus.music();
        studentSongAMus.music();
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public void music() {
        System.out.println("Play music");
    }
}
