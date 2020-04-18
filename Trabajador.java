/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg1;

/**
 *
 * @author Desktop
 */
public class Trabajador {
    //atributos
    String nombre;
    String apellido;
    int    edad;
    char   sexo;
    String contrasenia;
    String profesion;
    String cargo;
    String areaDeTrabajo;
    //constructor
    
//metodos
public void Estatus(){
    
    
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Edad: " + edad);
    System.out.println("Sexo: " + sexo);
    System.out.println("Contrasenia: " + contrasenia);
    System.out.println("Profesion: " + profesion);
    System.out.println("Cargo: " + cargo);
    System.out.println("Area de trabajo: " + areaDeTrabajo);
}
}
