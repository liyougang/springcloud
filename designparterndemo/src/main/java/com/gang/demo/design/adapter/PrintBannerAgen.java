package com.gang.demo.design.adapter;

/**
 * @author ligang
 * @desc PrintBannerAgen
 * @date 2018/7/21上午8:10
 **/
public class PrintBannerAgen extends PrintAgen {

    private Banner banner;

    public PrintBannerAgen(Banner banner){
        this.banner = banner;
    }

    public void printWeek(){
        banner.showWithParen();
    }

    public void printStrong(){
        banner.showWithAster();
    }
}
