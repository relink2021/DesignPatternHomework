package Homework8.Reading.factory;

/**
 * ����Link
 * ���������ƺ;����������
 */
public abstract class Link extends Item {
    //Ϊ��Link���ǳ����ࣿLink���г��󷽷�ô��
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
