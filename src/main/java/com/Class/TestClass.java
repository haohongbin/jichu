package com.Class;

/**
 * new关键字：表示向内存申请空间，也表示实例化一个对象，创建一个对象
 * 一个对象在内存中的大小，由该对象的所有属性所占内存大小的总和。引用类型变量在32位系统上占4个字节，在64位系统上占8个字节。加上而外的对象隐性数据所占的大小
 * 相同的类型才可以赋值
 * 不同的引用，指向同一个对象，任何一个引用改变对象的值，其他引用都会反映出来
 * 编程时要注意的问题，在确定不使用对象时，要尽早释放对象：引用=null
 * 当一个堆中的对象没有被任何引用变量所指向时，该对象就会被jvm的GC（清洁工）程序认为是垃圾对象，从而被回收
 */

public class TestClass {

    public static void main(String[] args){
        Animal animal=null;
        animal=new Animal();
        animal.age=4;
        animal.name="狗";
        animal=null;//把对象释放
//        animal.name="猫";  //当对象不存在时，调用该对象的属性和方法将报错（空指针）
        System.out.println(animal);

        Animal animal1=new Animal("老虎",13);
    }
}

class Animal{
    String name;
    int age;
    public Animal(){
        System.out.println("这是构造方法");
    }
    public Animal(String name){
        System.out.println("这是只有一个参数构造方法");
    }
    public Animal(String name,int age){
        this("狮子");
        System.out.println("这是有2个参数构造方法");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}