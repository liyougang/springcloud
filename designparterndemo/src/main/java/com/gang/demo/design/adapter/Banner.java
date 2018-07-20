package com.gang.demo.design.adapter;

/**
 * @author ligang
 * @desc
 * @date 2018/7/21上午7:02
 **/
public class Banner {
    private String title;

    public Banner(String title){
        this.title = title;
    }
    public void showWithParen(){
        System.out.println("("+title+")");
    }

    public void showWithAster(){
        System.out.println("*"+title+"*");
    }
}
