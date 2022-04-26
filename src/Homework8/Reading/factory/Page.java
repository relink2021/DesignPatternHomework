package Homework8.Reading.factory;

import java.io.*;
import java.util.Vector;

/**
 * 抽象页面元素
 * 包含整个HTML的名称及其作者
 * title：标题
 * author：作者
 * content：内容体
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected Vector content = new Vector();
    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item) {
        content.add(item);
    }
    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println("已产生" + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract String makeHTML();
}
