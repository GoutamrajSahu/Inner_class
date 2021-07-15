package com.company;

class Animal{
    void Details(){
        System.out.println("I am an animal,");
    }
    class Dog {
        void Details() {
            System.out.println("I sounds like Bhaooo..., and also I Hate Cats.");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Animal.Dog DOG = new Animal().new Dog();
        new Animal().Details();
        DOG.Details();
    }
}