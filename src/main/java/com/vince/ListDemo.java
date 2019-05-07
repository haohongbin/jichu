package com.vince;
/**
 * 集合中分为三大接口：
 * Collection、Map、Iterator
 */

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Collection:用于存储单个对象的集合
 * List接口：
 * 1、有序的，可以重复
 * 2、允许多个null元素
 * 3、具体的实现类常用的：ArrayList,Vector,LinkedList
 * 在实际开发中，我们如何选择list的具体实现？
 * 1、安全性问题
 * 2、是否频繁插入、删除操作（LinkedList）
 * 3、是否是存储后遍历
 *
 * Set接口：
 *
 */
public class ListDemo {
    /**
     * LinkedList
     * 1、实现原理，采用双向链表结构实现
     * 2、适合插入，删除操作，性能高
     */

    private static  void  linkedList(){
        LinkedList<String> list=new LinkedList<String>();
        list.add("张老师1");
        list.add("张老师2");
        list.add("张老师3");
        list.add("张老师4");
        int size=list.size();
        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }

        for (String name:list){
            System.out.println(name);
        }

        Iterator<String> ite=list.iterator();
        while (ite.hasNext()){//判断下一个元素之后有值
            System.out.println("---"+ite.next()+"----");
        }

    }



    /**
     * Vector
     * 1、实现原理，采用动态数组实现，默认构造方法创建了一个大小为10的对象数组
     * 2、扩充的算法：当增量为0时，扩充为原来大小的2倍，当增量大于0时，扩充为原来大小+增量
     * 3、不适合删除或插入操作，会导致数组挪位置
     * 4、为了防止数组动态扩充次数过多，建议创建Vector时，给定初始容量
     * 5、线程安全（很多方法带了synchronized），适合在多线程访问时使用，在单线程下使用效率较低
     * 线程安全？比如：2个人（线程）共用一个厕所，线程安全就是一个人先用一个人排队等待；线程不安全就是两个人一起抢
     * 面试题：Vector与ArrayList的区别？
     */
    private static void vector(){
        Vector<String> v=new Vector<String>();
        v.add("张老师1");
        v.add("张老师2");
        v.add("张老师3");
        v.add("张老师4");

        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
    }

    /**
     * ArrayList
     * 1、实现原理，采用动态对象数组实现，默认构造方法创建了一个空数组
     * 2、第一次添加元素，扩充容量为10，之后的扩充算法：原来数组大小+原来数组的一半
     * 3、不适合进行删除或插入操作
     * 4、为了防止数组动态扩充次数过多，建议创建ArrayList时，给定初始容量
     * 5、多线程中不安全，适合在单线程访问时使用，效率高
     * 面试题：自己写一个ArrayList,动态数组扩充实现
     */
    private static void arrayList(){
        //使用集合来存储多个不同类型的元素（对象），那么在处理时会比较麻烦，在实际开发中不建议这样使用
        //我们应该在一个集合中存储相同的类型对象
        //List<String>限制list元素只能是String类型
        List<String> list=new ArrayList<String>();
        list.add("张老师1");
        list.add("张老师2");
        list.add("张老师3");
        list.add("张老师4");
//        list.add(10);
        //int size为局部变量放在栈中，遍历时从栈中读数据比每次执行list.size()快的多
        int size=list.size();
        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }
        //contains判断集合中是否有好老师
        System.out.println(list.contains("好老师"));
        //remove移除
        list.remove("张老师4");
        //toArray转换为数组
        String[] array=list.toArray(new String[]{});

        for (String name:array) {
            System.out.println(name);
        }

    }

    public static void main(String[] args){
//        linkedList();
//        vector();
//        arrayList();
        System.out.println(Timestamp.valueOf(LocalDateTime.now().plusMinutes(13)).getTime() / 1000);
        System.out.println(Timestamp.valueOf(LocalDateTime.now().minusMinutes(15)).getTime() / 1000);

    }
}
