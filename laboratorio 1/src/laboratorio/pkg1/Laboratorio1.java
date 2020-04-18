
package laboratorio.pkg1;
import java.util.Scanner;

/**
 *
 * @Vicente Salas
 */
public class Laboratorio1 {

  
    public static void main(String[] args) {
        
       /* Scanner scanf = new Scanner(System.in);
        String  nombre;
        nombre = scanf.next();
        System.out.println("Nombre: "+nombre);*/     
        
        Ventas TrabajadorVentas = new Ventas();
        TrabajadorVentas.Estatus();
        Bodega TrabajadorBodega = new Bodega();
        TrabajadorBodega.Estatus();
       
    
    }

    
}
