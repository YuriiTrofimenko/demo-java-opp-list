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
public abstract class Employee extends Person {
    
    public Double salary;

    public Employee() {
        super();
    }

    public Employee(Double salary, String name, Integer age) {
        // super - вызов родительского конструктора с двумя аргументами,
        // который инициализирует поля name, age
        super(name, age);
        // конструктор класса-потомка также инициализирует поле salary
        this.salary = salary;
    }
    
    @Override
    public void print() {
        // вызов родительского метода print
        super.print();
        System.out.print("; salary = " + salary);
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + salary;
    }
}
