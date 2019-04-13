package com.vince;

import java.util.HashSet;
import java.util.Set;

/**
 * Set接口
 * 1、无序的（不保证顺序）
 * 2、不允许重复
 * HashSet、TreeSet、LinkedHashSet
 */
public class SetDemo {

    /**
     * HashSet
     * 1.实现原理，基于哈希表（HashMap）实现
     * 2.不允许重复，可以有一个NULL元素
     * 3.不保证顺序值很久不变
     * 4.添加元素时把元素作为HashMap的key存储，HashMap的value使用一个固定的object对象
     * 5.排除重复元素是通过equals来检查对象是否相同
     * 6.判断两个对象是否相同，先判断两个对象的hashCode是否相同，如果两个对象的hashCode相同，不一定是同一个对象，如果不同，
     * 那一定不是同一个对象，如果不同，则两个对象不是同一个对象，如果相同，还要进行equals判断，equals相同则是同一个对象，不同则不是同一个对象
     * 7.自定义对象要认为属性值都相同时为同一个对象，有这种需求时，那么我们要重写对象所在类的hashCode和equals方法
     *
     * 小结
     * （1）哈希表的存储结构：数组+链表，数组里的每个元素以链表的形式存储
     * （2）如何把对象存储到哈希表中，先计算对象的hashCode值，再对数组的长度求余数，来决定对象要存储在数组中的哪个位置
     * （3）解决hashSet中的重复值使用的方法时，参考第6点
     */
    private static void hashSet(){
        Set<String> set=new HashSet<String>();
        set.add("飞飞");
        set.add("刘备");
        set.add("诸葛亮");
        set.add("关羽");
        set.add("曹操");
        set.add("曹操");

        String[] names=set.toArray(new String[]{});
        for(String s:names){
            System.out.println(s);
        }
        //c1和c4虽然值一样但对象不同
        Cat c1=new Cat("miaomiao",5,1);
        Cat c2=new Cat("miaomiao2",2,2);
        Cat c3=new Cat("miaomiao3",5,1);
        Cat c4=new Cat("miaomiao",5,1);
        Set<Cat> cats=new HashSet<Cat>();
        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        cats.add(c4);
        System.out.println(cats.size());
        for(Cat cat:cats){
            System.out.println(cat);
        }
        System.out.println("c1="+c1.hashCode());
        System.out.println("c2="+c2.hashCode());
        System.out.println("c3="+c3.hashCode());
        System.out.println("c4="+c4.hashCode());


    }


    public static void main(String[] args){
        hashSet();
    }
}
