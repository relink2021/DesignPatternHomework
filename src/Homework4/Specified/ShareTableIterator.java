package Homework4.Specified;

// 分享记录表的迭代器
public class ShareTableIterator implements Iterator {
    private ShareTable shareTable;
    private int index;

    public ShareTableIterator(ShareTable shareTable) {
        this.shareTable = shareTable;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < shareTable.getLength()) {
            return true;
        }
        return false;
    }
    // next方法返回当前位置的Share实例，然后把index推进一个位置
    @Override
    public Object next() {
        Share share = shareTable.getShareAt(index);
        index++;
        return share;
    }
}
