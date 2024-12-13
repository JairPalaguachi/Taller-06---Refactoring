public class EmpleadoTemporario extends Empleado {
    
    private int mesesContrato;

    
    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.mesesContrato = mesesContrato;
        
    }
        

    //corregir Pull up Method
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Genero: " + genero);
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
