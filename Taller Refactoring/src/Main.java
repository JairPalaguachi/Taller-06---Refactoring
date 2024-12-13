public class Main {
    public static void main(String[] args) {
        // Creación de departamentos
        Departamento sistemas = new DepartamentoSistemas();
        Departamento contabilidad = new DepartamentoContabilidad();
        Departamento medico = new DepartamentoMedico();

        // Creación de empleados
        EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Dario Laborde", 45, 15, sistemas, "Masculino");
        EmpleadoFijo emp2 = new EmpleadoFijo("Jorge Gaibor", 700, 45, contabilidad, 40, "Masculino");
        EmpleadoTemporario emp3 = new EmpleadoTemporario("Jordan Salinas", 200, 20, medico, 6, "Masculino");

        // Creación de la empresa
        Empresa empresa = new Empresa();

        // Contratación de empleados
        empresa.contratarEmpleado(emp1);
        empresa.contratarEmpleado(emp2);
        empresa.contratarEmpleado(emp3);

        // Impresión de detalles
        emp1.imprimirDetalles();
        emp2.imprimirDetalles();
        emp3.imprimirDetalles();
    }
    
}
