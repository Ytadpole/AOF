package com.yangs.proxy.staticproxy1;

/**
 * Created by Ytadpole on 2018/2/17.
 */
public class Test {
    public static void main(String[] args){
        //只是化妆安排
        SingAble singAble = new MakeupWoman();
        singAble.sing();

        //行程安排，化妆安排
//        SingAble singAble = new AgentMan();
//        singAble.sing();
    }
}
