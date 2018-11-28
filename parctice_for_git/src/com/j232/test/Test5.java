package com.j232.test;

public class Test5 {
	public static void main(String[] args){
		// 基本数据类型的声明和赋值：三要素结构：变量类型 变量名 = 变量值;
		// 引用数据类型的声明和赋值：变量类型 变量名 = new 构造函数();
		// A a = new A();
		// B b = new B();
		
		// string有个特殊照顾：因为String用的特别多，所以在设计的时候值允许String这个引用数据类型有简写形式
		String string = new String("中华热");
		String string2 = "中华热";
		System.out.println(string2);
		System.out.println(string);
		
		// 基本数据类型 都有相对应的引用数据类型：叫做包装类
		/*
		 * byte - Byte
		 * short - Short
		 * int - Integer
		 * long - Long
		 * double - Double
		 * float - Float
		 * char - charector
		 * boolean - Boolean
		 * */
		 
		 int i = 124;
		 Integer integer = new Integer(124);
		 System.out.println(i);
		 System.out.println(integer);
		 
		 // 在jdk1.5版本之前，需要我们手动转
		 // 在jdk1.5版本之后，自动转
		 
		 // 从基本数据类型 转成 引用数据类型 - 装箱
		 int money = 100;
		 Integer money2 = money;// 自动转
		 System.out.println(money2);
		 Integer money3 = new Integer(money);// 手动转
		 
		 // 从引用数据类型 转成 基本数据类型 - 拆箱
		 Integer money4 = new Integer(160);
		 int money5 = money3;// 自动转
		 int money6 = money4.intValue(); // 手动转
		 System.out.println(money5); 
		 System.out.println(money6);
		 /*int i3 = 150;
		 int i4 = 150;
		 System.out.println(i3 == i4);*/
		 
		 Integer i1 = new Integer(123);
		 Integer i2 = new Integer(123);
		 System.out.println(i1 == i2);
		
		 // == 比较基本数据类型时，比的是值
		 // == 比较引用数据类型的，比的是内存地址
		 // new代表在内存中开辟一块空间
		 
		 // -128-127之间[代码重用]
		 Integer i5 = 100;
		 Integer i6 = 2900;
		 Integer i7 = 3000;
		 System.out.println(i5 == (i7-i6));
		 
		 
		 Integer i9 = new Integer(100);
		 Integer i10 = 80;
		 Integer i11 = 20;
		 System.out.println(i11 == (i9-i10));
		 
	}
}
