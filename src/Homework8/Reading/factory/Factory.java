package Homework8.Reading.factory;

/**
 * 抽象工厂
 * 1. getFactory: 通过反射机制获取具体工厂
 * 2. 建立网页构成要素的接口
 * Link: 超链接
 * Tray: 存放Item的容器
 * Page: 页面的总体框架
 * 3. 参数
 * caption: 标题/名称
 * url: 具体的链接
 */
public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("找不到类: " + classname);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
