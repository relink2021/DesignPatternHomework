package Homework8.Reading.listfactory;

import Homework8.Reading.factory.*;
import java.util.Iterator;

/**
 * 列表型页面的元素构成
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
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
        buffer.append("<ul>\n");
        // 使用迭代器遍历content并描绘
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        // 设置作者姓名
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
