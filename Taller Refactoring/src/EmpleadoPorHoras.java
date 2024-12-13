public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;
    

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
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
        double salario = super.getHorasTrabajadas() * this.tarifaHora;
        return salario;
    }

    // Más metodos
}
