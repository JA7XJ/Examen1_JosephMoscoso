/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author joseph
 */
public class atributos {
    private String name;
    private int age;

    public atributos() {
    }

    public atributos(String name) {
        this.name = name;
    }

    public atributos(int age) {
        this.age = age;
    }

    public atributos(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
