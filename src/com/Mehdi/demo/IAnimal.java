package com.Mehdi.demo;


public interface IAnimal {

    // void test();

    default void testDefault() {
        System.out.println("TESTING DEFAULT!");
    }

}