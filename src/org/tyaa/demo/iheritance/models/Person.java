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
public abstract class Person {
    
    private static Integer lastId = 0;
    
    private Integer id;
    public String name;
    public Integer age;
    // конструктор класса Person, заданный явно
    public Person() {
        this.id = ++lastId;
    }
    // второй конструктор (перегруженный конструктор),
    // принимающий два аргумента - имя и возраст
    public Person(String name, Integer age) {
        this.id = ++lastId;
        this.name = name;
        this.age = age;
    }
    
    public Integer getId(){
        return this.id;
    }

    public void print() {
        System.out.print("id = " + id + "; name = " + name + "; age = " + age);
    }
}
