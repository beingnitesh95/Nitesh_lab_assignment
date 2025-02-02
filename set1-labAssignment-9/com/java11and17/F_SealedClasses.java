package com.java11and17;

        sealed class  Animal permits Dog, Cat{
            void sound(){
                System.out.println();
            }
        }
        non-sealed class Dog extends Animal{
            @Override
            void sound(){
                System.out.println("bark");
            }
        }
        final class Cat extends Animal{
            @Override
            void sound(){
                System.out.println("meow");
            }
        }
        class Human{

        }
        public class F_SealedClasses {
            public static void main(String[] args) {
                Dog dog = new Dog();
                dog.sound();

                Cat cat = new Cat();
                cat.sound();

            }

}
