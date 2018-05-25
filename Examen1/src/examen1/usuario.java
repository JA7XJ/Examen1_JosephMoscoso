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
public class usuario {
    private String nombrec;
    private int edad;
    private String correo;
    private String user;
    private String pass;
    ArrayList<clases> clases=new ArrayList();

    public usuario() {
    }

    public usuario(String nombrec, int edad, String correo, String user, String pass) {
        this.nombrec = nombrec;
        this.edad = edad;
        this.correo = correo;
        this.user = user;
        this.pass = pass;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<clases> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Usuario{\n" + "Nombre completo=" + nombrec + "\nEdad=" + edad + ",\nCorreo electronico=" + correo + ",\nUser=" + user + ",\nPassword=" + pass + ",\nClases=" + clases + '}';
    }
    
}
