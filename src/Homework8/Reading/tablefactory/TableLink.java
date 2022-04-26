package Homework8.Reading.tablefactory;

import Homework8.Reading.factory.Link;

/**
 * 表格型页面的链接
 * makeHTML：使用<td></td>进行链接组装
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
