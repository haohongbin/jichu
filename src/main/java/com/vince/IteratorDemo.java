package com.vince;

import java.util.*;
import java.util.function.Function;

/**
 * 集合的输出（迭代）
 */
public class IteratorDemo {
    //foreach(1.5后)
    private static void iterator1(Collection<Cat> c){
        for(Cat cat:c){
            System.out.println(cat);
        }
    }

    //Iterator（1.5之前统一的迭代集合方式）
    private static void iterator2(Collection<Cat> c){
        Iterator<Cat> ite=c.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }

    private static void enumeration(){
        Vector<String> vs=new Vector<String>();
        vs.add("tom");
        vs.add("jack");
        vs.add("job");

        Enumeration<String> enumeration=vs.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }

    /**
     * JDK1.8新的迭代方法
     */
    private static void foreach(){
        List<String> list=new ArrayList<String>();
        list.add("tom");
        list.add("jack");
        list.add("job");

//        list.forEach((String s)->{System.out.println(s);});
//        list.forEach(s->System.out.println(s));
        list.forEach(System.out::println);
    }

    //表示接受一个参数并产生结果的函数
    private static void functionTest(){
        String s=strToUpp("vince",(str)->str.toUpperCase());
        System.out.println(s);

    }
    private static String strToUpp(String str, Function<String,String> f){
        return f.apply(str);
    }

    public static void main(String[] args){
        List<Cat> list=new ArrayList<Cat>();
        list.add(new Cat("mao1",5,1));
        list.add(new Cat("mao2",5,2));
        list.add(new Cat("mao3",5,3));
//        iterator1(list);
//        iterator2(list);
//        enumeration();
//        foreach();
        functionTest();
    }
}
