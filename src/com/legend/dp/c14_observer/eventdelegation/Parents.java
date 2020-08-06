package com.legend.dp.c14_observer.eventdelegation;

public class Parents {
    public void phoneNotice(Student s) {
        System.out.println(s.getName() + "考试分数 == " + s.getScore());
    }
}
