package com.Mehdi.demo;

class Cat extends AAnimal implements IAnimal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void test() {
        System.out.println(getName() + getAge());
    }

}