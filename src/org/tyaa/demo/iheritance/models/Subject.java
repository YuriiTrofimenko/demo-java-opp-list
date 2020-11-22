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
public final class Subject extends Model {
    
    public String name;
    public Integer lessonsQuantity;

    public Subject(String name, Integer lessonsQuantity) {
        this.name = name;
        this.lessonsQuantity = lessonsQuantity;
    }

    @Override
    public String toString() {
        return "Subject{"+ super.toString() +", name=" + name + ", lessonsQuantity=" + lessonsQuantity + '}';
    }
}
