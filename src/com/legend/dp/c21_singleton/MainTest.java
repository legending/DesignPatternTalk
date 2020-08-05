package com.legend.dp.c21_singleton;

/*
 * 当前示例：单例模式
 * 定义：保证一个类仅有一个实例，并提供一个公共方法访问该实例
 * 适用场景：一个类在整个应用中只需要一个实例的时候
 * 特点：对唯一实例的受控访问，构造方法私有，get方法是public static的
 * */

public class MainTest {

	public static void main(String[] args) {
        Singleton3 s1 = Singleton3.getInstance();
        Singleton3 s2 = Singleton3.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
