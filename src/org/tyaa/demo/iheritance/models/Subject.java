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
public class Subject {
    public Integer id;
    public String name;
    public Integer lessonsQuantity;

    public Subject(Integer id, String name, Integer lessonsQuantity) {
        this.id = id;
        this.name = name;
        this.lessonsQuantity = lessonsQuantity;
    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", name=" + name + ", lessonsQuantity=" + lessonsQuantity + '}';
    }
}
