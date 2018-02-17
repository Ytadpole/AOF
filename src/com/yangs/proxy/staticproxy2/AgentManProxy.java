package com.yangs.proxy.staticproxy2;

/**
 * Created by Ytadpole on 2018/2/17.
 * 经纪人
 */
public class AgentManProxy implements SingAble {
    //经纪人的明星
    private SingAble starMan;

    public AgentManProxy(SingAble starMan) {
        this.starMan = starMan;
    }

    @Override
    public void sing() {
        System.out.println("经济人准备演唱行程");
        this.starMan.sing();
        System.out.println("演唱会完毕，经纪人打理会场");
    }
}
