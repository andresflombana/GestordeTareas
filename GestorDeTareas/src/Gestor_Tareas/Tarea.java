package Gestor_Tareas;

import java.util.Arrays;

/**
 *
 * @author Andrés Lombana 
 */
public class Tarea {
    //atributos 
    
   private int id;
   private String descripcion;
   private int prioridad;

    public Tarea() {
    }

    public Tarea(int id, String descripcion, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
      
    
}