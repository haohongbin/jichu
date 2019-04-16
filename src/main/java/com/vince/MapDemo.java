package com.vince;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Map接口：
 * 1.键值对存储一组对象
 * 2.Key不能重复（唯一），Value可以重复
 * 3.具体的实现类：HashMap TreeMap Hashtable LinkedHashMap
 */
public class MapDemo {
    /**
     * HashMap的实现原理：
     * 1、基于哈希表（数组+链表+二叉树（红黑树））1.8
     * 2、默认加载因子为0.75，默认数组大小为16
     * 3、把对象存储到哈希表中，如何存储？
     *      把key对象通过hash()方法计算hash值，然后用这个hash值对数组长度取余数（默认16），来决定该KEY对象
     *      在数组中存储的位置，当这个位置有多个对象时，以链表结构存储，jdk1.8后，当链表长度大于8时，链表将转换为红黑树结构存储。
     *      这样的目的，是为了取值更快，存储的数据量越大，性能的表现越明显
     */
    private static void hashMap(){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Tom");
        map.put(2,"Jack");
        map.put(3,"Vince");
        map.put(4,"Bin");
        map.put(5,"Lily");

        System.out.println("size="+map.size());
        //从Map中取值
        System.out.println(map.get(1));//通过key取value

        //Map的遍历1:遍历Entry
        Set<Map.Entry<Integer,String>> entrySet=map.entrySet();
        for(Map.Entry e:entrySet){
            System.out.println(e.getKey()+"->"+e.getValue());
        }
        //Map的遍历2:遍历键
        Set<Integer> keys=map.keySet();
        for(Integer i:keys){
            System.out.println(i+"->"+map.get(i));
        }
        //Map的遍历3:遍历值
        Collection<String> values=map.values();
        for(String value:values){
            System.out.println(value);
        }
        //Map的遍历4:foreach
        map.forEach((key,value)-> System.out.println(key+"->"+value));

    }

    public static void main(String[] args){
        hashMap();
    }
}
