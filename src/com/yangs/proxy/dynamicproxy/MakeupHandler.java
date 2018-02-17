package com.yangs.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Ytadpole on 2018/2/17.
 */
public class MakeupHandler implements InvocationHandler {
    //被代理对象
    private Object target;

    public MakeupHandler(Object target) {
        this.target = target;
    }


    /**
     *
     * @param proxy 被代理对象
     * @param method 被代理对象方法
     * @param args  被代理对象方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("化妆师姐姐化妆开始");
        method.invoke(target, args);
        System.out.println("化妆师姐姐卸妆完毕");
        return null;
    }
}
