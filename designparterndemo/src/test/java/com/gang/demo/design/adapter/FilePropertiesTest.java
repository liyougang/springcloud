package com.gang.demo.design.adapter;

import java.io.IOException;

/**
 * @author ligang
 * @desc
 * @date 2018/7/21上午9:18
 **/
public class FilePropertiesTest {

    public static void main(String[] args) throws IOException {

        // 文件目录
        String filePath = "/Users/ligang/workspaces/project/study/designpartern/adapter/";

        FileIO fio = new FileProperties();
        String fileName = filePath+ "file.txt";
        fio.readFromFile(fileName);
        fio.setValue("year", "2018");
        fio.setValue("month", "07");
        fio.setValue("day", "21");

        String writeFileName = filePath + "newFile.txt";
        fio.writeToFile(writeFileName);

    }
}
