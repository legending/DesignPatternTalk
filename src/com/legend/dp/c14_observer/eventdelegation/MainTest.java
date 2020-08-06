package com.legend.dp.c14_observer.eventdelegation;

/*
* 事件委托模式-->一种可以避开观察者缺点而设计模式
* 事件代理解彻底解除了观察者与被观察者的依赖关系，更新方法可以任意指定，通知对象也可以按需指定
* */

public class MainTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("马老师");
        Student lq = new Student("李青",90);
        Student zh = new Student("张华",86);
        Parents parents = new Parents();
        teacher.addObserver("speak", lq, null);
        teacher.addObserver("speak", zh, null);
        teacher.addObserver("phoneNotice", parents, new Object[]{lq});
        teacher.notifyObserver();
    }
}