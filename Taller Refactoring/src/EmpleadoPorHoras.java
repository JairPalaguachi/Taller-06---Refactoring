public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;
    

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento,genero);
        super.setSalarioBase(calcularSalario());
        this.tarifaHora= tarifaHora;
        
    }
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Genero: " + genero);
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas()*this.tarifaHora;
    }

    // Más metodos
}
