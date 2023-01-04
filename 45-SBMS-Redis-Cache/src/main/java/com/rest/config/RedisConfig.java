package com.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.rest.binding.User;

@Configuration
public class RedisConfig {
 
	@Bean
	public JedisConnectionFactory getJedisConnection() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		
	// we no need to set below properties because our application and Redis is running in same machine 
	
		/** factory.setHostName(hostName);
	        factory.setPassword(password);
	        factory.setPort(port);
	     */
		return factory;
	}
	
	//here we are injecting JedisConnectionFactory Object into RedisTemplate
	
	@Bean
	@Primary
	public RedisTemplate<String, User> getRedisTemplate(JedisConnectionFactory factory){
		RedisTemplate<String, User> rt = new RedisTemplate<>();  
		rt.setConnectionFactory(factory);
		return rt;
	}
}
