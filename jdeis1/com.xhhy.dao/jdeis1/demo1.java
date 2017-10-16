package jdeis1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.SortingParams;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated getthod stub
		JedisPool jedisPool=new JedisPool("192.168.249.130",6379);
		Jedis jedis=jedisPool.getResource();
		jedis.flushDB();
		SortingParams sort=new SortingParams();
		jedis.lpush("userlist", "66");
		jedis.lpush("userlist", "55");
		jedis.lpush("userlist", "44");
		jedis.lpush("userlist", "33");
		jedis.lpush("userlist", "22");
		jedis.hset("user:66", "name", "67");
		jedis.hset("user:55", "name", "55");
		jedis.hset("user:44", "name", "44");
		jedis.hset("user:44", "add", "44");
		jedis.hset("user:33", "name", "33");
		jedis.hset("user:33", "add", "242");
		jedis.hset("user:22", "name", "22");
		sort.get("user:*->name");
		sort.get("user:*->add");
		System.out.println(jedis.sort("userlist",sort));
		
	}
}
