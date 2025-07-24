package com.example.jv;
//Base class rewritten
abstract class Bird {
 public abstract void makeSound();
}

interface Flyable {
 void fly();
}

class Sparrow extends Bird implements Flyable {
 @Override
 public void fly() {
     System.out.println("Sparrow flies high!");
 }

 @Override
 public void makeSound() {
     System.out.println("Sparrow chirps!");
 }
}

class Penguin extends Bird {
 @Override
 public void makeSound() {
     System.out.println("Penguin squawks!");
 }
}

//Example usage
public class Liskov_Substitution {
 public static void main(String[] args) {
     Bird sparrow = new Sparrow();
     Bird penguin = new Penguin();

     sparrow.makeSound();  // OK
     penguin.makeSound();  // OK

     // Only birds that are Flyable can fly:
     makeItFly(sparrow);

     // The following is not allowed and prevented by type system:
     // makeItFly(penguin); // Compile error

     // If you need to handle flying birds only:
     Flyable flyingBird = new Sparrow();
     flyingBird.fly();
 }

 static void makeItFly(Bird bird) {
     if (bird instanceof Flyable) {
         ((Flyable) bird).fly();
     } else {
         System.out.println("This bird can't fly.");
     }
  }
}
