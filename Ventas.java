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
public class Ventas extends Trabajador {
    //generan ordenes de venta y pueden ver el precio base del los automoviles segun el modelo, no pueden modificar

    //atributos

    //constructor
     public Ventas() {
         this.contrasenia = "123abc";
         this.nombre = "juan";
         this.apellido = "perez";
         this.edad = 25;
         this.sexo = 'm';         
         this.areaDeTrabajo = "ventas";
         this.profesion = "vendedor";
         this.cargo = "vendedor";
    }
}
