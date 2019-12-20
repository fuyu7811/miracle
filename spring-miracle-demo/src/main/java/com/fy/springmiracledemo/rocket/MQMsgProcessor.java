/*
package com.fy.springmiracledemo.rocket;

import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

*/
/**
  * @author fuhw
  * @date 2019/12/10 9:59
  * @ClassName MQMsgProcessor
  * @Description 
  *//*

public interface MQMsgProcessor {

    */
/**
     * 消息处理<br/>
     * 如果没有return true ，consumer会重新消费该消息，直到return true<br/>
     * consumer可能重复消费该消息，请在业务端自己做是否重复调用处理，该接口设计为幂等接口
     *
     * @param topic 消息主题
     * @param tag   消息标签
     * @param msgs  消息
     * @return 2019年12月10日 fuhw
     *//*

    MQConsumeResult handle(String topic, String tag, List<MessageExt> msgs);
}

*/
