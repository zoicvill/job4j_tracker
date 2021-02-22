package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book ring = new Book("Ring = 0", 850);
        Book redBull = new Book("Red Bull", 300);
        Book rollton = new Book("Rollton", 50);
        Book john = new Book("John = 3", 320);
        Book clean = new Book("Clean code", 809);
        Book masBook[] = new Book[5];
        masBook[0] = ring;
        masBook[1] = redBull;
        masBook[2] = rollton;
        masBook[3] = john;
        masBook[4] = clean;
        for (int i = 0; i < masBook.length; i++) {
            Book bk = masBook[i];
            System.out.println(i +" " + bk.getName() + " " + bk.getStr());
        }
        System.out.println("Перемена книг местами");
        Book buf = masBook[0];
        masBook[0] = masBook[3];
        masBook[3] = buf;
        for (int i = 0; i < masBook.length; i++) {
            Book bk = masBook[i];
            System.out.println(i +" " +bk.getName() + " " + bk.getStr());
        }
        System.out.println("Вывод книги с названием \"Clean code\"");
        for (int i = 0; i < masBook.length; i++) {
            if (masBook[i].getName().equals("Clean code")){
                System.out.println(i +" " + masBook[i].getName() + " " + masBook[i].getStr());
            }

        }
    }
}
