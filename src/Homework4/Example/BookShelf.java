package Homework4.Example;

import java.util.HashSet;
import java.util.Set;

// 书架类
public class BookShelf implements Aggregate {
    private final Set<Book> books;
    private int last = 0;
    java.util.Iterator<Book> it;

    public BookShelf() {
        this.books = new HashSet<>();
        it = this.books.iterator();
    }

    public Book getBookAt(int index) {
        return this.books.iterator().next();
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
