package Homework7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Markdown文件创建者
 */
public class MarkdownBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = title + ".md";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("### " + title + "\n");
    }

    @Override
    public void makeString(String str) {
        writer.println(str + "\n");
    }

    @Override
    public void makeItems(String[] items) {
        for(String item : items) {
            writer.println("- " + item + "\n");
        }
    }

    @Override
    public Object getResult() {
        writer.close();
        return filename;
    }
}
