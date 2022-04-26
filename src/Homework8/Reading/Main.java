package Homework8.Reading;

import Homework8.Reading.factory.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 检查传入的参数是否正确
         * 如果错误，则返回正确的参数设置方法并退出
         */
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        /**
         * 抽象工厂的核心思路：
         * 传入参数并根据参数返回工厂类型
         */
        Factory factory = Factory.getFactory(args[0]);

        /**
         * 创建页面内容
         * 1.创建链接
         * 2.创建tray承载内容
         * 3.创建页面，装载所有元素
         * 4.生成一个完整的page，类型由创建其的工厂所指定
         */
        Link sina = factory.createLink("新浪新闻", "http://www.sina.com/");
        Link sohu = factory.createLink("搜狐新闻", "http://www.sohu.com");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link china_yahoo = factory.createLink("Yahoo!China", "http://www.yahoo.com.cn/");
        Link xmu = factory.createLink("XMU", "http://www.xmu.edu.cn/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("新闻");
        traynews.add(sina);
        traynews.add(sohu);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(china_yahoo);

        Tray traysearch = factory.createTray("搜索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(xmu);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "厦门大学信息学院");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}

