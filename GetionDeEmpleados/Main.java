public class Main {
    public static void main(String[] args) {
        // Crear algunos empleados
        Empleado empleado1 = new Empleado("Juan", "Perez", "12345678A", "Gerente", 50000);
        Empleado empleado2 = new Empleado("Maria", "Gomez", "87654321B", "Contable", 35000);

        // Crear un departamento
        Departamento departamento = new Departamento("Contabilidad", "Gestión de finanzas");

        // Agregar empleados al departamento
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);

        // Mostrar información de los empleados del departamento
        System.out.println("Empleados del departamento de " + departamento.getNombre() + ":");
        for (Empleado empleado : departamento.getEmpleados()) {
            System.out.println(empleado.toString());
            System.out.println("---------------------");
        }

        // Calcular salario total del departamento
        double salarioTotal = departamento.calcularSalarioTotalDepartamento();
        System.out.println("Salario total del departamento: " + salarioTotal);

        // Modificar salario de un empleado
        empleado1.setSalario(55000);

        // Mostrar información actualizada del empleado modificado
        System.out.println("Información actualizada de " + empleado1.getNombre() + ":");
        System.out.println(empleado1.toString());
    }
}
