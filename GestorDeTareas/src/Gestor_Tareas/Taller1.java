package Gestor_Tareas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrés Lombana
 */

public class Taller1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Tarea> misTareas = new ArrayList<>();
        boolean activo = true;

        do {
            System.out.println("Ingrese una opción:");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Mostrar Tareas");
            System.out.println("3. Salir");
            int opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("===Agregar Tareas===");
                    System.out.println("Ingrese el id de la tarea");
                    int id = lector.nextInt();
                    System.out.println("Ingrese la descripción de la tarea");
                    lector.nextLine();
                    String descripcion = lector.nextLine();
                    System.out.println("Ingrese la prioridad de 1-5");
                    int prioridad = lector.nextInt();
                    Tarea nuevaTarea = new Tarea(id, descripcion, prioridad);
                    misTareas.add(nuevaTarea);
                    System.out.println("La tarea fue guardada con éxito");
                    break;

                case 2:
                    System.out.println("===Tareas Registradas===");
                    // Mostrar tareas en orden descendente de prioridad
                    for (int i = 5; i >= 1; i--) {
                        for (Tarea t : misTareas) {
                            if (t.getPrioridad() == i) {
                                System.out.println("id: " + t.getId());
                                System.out.println("descripcion: " + t.getDescripcion());
                                System.out.println("prioridad: " + t.getPrioridad());
                                System.out.println("==========");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Programa Terminado");
                    activo = false;
                    break;

                default:
                    System.out.println("Opción No Válida");
                    break;
            }
        } while (activo);
    }
}
