package Homework4.Specified;

import java.util.ArrayList;

// 分享记录表
public class ShareTable implements Aggregate {
    // 存放记录的ArrayList
    private final ArrayList<Share> shareArrayList;
    private int last = 0;
    // 构造函数
    public ShareTable() {
        this.shareArrayList = new ArrayList<>();
    }
    // 根据索引获取一条记录
    public Share getShareAt(int index) {
        return this.shareArrayList.get(index);
    }
    // 添加一条分享记录
    public void appendShare(Share share) {
        this.shareArrayList.add(share);
        last++;
    }
    // 获取数组长度
    public int getLength() {
        return last;
    }
    // 迭代器设置
    @Override
    public Iterator iterator() {
        return new ShareTableIterator(this);
    }
}
