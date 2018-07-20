package com.gang.demo.design.iterator;

/**
 * @author ligang
 * @desc  BookShelfListIterator Test
 * @date 2018/7/20下午11:15
 **/
public class BookShelfListIteratorTest {

    public static void main(String[] args){
        int maxSize = 10;
        BookShelfList bookShelf = new BookShelfList();
        for(int i = 0; i< maxSize; i++){
            Book book = new Book("testList"+i);
            bookShelf.appendBook(book);
        }

        BookShelfListIterator iterator = new BookShelfListIterator(bookShelf);
        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}
