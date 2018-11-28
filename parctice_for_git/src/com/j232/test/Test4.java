package com.j232.test;

public class Test4 {
	public static void main(String[] args){
		// 如果直接写一个数字常量，默认就是int
		// -128~127
		byte b = 127;
		System.out.println(b);
		//
		short s = 150;
		System.out.println(s);
		
		int i = 10000;
		System.out.println(i);
		
		// long l = 10900000l;
		// long l = 10900000L;
		// 如果直接写一个整数数字常量，默认就是int(4)
		long l = 10900000;
		System.out.println(l);
		
		// 如果直接写一个浮点数字常量，默认就是double
		double d = 12.8;// 8
		System.out.println(d);
		
		// 由小到大自动转，由大到小需要强转
		float f = 12.8F; // 4
		System.out.println(f);
		
		// 字符型
		// 字符型的赋值需要使用单引号
		char c = 'a';
		System.out.println(c);
		// 布尔型
		
		boolean flag = true;
		flag = false;
		System.out.println(flag);
		
		double value1 = 100.9876;
		int result1 = (int)value1;
		System.out.println(result1);
		
		// char类型能不能强转
		char value2 = 'A';
		int result2 = value2;
		System.out.println(result2);
		
	}
}
