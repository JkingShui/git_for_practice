package com.j232.test;

public class Test3 {
	public static void main(String[] args){
		// 变量的声明
		// JAVA是一门强类型(必须强调类型)的语言：int这个盒子的类型（整数型）
		// money : 盒子的名字
		int money;
		// 变量的赋值
		// = 代表赋值
		money = 10;
		
		// 声明和赋值可以一起写
		// 我把10这个值放到名字叫money2的，类型是int的盒子里面去
		int money2 = 10;
		System.out.println(money2);
		
		//int money3 = 10;
		//int money4 = 10;
		// 同类型的变量可以一起声明赋值；
		int money3=20,money4=10,money5 = 10;
		System.out.println(money3);
		System.out.println(money4);
		System.out.println(money5);
		
		// 规定：变量在不赋值的时候不能使用
		System.out.println(money);
	}
}
