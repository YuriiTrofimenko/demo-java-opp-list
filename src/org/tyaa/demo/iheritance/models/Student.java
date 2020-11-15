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
public class Student extends Person {
    
    public Double avgScore;

    public Student() {
        super();
    }

    public Student(Double avgScore, String name, Integer age) {
        // super - вызов родительского конструктора с двумя аргументами,
        // который инициализирует поля name, age
        super(name, age);
        // конструктор класса-потомка Student также инициализирует поле avgScore
        this.avgScore = avgScore;
    }

    // переопределение метода print, полученного по наследству от класса Person
    @Override
    public void print() {
        // вызов родительского метода print
        super.print();
        System.out.println("; avgScore = " + avgScore);
    }
    
    
}
