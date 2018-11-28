package com.j232.test;

public class Test6 {
	public static void main(String[] args){
		/*String str = new String("abc");
		System.out.println(str);
		
		str = "bcd";
		str = "abc";
		System.out.println(str);*/
		String str = "abcdefghijklmnopqrstuvwxyz";
		
//		 public char charAt(int index);
		// public 公共的
		// char 代表返回值：它一定会返回给我们一个char类型的值
		// charAt 方法的名字
		// (int index)，代表方法的参数，使用这个方法的时候传进去参数
		// . 分量词，理解：的
		char result = str.charAt(5);
		System.out.println(result);
		
		//public String concat(String str)
		
		String result2 = str.concat("1234");
		System.out.println(result2);
		
		//public boolean contains(String s)
		boolean result3 = str.contains("abd");
		System.out.println(result3);
		
		//public boolean endsWith(String suffix)
		boolean result4  = result2.endsWith("1234");
		System.out.println(result4);
		
		// charAt
		// concat
		// contains
		// endsWith
		// equals
		// equalsIgnoreCase
		// indexOf
		// lastIndexOf
		// length
		// replace
		// replaceAll
		// split
		// startsWith
		// substring
		// toLowerCase
		// toUpperCase
		// trim
		
		
		 
	}
}
