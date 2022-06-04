package Homework14;

/* Leaf: 文件没有下级目录 */
public class File extends Entry {
    private String name; /* 文件名称 */
    private int size; /* 文件大小 */
    private Directory parent; /* 父节点 */

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    /* 获取文件名称 */
    @Override
    public String getName() {
        return name;
    }
    /* 获取文件大小 */
    @Override
    public int getSize() {
        return size;
    }
    @Override
    protected void printList(String prefix) {
        GUIController.s.add(prefix + "/" + this + '\n');
    }
}
