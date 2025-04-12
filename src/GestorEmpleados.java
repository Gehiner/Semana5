import java.util.*;

public class GestorEmpleados {

    public static void ordenarPorSalario(List<Empleado> empleados) {
        empleados.sort(Comparator.comparingDouble(Empleado::getSalario));
    }

    public static Empleado busquedaLineal(List<Empleado> empleados, double salario) {
        for (Empleado e : empleados) {
            if (e.getSalario() == salario) {
                return e;
            }
        }
        return null;
    }

    public static Empleado busquedaBinaria(List<Empleado> empleados, double salario) {
        int index = Collections.binarySearch(empleados, new Empleado(0, "", "", "", salario),
                Comparator.comparingDouble(Empleado::getSalario));
        if (index >= 0) {
            return empleados.get(index);
        } else {
            return null;
        }
    }
}
