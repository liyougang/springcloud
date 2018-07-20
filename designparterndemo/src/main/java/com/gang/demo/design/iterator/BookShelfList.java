package com.gang.demo.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ligang
 * @desc
 * @date 2018/7/20下午11:27
 **/
public class BookShelfList{
    private List<Book> books;
    private int last;
    public BookShelfList(){
        books = new ArrayList<Book>();
        last = 0;
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public Book getBookAt(int index){
        Book book = books.get(index);
        return book;
    }

    public int getLength(){
        return books.size();
    }
}
