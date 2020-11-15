/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.demo.iheritance.models;

import java.util.List;

/**
 *
 * @author student
 */
public class Teacher extends Employee {
    
    public List<Subject> subjects;

    public Teacher() {
        super();
    }

    public Teacher(List<Subject> subjects, Double salary, String name, Integer age) {
        // super - вызов родительского конструктора с двумя аргументами,
        // который инициализирует поля name, age, salary
        super(salary, name, age);
        // конструктор класса-потомка Student также инициализирует поле subjects
        this.subjects = subjects;
    }
    
    @Override
    public void print() {
        // вызов родительского метода print
        super.print();
        System.out.println("; subjects = " + subjects);
    }
}
