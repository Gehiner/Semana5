import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado(1, "Carlos Alberto", "Martínez Rodríguez", "M", 2952670));
        empleados.add(new Empleado(2, "Teresa", "Nicolás Otaño", "F", 2338617));
        empleados.add(new Empleado(3, "Rosa Alquidia", "Lázala Polanco", "F", 2355228));
        empleados.add(new Empleado(4, "Ivellisse", "Estévez Ventura", "M", 1801728));
        empleados.add(new Empleado(5, "Margarita", "Núñez de la Cruz", "F", 3124269));
        empleados.add(new Empleado(6, "Belkis Josefina", "Hernández", "F", 2975450));
        empleados.add(new Empleado(7, "Ruth", "Ortega", "F", 2306902));
        empleados.add(new Empleado(8, "Lourdes", "Florentino de la Cruz", "F", 2583729));
        empleados.add(new Empleado(9, "Luisa", "Mejía", "F", 2160378));
        empleados.add(new Empleado(10, "Cándido", "Mercedes Vargas", "M", 1961114));

        // Ordenar lista
        GestorEmpleados.ordenarPorSalario(empleados);

        System.out.println("Lista ordenada por salario:");
        empleados.forEach(System.out::println);

        // Búsqueda lineal
        double salarioABuscar = 2338617;
        Empleado encontradoLineal = GestorEmpleados.busquedaLineal(empleados, salarioABuscar);
        System.out.println("\nResultado de búsqueda lineal:");
        System.out.println(encontradoLineal != null ? encontradoLineal : "No encontrado.");

        // Búsqueda binaria
        Empleado encontradoBinario = GestorEmpleados.busquedaBinaria(empleados, salarioABuscar);
        System.out.println("\nResultado de búsqueda binaria:");
        System.out.println(encontradoBinario != null ? encontradoBinario : "No encontrado.");
    }
}
