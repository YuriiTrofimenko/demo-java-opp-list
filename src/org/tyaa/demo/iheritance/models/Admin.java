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
public class Admin extends Employee {

    public Admin() {
        super();
    }

    public Admin(Double salary, String name, Integer age) {
        super(salary, name, age);
    }
}
