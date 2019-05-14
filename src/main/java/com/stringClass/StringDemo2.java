package com.stringClass;

import java.util.Arrays;

public class StringDemo2 {

    public static void main(String[] args){
        String str="fkwefad6737383";
        //返回指定索引处的 char 值
        char s1=str.charAt(0);
        System.out.println(s1);

        //将此字符串转换为一个新的字符数组
        char[] s2=str.toCharArray();
        System.out.println(s2);

        //public String(char[] value)构造，将全部的字符数组变为字符串
        char[] cs={'a','b','c'};
        String str2=new String(cs);
        System.out.println(str2);

        //public String(char[] value，int offset,int count)构造，将指定范围的字符数组变为字符串
        String str3=new String(cs,0,1);
        System.out.println(str3);

        //使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
        byte[] bytes=str.getBytes();
        System.out.println(Arrays.toString(bytes));

        //public String(byte[] bytes)构造，将字节数组变为字符串
        String str4=new String(bytes);
        System.out.println(str4);

        //public String(byte[] bytes，int offset,int length)构造，将指定范围的字节数组变为字符串
        String str5=new String(bytes,0,2);
        System.out.println(str5);

        //public String(byte[] bytes，String charsetName)构造，通过使用指定的charset解码指定的byte数组，构造一个新的String

        /**
         * 判断是否以指定内容开头或结尾
         */
        //测试此字符串是否以指定的前缀开始
        System.out.println(str.startsWith("af"));
        //测试此字符串从指定索引开始的子字符串是否以指定前缀开始
        System.out.println(str.startsWith("k",1));


        /**
         * 替换操作
         */
        String str6=str.replace('f','0');
        System.out.println(str6);

        String str7=str.replaceAll("\\d","*");
        System.out.println(str7);

        /**
         * 字符串截取操作
         */
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));

        /**
         * 拆分操作
         */
        //按照指定的字符串拆分
        System.out.println(Arrays.toString(str.split("d")));
        //拆分字符串，并指定拆分的个数
        System.out.println(Arrays.toString(str.split("d",2)));

        /**
         * 查找操作
         */
        //返回一个字符串是否存在
        System.out.println(str.contains("1a"));
        //从头查找指定的字符是否存在，char->int 如果存在返回位置，如果不存在返回"-1"
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));

        //判断是否为空，指的是内容为空
        System.out.println("是否为空"+"".isEmpty());
        //字符串的长度
        System.out.println(str.length());
        //转小写
        System.out.println(str.toLowerCase());
        //转大写
        System.out.println(str.toUpperCase());
        //去掉开头和结尾的空格，中间的空格不去
        System.out.println("  dj ks  ".trim());
        //字符串连接操作
        System.out.println(str.concat("0000"));
    }
}
