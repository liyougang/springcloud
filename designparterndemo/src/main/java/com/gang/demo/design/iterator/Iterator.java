package com.gang.demo.design.iterator;

/**
 * @author ligang
 * @desc
 * @date 2018/7/20下午10:46
 **/
public interface Iterator<T> {

    public boolean hasNext();

    public <T> T next();
}

