/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 *
 * @author joseph
 */
public class clases {
    private String nombre;
    ArrayList<metodos> m=new ArrayList();
    ArrayList<atributos> a=new ArrayList();

    public clases() {
    }

    public clases(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<metodos> getM() {
        return m;
    }

    public void setM(ArrayList<metodos> m) {
        this.m = m;
    }

    public ArrayList<atributos> getA() {
        return a;
    }

    public void setA(ArrayList<atributos> a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "clases{\n" + "Nombre de la clase=" + nombre + ",\nMetodos=" + m + ",\nAtributos=" + a + "\n}";
    }
    
}
