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
public abstract class Model {
    
    private static Integer lastId = 0;
    
    private Integer id;
    
    public Model() {
        this.id = ++lastId;
    }
    
    public Integer getId(){
        return this.id;
    }

    public void print() {
        System.out.print("id = " + id);
    }

    @Override
    public String toString() {
        return "id=" + id;
    }
}
