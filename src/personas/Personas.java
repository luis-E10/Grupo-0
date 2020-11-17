/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import Paquete2.Deportista;
import Paquete2.Doctor;

/**
 *
 * @author Luiss
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Doctor doctor = new Doctor();
        Deportista deportista = new Deportista();
        
        doctor.imprimirInformacion();
        System.out.println(doctor.obtenerInformacionPersona());
        
        System.out.println("\n");
        
        deportista.imprimirInformacion();
        System.out.println(deportista.obtenerInformacionPersona());
    }
    
}
