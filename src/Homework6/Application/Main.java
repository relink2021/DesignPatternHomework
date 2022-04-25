package Homework6.Application;

import java.util.ArrayList;

/**
 * 原型模式有哪些应用?
 * 在JDK中的应用：ArrayList
 * 考察ArrayList使用深拷贝还是浅拷贝
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("list1初始化时带有的元素");
        ArrayList<String> list2 = (ArrayList<String>) list1.clone();
        list2.add("list2自己具备的元素");
        System.out.println("list1具备的所有元素为:");
        for(String token : list1) {
            System.out.println(token);
        }
        System.out.println("list2具备的所有元素为");
        for(String token: list2) {
            System.out.println(token);
        }
    }
}
