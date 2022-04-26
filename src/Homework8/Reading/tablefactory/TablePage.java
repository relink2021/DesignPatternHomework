package Homework8.Reading.tablefactory;

import Homework8.Reading.factory.*;

import java.util.Iterator;

/**
 * 表格型页面的内容构成
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        // 设置utf-8编码
        buffer.append("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\"/>");
        // 设置标题
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        // 设置内容体
        buffer.append("<body>\n");
        // 设置H1标题
        buffer.append("<h1>" + title + "</h1>\n");
        // 设置表格宽度
        buffer.append("<table width=\"80%\" border=\"3\">\n");
        // 使用迭代器对content进行遍历
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append("<tr>" + item.makeHTML() + "</tr>");
        }
        buffer.append("</table>\n");
        // 设置作者姓名
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
