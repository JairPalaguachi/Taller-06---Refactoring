public class EmpleadoTemporario extends Empleado {
    
    private int mesesContrato;

    
    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.mesesContrato = mesesContrato;
        
    }
        

    //corregir Pull up Method
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + super.getNombre());
        System.out.println("Salario: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
