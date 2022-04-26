package Homework7;

/**
 * 根据参数生成不同类型文件
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            //System.out.println(args.length);
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            Director director = new Director(new TextBuilder());
            String result = (String) director.construct();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            Director director = new Director(new HTMLBuilder());
            String filename = (String) director.construct();
            System.out.println("已产生" + filename + "。");
        } else if (args[0].equals("md")) {
            Director director = new Director(new MarkdownBuilder());
            String filename = (String) director.construct();
            System.out.println("已产生" + filename + "。");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main plain  产生一般格式的文件");
        System.out.println("Usage: java Main html   产生HTML格式的文件");
        System.out.println("Usage: java Main md     产生markdown格式的文件");
    }
}
