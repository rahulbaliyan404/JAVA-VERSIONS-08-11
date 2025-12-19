package com.home.java8.lambda.demo1;

public class DemoTest1 {

    public static void main(String[] args) {

//        // Anonymous Inner Class Implementation
//        DemoInterface1 demoInterface1 = new DemoInterface1() {
//            @Override
//            public void add() {
//                System.out.println("Anonymous Inner Class Implementation");
//
//            }
//        };
//        demoInterface1.add();
//        // Lambda Expression Implementation
//        DemoInterface1 demoInterface12 = () -> {
//            System.out.println("Lambda Expression Implementation");
//        };
//        demoInterface12.add();

        DemoInterface1 demoInterface2 = (int a, int b) -> a+b;
        System.out.println(demoInterface2.add2(10,20));

    }
}
