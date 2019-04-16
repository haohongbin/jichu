package com.vince;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream接口：不是存储数据结构，数据源可以是一个集合，为了函数式编程创造
 * 惰式执行，数据只能被消费一次
 *
 * 两种类型的操作方法：
 * 1.中间操作（生成一个Stream）
 * 2.结束操作（执行计算操作）
 */
public class StreamDemo {

    public static void main(String[] args){

        Stream<String> stream=Stream.of("good","good","study","day","day","up");
        //foreach方法
//        stream.forEach((s)->{ System.out.println(s); });
//        stream.forEach(System.out::println);

        //filter
//        stream.filter((s)->s.length()>3).forEach(System.out::println);

        //distinct去除重复元素
//        stream.distinct().forEach(System.out::println);

        //map
//        stream.map(s -> s.toUpperCase()).forEach(s -> {
//            System.out.println(s);
//        });

        //flatMap
//        Stream<List<Integer>> ss=Stream.of(Arrays.asList(1,2,3),Arrays.asList(4,5));
//        ss.flatMap(list->list.stream()).forEach(System.out::println);

        //reduce
//        BinaryOperator<>
//        Optional<String> opt=stream.reduce((s1, s2)->s1.length()>=s2.length()?s1:s2);
//        System.out.println(opt.get());

        //collect
        List<String> list=stream.collect(Collectors.toList());
        list.forEach(System.out::println);

        //:: 方法引用
        //引用静态方法  Integer::valueof
        //引用对象的方法 list::add
        //引用构造方法  ArrayList::new

    }
}
