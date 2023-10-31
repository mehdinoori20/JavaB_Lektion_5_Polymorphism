package com.Mehdi.demo;

import java.util.ArrayList;
import java.util.List;

        public class Main {
            public static void main(String[] args) {


                // Instantiate Animals
                Dog dog = new Dog("Benny", 15);
                Cat cat = new Cat("Frida", 22);

               /* TODO - Instantiate Interfaces, good question!
        IAnimal test = new IAnimal() {
            @Override
            public void testDefault() {
                IAnimal.super.testDefault();
            }
        };

        test.testDefault();

        */

                List<AAnimal> zooList = new ArrayList<>();
                List<IAnimal> zooListI = new ArrayList<>();
                zooList.add(dog);
                zooList.add(cat);

                zooListI.add(dog);
                zooListI.add(cat);

                System.out.println( dog.getName() );
                System.out.println( cat.getName() );

                dog.setName("Tommy");
                cat.setName("Tilda");

                System.out.println( dog.getName() );
                System.out.println( cat.getName() );


            }
        }