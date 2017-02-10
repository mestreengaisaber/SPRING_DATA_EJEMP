/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity
public class Persona {
     
     
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
     
    @Id
    private String dni;
     
    private String nombre;
    private String apellidos;
     
     
    public Persona(String dni, String nombre, String apellidos) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
     
    public Persona() {
        super();
    }
     
}