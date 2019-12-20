/*
package com.fy.springmiracledemo.rocket;

import com.jfpay.mkserverpre.config.enums.TopicEnum;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

*/
/**
 * @author fuhw
 * @date 2019/12/10 9:58
 * @ClassName MQConsumeService
 * @Description
 *//*

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Service
public @interface MQConsumeService {
   */
/**
    * 消息主题
    *//*

   TopicEnum topic();

   */
/**
    * 消息标签,如果是该主题下所有的标签，使用“*”
    *//*

   String[] tags();
}
*/
