package com.stringClass;

/**
 * 使用String连接字符串，代码性能会非常低，因为String的内容不可改变
 * 解决这个问题的方法是使用StringBuffer
 */
public class StringBufferDemo {

    public static void main(String[] args){
        String a="a";
        String b="b";
        String c=a+b+1;//创建了5个对象a b 1 ab ab1
        System.out.println(c);

        /*
        StringBuffer目的是来解决字符串相加时带来的性能问题（常量+变量）
        StringBuffer的内部实现采用字符数组，默认数组的长度为16，超过数组大小时，动态扩充的算法是原来长度*2+2
        所以当我们预知要添加的数据长度时，建议使用待初始化容量的构造方法，来避免动态扩充的次数，从而提高效率
        synchronized线程安全的，会影响性能
         */
        StringBuffer sb=new StringBuffer(32);//带容量的构造（建议）
        sb.append(a).append(b).append(1);
        System.out.println(sb.toString());

        StringBuffer sb2=new StringBuffer("abc");
        //删除指定位置的内容
        System.out.println(sb2.delete(1,2));
        //字符串的查询功能
        System.out.println(sb2.indexOf("c"));
        //在指定位置上增加一个内容
        System.out.println(sb2.insert(1,"hh"));
        //将指定范围的内容替换成其他内容
        System.out.println(sb2.substring(1,3));
        //字符串截取
        System.out.println(sb2.substring(2));
        //字符串反转
        System.out.println(sb2.reverse());

        //循环实现字符串反转
        String s="abc";
        String s1="";
        char[] chars=s.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            s1+=chars[i];
        }


    }

}
