package Homework4.Specified;

public class Main {
    public static void main(String[] args) {
        int cnt = 1;
        ShareTable shareTable = new ShareTable();
        shareTable.appendShare(new Share(new Customer(1, "小王"),
                new Customer(2, "小红"), new Product(1, "卫生纸", "日常用品")));
        shareTable.appendShare(new Share(new Customer(3, "小明"),
                new Customer(4, "小宁"), new Product(2, "耐克运动鞋", "穿着")));
        shareTable.appendShare(new Share(new Customer(5, "小苏"),
                new Customer(2, "小郑"), new Product(2, "笔记本支架", "数码产品")));
        Iterator it = shareTable.iterator();
        while(it.hasNext()) {
            Share share = (Share) it.next();
            System.out.println("-----分享记录" + cnt + "-----");
            System.out.println(share);
            cnt++;
        }
    }
}
