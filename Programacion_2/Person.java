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
public class Person {
        
    protected static String name;
    protected int age;
    
    public void grado(){
        System.out.println("Grado: ");
    }
    
    public void person(String name, int age) {
        Person.name = name;
        this.age = age;
        
    }

    public static class Programmer extends Person {

        String language;

        public void programmer(String name, int age, String language) {
            super.person(name, age);
            this.language = language;   
        }
        @Override
        public void grado(){
            System.out.println("Grado: Programador");
        }
    }

    public static class Dancer extends Person {

        String dance;

        public void dancer(String name, int age, String dance) {
            super.person(name, age);
            this.dance = dance;
        }
    }

    public static void main(String[] args) {

        // Upcasting
        Person p = new Programmer();
        p.grado();
        //Downcasting
        Programmer p1=(Programmer)p;
        p1.programmer("Lester",18,"Java");
        
        System.out.print(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.language);
    }
}
