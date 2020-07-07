package com.fy.springmiracledemo2.config;

import com.fy.springmiracledemo2.util.RedisClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @Description   :  java类作用描述
 * @author        :  fuhw
 * @CreateDate    :  2020/7/7 16:16
 * @UpdateUser    :  fuhw
 * @UpdateDate    :  2020/7/7 16:16
 * @UpdateRemark  :  修改内容
 * @Version       :  1.0
 */
@Configuration
public class RedisAutoConfig {
	/**
	 * 初始化Redis
	 * @return
	 */
	@Bean
	public RedisClient redisCache(StringRedisTemplate redisTemplate) {
		RedisClient redisCache = new RedisClient();
		redisCache.setRedisTemplate(redisTemplate);
		return redisCache;
	}
}
