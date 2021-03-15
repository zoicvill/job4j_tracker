package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String s = report.generate("Go generate name", "Generate text");
        System.out.println(s + "\n");
        JSONReport jsonReport = new JSONReport();
        String ss = jsonReport.generate("JSONReport generate name", "JSONGenerate text");
        System.out.println(ss);
    }
}
