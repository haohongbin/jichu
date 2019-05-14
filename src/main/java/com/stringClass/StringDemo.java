package com.stringClass;

public class StringDemo {

    public static void main(String[] args){
        String s="小明";
        String s1=new String("小明");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        //直接赋值字符串连接时，考虑编译期和运行期
        //如果在编译期值可以被确定，那么使用已有的对象，否则会创建新的对象
        String a="a";//a在编译的时候可以确定
        String a1=a+1;//编译这一行时，a为变量，变量运行期才会有值,这个a1在堆中创建对象
        String a2="a1";//这个a2在常量池中创建的对象
        System.out.println(a1==a2);

        final String b="b";
        String b1=b+1;//b为常量，编译时常量+常量就可以确定值
        String b2="b1";
        System.out.println(b1==b2);

        String c=getString();
        String c1=c+1;//c的值是调用方法得到的，需要在运行时才能得到
        String c2="c1";
        System.out.println(c1==c2);

        final String d=getString2();//d虽然是常量，但是方法还是在运行期才能返回值
        String d1=d+1;
        String d2="d1";
        System.out.println(d1==d2);
    }

    private static String getString(){
        return "c";
    }
    private static String getString2(){
        return "d";
    }
}
