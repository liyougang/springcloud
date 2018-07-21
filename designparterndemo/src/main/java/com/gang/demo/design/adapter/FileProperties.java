package com.gang.demo.design.adapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ligang
 * @desc
 * @date 2018/7/21上午8:37
 **/
public class FileProperties extends Properties implements FileIO {
    
     /**
      *
      * desc:
      * @param: fileName 文件名
      * @return:
      * @auther: ligang
      * @date: 2018/7/21 上午9:17
      */
    public void readFromFile(String fileName) throws IOException {
        super.load(new FileInputStream(fileName));
    }

    public void writeToFile(String fileName) throws IOException {
        super.store(new FileOutputStream(fileName), "Write by FileProperties");
    }

    public void setValue(String key, String value) {
        super.setProperty(key, value);
    }

    public String getValue(String key) {
        return super.getProperty(key);
    }
}
