package com.mdvvproject.mdvv.util;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class TestRedis {

//        public static void main(String[] args) throws IOException {
//            GenericObjectPoolConfig config = new GenericObjectPoolConfig();
//            // 最大连接数
//            config.setMaxTotal(8);
//            // 最大空闲数
//            config.setMaxIdle(100);
//            // 最大允许等待时间，如果超过这个时间还未获取到连接，则会报JedisException异常：
//            // Could not get a resource from the pool
//            config.setMaxWaitMillis(7000);
//
//            Set<HostAndPort> jedisClusterNode = new HashSet<HostAndPort>();
////            jedisClusterNode.add(new HostAndPort("59.110.237.247", 7001));
//            jedisClusterNode.add(new HostAndPort("59.110.237.247", 7001));
////            jedisClusterNode.add(new HostAndPort("59.110.237.247", 7003));
////            jedisClusterNode.add(new HostAndPort("59.110.237.247", 7004));
////            jedisClusterNode.add(new HostAndPort("59.110.237.247", 7005));
////            jedisClusterNode.add(new HostAndPort("59.110.237.247", 7006));
//
//            //1.如果集群没有密码
////        JedisCluster jc = new JedisCluster(jedisClusterNode,config);
//            //2.如果使用到密码，请使用如下构造函数
//            JedisCluster jc = new JedisCluster(jedisClusterNode, 1000,30,3,"madong123",config);
//
//            jc.setnx("000", "mamengqi");
////            jc.set("test", "value");
////            jc.set("52", "poolTestValue288");
////            jc.set("44", "444");
////            jc.set("name", "poolTestValue2");
//            System.out.println("==================");
//            System.out.println( jc.get("000"));
//            jc.close();
//        }

    public static void main(String[] args) throws IOException {
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        // 最大连接数
//        config.setMaxTotal(10);
        // 最大空闲数
//        config.setMaxIdle(100);
        // 最大允许等待时间，如果超过这个时间还未获取到连接，则会报JedisException异常：
        // Could not get a resource from the pool
        config.setMaxWaitMillis(7000);
        HostAndPort hostAndPort1 = new HostAndPort("59.110.237.247", 7001);
        HostAndPort hostAndPort2 = new HostAndPort("59.110.237.247", 7002);
        HostAndPort hostAndPort3 = new HostAndPort("59.110.237.247", 7003);
        HostAndPort hostAndPort4 = new HostAndPort("59.110.237.247", 7004);
        HostAndPort hostAndPort5 = new HostAndPort("59.110.237.247", 7005);
        HostAndPort hostAndPort6 = new HostAndPort("59.110.237.247", 7006);
        Set<HostAndPort> hostAndPortSet = new HashSet<>();
        hostAndPortSet.add(hostAndPort1);
        hostAndPortSet.add(hostAndPort2);
        hostAndPortSet.add(hostAndPort3);
        hostAndPortSet.add(hostAndPort4);
        hostAndPortSet.add(hostAndPort5);
        hostAndPortSet.add(hostAndPort6);
        JedisCluster jedis = new JedisCluster(hostAndPortSet,1000,30,3,"madong123",config);
        jedis.set("test19", "sdfwefsfs1123123");
//        System.out.println(jedis.get("test169"));
        jedis.close();
    }

}
