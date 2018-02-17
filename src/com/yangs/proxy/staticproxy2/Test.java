package com.yangs.proxy.staticproxy2;


/**
 * Created by Ytadpole on 2018/2/17.
 *
 */
public class Test {
    public static void main(String[] args){
//        StarMan starMan = new StarMan();
//        MakeupWomanProxy makeupWomanProxy = new MakeupWomanProxy(starMan);
//        AgentManProxy agentManProxy = new AgentManProxy(makeupWomanProxy);
//        agentManProxy.sing();
        StarMan starMan = new StarMan();
        AgentManProxy agentManProxy = new AgentManProxy(starMan);
        MakeupWomanProxy makeupWomanProxy = new MakeupWomanProxy(agentManProxy);
        makeupWomanProxy.sing();
    }
}
