package com.yangs.proxy.staticproxy1;

/**
 * Created by Ytadpole on 2018/2/17.
 * 化妆师
 */
public class MakeupWoman extends StarMan{
    @Override
    public void sing() {
        System.out.println("化妆姐姐在演唱会开始前化妆准备");
        super.sing();
        System.out.println("化妆姐姐在演唱会结束后卸妆准备");
    }
}
