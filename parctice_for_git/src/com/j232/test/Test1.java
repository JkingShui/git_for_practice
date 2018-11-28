package com.j232.test;

/**这是我们的测试类，测试注释，输出语句和转义字符*/
public class Test1 {
	/**
	 * 这方法用户测试注释(做笔记)
	 * args - main方法的固定参数
	 * */
	public static void main(String[] args){
		/*
		 * 换行输出测试
		 * */
		System.out.println("1\t2\t3");
		System.out.println("jj");
		System.out.print("456\n");
		
		
		// 我想输出 我叫[小明]今年[23]岁
		/*String name = "xiaoming";
	    int age = 23;
	    
	    System.out.println("我叫" + name + "今年 " +age + "岁");*/
	    
	    // 第一个参数是字符串，在字符串里写占位符
	    // 从第二个参数开始，写占位符的值
		// %s代表占了一个字符串的位置
		// %d代表占了一个数字的位置
		System.out.printf("我叫%s，我今年%d\n","xiaoming",23);
		
		// 想\n 和 \t这样的预定义格式是没有办法直接输出的
		// 我们需要使用转义字符来解决这个问题
		// 所谓的转义就是废除某些单词原来的功能，让它作为纯文本输出
		// 格式: \
		System.out.println("\\n");
		System.out.println("\\t");
		
	}
	
}
