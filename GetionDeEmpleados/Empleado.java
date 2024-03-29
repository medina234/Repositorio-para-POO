public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private String cargo;
    private double salario;

    public Empleado(String nombre, String apellido, String dni, String cargo, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Método toString para devolver una cadena con la información del empleado
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "DNI: " + dni + "\n" +
               "Cargo: " + cargo + "\n" +
               "Salario: " + salario;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
