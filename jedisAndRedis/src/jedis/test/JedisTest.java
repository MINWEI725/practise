package jedis.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import until.JedisPoolUtils;

public class JedisTest {


    @Test
    public void test1(){
        //1.获取链接
        Jedis jedis = new Jedis("localhost", 6379);
        //2.操作
        jedis.set("username","zhangsan");
        //3.关闭连接
        jedis.close();
    }

    //Jedis连接池工具类的使用
    @Test
    public void test2(){
        //通过连接池工具类进行获取连接
        Jedis jedis = JedisPoolUtils.getJedis();
        //使用
        jedis.set("hhh","哈哈");
        jedis.close();
    }
}
