package oops_question;

 class Animal{
     void sound() {
         System.out.println("different animal makes different sound ");
     }
 }

 class Dog extends Animal{
     void sound() {
         System.out.println("Dog barks");
     }


 }

public class UsingInheritance {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.sound();

    }
}
