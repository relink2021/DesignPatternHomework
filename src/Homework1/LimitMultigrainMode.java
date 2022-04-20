package Homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 单例模式的变形：对象数量有限的多例模式
 * 核心思想：
 * 1.构造器私有化，外部不能随意new该对象
 * 2.对外提供获得修改对象的方法
 * 3.使用一个类变量记录允许的最大对象数量
 * 4.使用一个类变量记录当前对象的序号
 * 5.使用一个list记录所有产生的对象，每次使用时，都从list中获取对象
 */
public class LimitMultigrainMode {
    private static final int maxNumsOfObject = 2;
    private static List<String> nameList = new ArrayList<String>();
    private static List<LimitMultigrainMode> limitMultigrainModeList = new ArrayList<LimitMultigrainMode>();
    private static int curNumsOfObject = 0;

    static {
        for (int i = 0; i < maxNumsOfObject; i++) {
            limitMultigrainModeList.add(new LimitMultigrainMode("第" + (i + 1) + "个实例"));
        }
    }

    private LimitMultigrainMode() {
    }

    private LimitMultigrainMode(String name) {
        nameList.add(name);
    }

    public static LimitMultigrainMode getInstance() {
        Random random = new Random();
        curNumsOfObject = random.nextInt(maxNumsOfObject);
        return limitMultigrainModeList.get(curNumsOfObject);
    }

    public static void say() {
        System.out.println(nameList.get(curNumsOfObject));
    }
}
