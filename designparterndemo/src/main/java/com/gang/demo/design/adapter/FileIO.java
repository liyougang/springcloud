package com.gang.demo.design.adapter;

import java.io.IOException;

/**
 * @author ligang
 * @desc
 * @date 2018/7/21上午8:32
 **/
public interface FileIO {
    public void readFromFile(String fileName) throws IOException;
    public void writeToFile(String fileName) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
