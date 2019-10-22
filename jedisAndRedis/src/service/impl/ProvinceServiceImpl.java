package service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dao.ProvinceDao;
import dao.impl.ProvinceDaoImpl;
import domain.Province;
import redis.clients.jedis.Jedis;
import service.ProvinceService;
import until.JedisPoolUtils;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    //声明DAO
    private ProvinceDao dao = new ProvinceDaoImpl();
    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    //使用redis缓存
    @Override
    public String findAllJson() {
        //1.先从redis中查询数据
        //1.1获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");
        //2.判断province_json数据是否为null
        if(province_json == null || province_json.length()==0){
            //redis中没有数据
            System.out.println("redis中没有数据，查询数据库");
            //从数据库中查询
            List<Province> ps = dao.findAll();
            //将list序列号为json
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            //将json数据存入redis
            jedis.set("province",province_json);
            //归还连接
            jedis.close();
        }else{
            System.out.println("redis中有数据，查询缓存...");
        }
        return province_json;
    }
}
