package com.array;

/**
 * 使用数组需要注意的问题：
 * 空指针异常:当一个变量为null（没有赋值）时，我们去调用了该变量的属性和方法
 *
 * 数组越界异常
 *
 * 数组内存结构分析：数组是引用类型，会存放在堆内存中
 */
public class TestArray {

    static int[] scores={59,75,83,93,100};

    public static void print(int[] x){
        for(int i:x){
            System.out.println(i);
        }
    }

    //jdk1.5可变参数
    //可变参数只能是参数列表中的最后一个
    //可变参数作为数组使用
    public static void print2(int ...x){
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }

    //测试数组的异常
    public static void print3(int[] x){
        System.out.println(x.length);
    }

    //测试数组下标越界
    public static void print4(int[] x){
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        System.out.println(x[6]);
    }

    public static void main(String[] args){
//        print2(59,75,83,93,100);
//        print3(null);
        print4(scores);
    }
}
