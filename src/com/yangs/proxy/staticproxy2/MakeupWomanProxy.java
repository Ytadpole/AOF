package com.yangs.proxy.staticproxy2;

/**
 * Created by Ytadpole on 2018/2/17.
 */
public class MakeupWomanProxy implements SingAble {
    private SingAble starMan;

    public MakeupWomanProxy(SingAble starMan) {
        this.starMan = starMan;
    }

    @Override
    public void sing() {
        System.out.println("化妆姐姐在演唱会开始前化妆准备");
        this.starMan.sing();
        System.out.println("化妆姐姐在演唱会结束后卸妆准备");
    }
}
