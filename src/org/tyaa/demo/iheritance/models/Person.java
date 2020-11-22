/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.demo.iheritance.models;

/**
 *
 * @author student
 */
public abstract class Person extends Model{
        
    public String name;
    public Integer age;
    // конструктор класса Person, заданный явно
    public Person() {
    }
    // второй конструктор (перегруженный конструктор),
    // принимающий два аргумента - имя и возраст
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.print("; name = " + name + "; age = " + age);
    }

    @Override
    public String toString() {
        return super.toString() + ", name=" + name + ", age=" + age;
    }
}
