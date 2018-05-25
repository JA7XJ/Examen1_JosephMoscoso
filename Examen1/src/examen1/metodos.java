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
public class metodos {
    ArrayList x=new ArrayList();
    private String cuerpo;
    private String name;

    public metodos() {
    }
    
    public metodos(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    public metodos(String cuerpo, String name) {
        this.cuerpo = cuerpo;
        this.name = name;
    }

    public ArrayList getX() {
        return x;
    }

    public void setX(ArrayList x) {
        this.x = x;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
