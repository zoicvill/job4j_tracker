package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String text) {
//      return "{ \n \"name\" : " + "\"" + name +"\"" +"," + "\n \"text\" : " + "\"" + text +"\"" + "\n}";
        return "{ " + System.lineSeparator()
                + " \"" + name + "\"" + " : " + "\"" + "name" + "\"" + "," + System.lineSeparator()
                + " \"" + text + "\"" + " : " + "\"" + "text" + "\"" + System.lineSeparator()
                + "}";
    }
}
