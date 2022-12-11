/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion_2;

/**
 *
 * @author leste
 */
public class Animal {
  public void makeSound() {
    System.out.println("Grr...");
  }
}
class Cat extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}
class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Woof");
  }
}

