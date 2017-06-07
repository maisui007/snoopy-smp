package com.snoopy.study;
import org.joda.time.LocalTime;

/**
 * Created by hnair20160706 on 2017/6/2.
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
