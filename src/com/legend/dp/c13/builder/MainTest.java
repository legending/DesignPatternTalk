package com.legend.dp.c13.builder;

/*
 * 当前实例：建造者模式
 * 适用场景：当创建对象的算法很复杂，想要把算法与该对象的组成部分与装配过程分离的时候
 * 好处：将复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 特点：顶层调用者只需要指定构造者就可以得到自己想要的对象，而不需要知道具体建造过程与细节
 * */

public class MainTest {

    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuildA b1 = new ConcreteBuildA();
        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();
        System.out.println("----------------------");

        ConcreteBuildB b2 = new ConcreteBuildB();
        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }

}
