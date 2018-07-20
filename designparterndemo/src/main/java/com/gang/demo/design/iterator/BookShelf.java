package com.gang.demo.design.iterator;

/**
 * @author ligang
 * @desc
 * @date 2018/7/20下午10:51
 **/
public class BookShelf  implements Aggregate {

     private Book[] books;
     private int last;

     public BookShelf(int maxSize){
         books = new Book[maxSize];
         this.last = 0;
     }

     public Book getBookAt(int index){
         return books[index];
     }

     public void appendBook(Book book){
         books[last] = book;
         last++;
     }

     public int getLength(){
         return last;
     }


    public Iterator interator() {
        return new BookShelfIterator(this);
    }
}
