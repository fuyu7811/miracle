/*
package com.fy.springmiracledemo.rocket;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageConst;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.Arrays;
import java.util.List;

*/
/**
 * @author fuhw
 * @date 2019/12/10 10:03
 * @ClassName AbstractMQMsgProcessor
 * @Description 可以增加一些其他逻辑可以增加一些其他逻辑
 * 消息某条消息
 * @param tag 标签
 * @param keys 消息关键字
 * @param messageExt
 * @return 2018年3月1日 zhaowg
 *//*

@Slf4j
public abstract class AbstractMQMsgProcessor implements MQMsgProcessor {


   @Override
   public MQConsumeResult handle(String topic, String tag, List<MessageExt> msgs) {
       MQConsumeResult mqConsumeResult = new MQConsumeResult();
       */
/**可以增加一些其他逻辑*//*

       for (MessageExt messageExt : msgs) {
           //消费具体的消息，抛出钩子供真正消费该消息的服务调用
           mqConsumeResult = this.consumeMessage(tag,messageExt.getKeys()==null?null:Arrays.asList(messageExt.getKeys().split(MessageConst.KEY_SEPARATOR)),messageExt);
       }
       */
/**可以增加一些其他逻辑*//*

       return mqConsumeResult;
   }


   */
/**
 * 消息某条消息
 * @param tag 标签
 * @param keys 消息关键字
 * @param messageExt
 * @return
 * 2018年3月1日 zhaowg
 *//*

   protected abstract MQConsumeResult consumeMessage(String tag,List<String> keys, MessageExt messageExt);
}
*/
