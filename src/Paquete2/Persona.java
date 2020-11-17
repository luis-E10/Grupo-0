/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

/**
 *
 * @author Luiss
 */
public abstract class Persona {
    
    private String nombre, identidad, telefono, profecion;
    
    
    public void establecerProfecion(String profecion){
        this.profecion = profecion;
    } 
    public String obtenerProfecion (){
        return this.profecion;
    }
    
    
    public void establecerNombre(String nombre){
        this.nombre = nombre;
    } 
    public String obtenerNombre (){
        return this.nombre;
    }
    
    
    public void imprimirInformacion(){
        System.out.println("Profecion: " + profecion);
        System.out.println("----------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("-------------------------------"); 
        
    }
    
    abstract String obtenerInformacionPersona();
    
    
}
