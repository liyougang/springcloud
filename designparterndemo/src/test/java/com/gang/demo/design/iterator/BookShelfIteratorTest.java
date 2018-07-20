package com.gang.demo.design.iterator;

/**
 * @author ligang
 * @desc  BookShelfIterator Test
 * @date 2018/7/20下午11:15
 **/
public class BookShelfIteratorTest {

    public static void main(String[] args){
        int maxSize = 10;
        BookShelf bookShelf = new BookShelf(maxSize);
        for(int i = 0; i< maxSize; i++){
            Book book = new Book("test"+i);
            bookShelf.appendBook(book);
        }

        BookShelfIterator iterator = new BookShelfIterator(bookShelf);
        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}
