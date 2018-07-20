package com.gang.demo.design.adapter;

/**
 * @author ligang
 * @desc
 * @date 2018/7/21上午7:11
 **/
public class PrintTest {

    public static void main(String[] args){
        String title = "test";
        Print print = new PrintBanner(title);
        print.printerWeek();
        print.printerStrong();
    }
}
