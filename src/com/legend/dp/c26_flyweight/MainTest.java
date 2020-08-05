package com.legend.dp.c26_flyweight;

/*
 * 当前示例：享元模式-->快速生成类似网站
 * 定义：运用共享技术有效支持大量细粒度对象
 * 适用场景：一个应用程序因为使用了大量对象而造成了很大存储开销或者大量对象的某些状态可以作为外部状态（在真正使用时用参数的形式传入），而剩下的状态可以用一个共享对象代替
 * 特点：可以避免使用大量相似类，大幅减少实例个数从而减少资源消耗
 * */

public class MainTest {
	
	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		
		WebSite a = f.getWebSiteCategory("产品展示");
		a.use(new User("小明"));
		
		WebSite b = f.getWebSiteCategory("产品展示");
		b.use(new User("小李"));
		
		System.out.println("--------------");
		System.out.println(f.getWebSiteCount());
	}
}