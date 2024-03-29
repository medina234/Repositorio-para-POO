import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String descripcion;
    private List<Empleado> empleados;

    public Departamento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.empleados = new ArrayList<>();
    }

    // Métodos para gestionar empleados en el departamento
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public void modificarSalarioEmpleado(Empleado empleado, double nuevoSalario) {
        empleado.setSalario(nuevoSalario);
    }

    public double calcularSalarioTotalDepartamento() {
        double salarioTotal = 0;
        for (Empleado empleado : empleados) {
            salarioTotal += empleado.getSalario();
        }
        return salarioTotal;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
