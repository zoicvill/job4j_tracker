package ru.job4j.inheritance;

public class HtmlReport extends TextReport{
    @Override
    public String generate(String name, String text) {
        return "<h1>" + name + "</h1>" +
                "<br/>" +
                "<span>" + text + "</span>";
    }
}
