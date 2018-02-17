package com.yangs.proxy.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Ytadpole on 2018/2/17.
 */
public class Test {
    public static void main(String[] args){
        StarMan starMan = new StarMan();
        InvocationHandler invocationHandler = new MakeupHandler(starMan);

        Class<?> clazz = starMan.getClass();
        SingAble singAble = (SingAble) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), invocationHandler);
        singAble.sing();
    }
}
