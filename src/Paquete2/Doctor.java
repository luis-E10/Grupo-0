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
public class Doctor extends Persona {
    
    public Doctor(){
        establecerProfecion("Doctora");
        establecerNombre("Ignaz Semmelweis");
    }

    @Override
    public String obtenerInformacionPersona() {
        return "Nacimiento: 1 de julio de 1818, Buda\nFallecimiento: 13 de agosto de 1865, Oberdöbling, Viena, Austria\n"
             + "Obras notables: La etiología, el concepto y la profilaxis de la fiebre puerperal (1860)\n"
             + "Educación: Universidad de Viena (1837–1844), Universidad Eötvös Loránd";
    }
}
