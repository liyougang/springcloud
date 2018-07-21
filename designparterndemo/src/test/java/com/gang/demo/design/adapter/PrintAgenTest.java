package com.gang.demo.design.adapter;

/**
 * @author ligang
 * @desc
 * @date 2018/7/21上午8:15
 **/
public class PrintAgenTest {

    public static void main(String[] args){
        String title = "printAgen";
        Banner banner = new Banner(title);
        PrintAgen printAgen = new PrintBannerAgen(banner);
        printAgen.printStrong();
        printAgen.printWeek();
    }
}
