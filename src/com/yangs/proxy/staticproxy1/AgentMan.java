package com.yangs.proxy.staticproxy1;

/**
 * Created by Ytadpole on 2018/2/17.
 * 经济人
 */
public class AgentMan extends MakeupWoman{
    @Override
    public void sing() {
        System.out.println("经纪人在演唱会开始前行程准备");
        super.sing();
        System.out.println("经纪人在演唱会结束后行程准备");
    }
}
