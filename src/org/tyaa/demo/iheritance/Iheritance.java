/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.demo.iheritance;

import java.util.Arrays;
import org.tyaa.demo.iheritance.models.Admin;
import org.tyaa.demo.iheritance.models.Model;
import org.tyaa.demo.iheritance.models.Person;
import org.tyaa.demo.iheritance.models.Student;
import org.tyaa.demo.iheritance.models.Subject;
import org.tyaa.demo.iheritance.models.Teacher;

/**
 *
 * @author student
 */
public class Iheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Student s1 = new Student();
        s1.name = "Name1";
        s1.age = 18;
        s1.avgScore = 10.5; */
        /* Student s1 = new Student(10.5, "Name1", 18);
        Student s2 = new Student(11.0, "Name2", 18);
        Teacher t1 = new Teacher(15000d, "Name11", 28);
        Teacher t2 = new Teacher(11000.0, "Name22", 38);
        
        s1.print();
        t2.print(); */
        
        Person s1 = new Student(10.5, "Name1", 18);
        Person s2 = new Student(11.0, "Name2", 18);
        Person t1 =
                new Teacher(
                        Arrays.asList(new Subject[] {new Subject("C#", 32), new Subject("Java", 48)}),
                        15000d,
                        "Name11",
                        28
                );
        Person t2 =
                new Teacher(
                        Arrays.asList(new Subject[] {new Subject("Maya 3d", 42), new Subject("3D Max", 40)}),
                        11000.0,
                        "Name22",
                        38
                );
        Person a1 = new Admin(12000d, "Name33", 25);
        
        System.out.println(a1);
        System.out.println(s1);
        // System.out.println(new Subject("C#", 32));
        
        /* String greetings = new String("Hello!");// "Hello!";
        System.out.println(greetings);
        
        Integer integer1 = 12;
        System.out.println(integer1);
        
        Object o1; */
        
        // s1.print();
        // t2.print();
        // a1.print();
    }
    
}
