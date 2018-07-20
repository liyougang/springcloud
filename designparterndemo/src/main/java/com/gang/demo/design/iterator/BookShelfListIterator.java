package com.gang.demo.design.iterator;

/**
 * @author ligang
 * @desc
 * @date 2018/7/20下午10:54
 **/
public class BookShelfListIterator implements Iterator{

    private BookShelfList bookShelf;

    private int index;

    public BookShelfListIterator(BookShelfList bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }
        return false;
    }

    public Book next() {
        Book book = bookShelf.getBookAt(index++);
        return book;
    }
}
