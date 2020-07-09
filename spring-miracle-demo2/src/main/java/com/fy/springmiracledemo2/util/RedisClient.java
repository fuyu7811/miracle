package com.fy.springmiracledemo2.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

/**
 * @author :  fuhw
 * @Description :  java类作用描述
 * @CreateDate :  2020/7/7 16:15
 * @UpdateUser :  fuhw
 * @UpdateDate :  2020/7/7 16:15
 * @UpdateRemark :  修改内容
 * @Version :  1.0
 */
public class RedisClient {

    private StringRedisTemplate redisTemplate;

    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public RedisTemplate<String, String> getRedisTemplate() {
        return redisTemplate;
    }

    public void set(String key, String val) throws Exception {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set(key, val);
    }

    public Boolean set(String key, String val, long expireSecond) throws Exception {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set(key, val);
        return redisTemplate.expire(key, expireSecond, TimeUnit.SECONDS);
    }

    public String get(String key) throws Exception {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        return ops.get(key);
    }

    public Boolean exists(String key) throws Exception {
        return redisTemplate.hasKey(key);
    }

}

