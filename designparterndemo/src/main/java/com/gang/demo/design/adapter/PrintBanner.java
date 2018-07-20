package com.gang.demo.design.adapter;

/**
 * @author ligang
 * @desc
 * @date 2018/7/21上午7:09
 **/
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String title){
        super(title);
    }

    public void printerWeek() {
        super.showWithParen();
    }

    public void printerStrong() {
        super.showWithAster();
    }
}
