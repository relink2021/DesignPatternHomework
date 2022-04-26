package Homework8.Reading.listfactory;


import Homework8.Reading.factory.*;

/**
 * 列表型页面的链接
 * makeHTML：使用<li></li>进行链接组装
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
