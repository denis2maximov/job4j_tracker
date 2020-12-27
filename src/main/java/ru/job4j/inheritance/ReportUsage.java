package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        JSONReport jsonReport = new JSONReport();
       String jsonText = jsonReport.generate("name", "body");
       System.out.println(jsonText);
        HtmlReport reportHtml = new HtmlReport();
        String htmlText = reportHtml.generate("Report's name", "Report's body");
        System.out.println(htmlText);
     }
}