/*

 */
package Tarea_en_grupo_Modulo6;

/**
 *
 * @author Anthony avila 
 */
public class Deportista extends Personas {
    
    public Deportista(String datocadena, int datonumerico, int edad, String nombre) {
        super(datocadena, datonumerico, edad, nombre);
    }

  //aqui hago referencia a la variable dato cadena como el deporte que practica la persona
    public void ingreso_datocadena() {
        System.out.println("Que deporte practicas: ");
        setDatocadena(s.nextLine());
    }

// aqui hago referencia a la variable dato numerico como el tiempo de expericia en el deporte
    public void ingreso_datonumerico() {
        System.out.println("Dime hace cuantos años lo practicas: ");
        setDatonumerico(s.nextInt());
    }
public void ingreso_datospersonales()
    {
        System.out.println("Ingrese su nombre: ");
        setNombre( s.nextLine());
        System.out.println("Ingrese su edad: ");
        setEdad(s.nextInt());
       
        
    }

    public void muestrodatos() {
        System.out.println("Nombre:-----------------"+getNombre());
        System.out.println("Edad:------------------ "+getEdad());
        System.out.println("Deporte:----------------"+getDatocadena());
        System.out.println("Experiencia:------------"+getDatonumerico()+" años");
    }
    
}
