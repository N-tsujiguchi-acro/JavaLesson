package sampleJava5;

public class Main4 {

    static class Dog {
        void bark() {
            System.out.println("ワンワン！");
        }
    }

    static class Cat {
        void meow() {
            System.out.println("ニャーニャー！");
        }
    }

    static class Car {
        void run() {
            System.out.println("車が走っています！");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();   // クラス名は Dog
        Cat cat = new Cat();
        Car car = new Car();

        dog.bark();
        cat.meow();
        car.run();
    }
}

