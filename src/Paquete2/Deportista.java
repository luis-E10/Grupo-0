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
public class Deportista extends Persona {
    
    public Deportista(){
        establecerProfecion("Deportista");
        establecerNombre("Lionel Andrés Messi");
    }

    @Override
    public String obtenerInformacionPersona() {
        return "Nacimiento: 24 de junio de 1987\nEstatura: 1,7 m"
             + "\nEquipos actuales: Fútbol Club Barcelona (#10 / Delantero)"
             + "\nSalario: 26 millones";
    }
    
}
