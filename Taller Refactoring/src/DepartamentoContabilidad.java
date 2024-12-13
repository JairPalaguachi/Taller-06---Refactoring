/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author henry
 */
public class DepartamentoContabilidad extends Departamento {
    @Override
    public double calcularAjuste() {
        return 10;
    }

    @Override
    public String toString() {
        return "Departamento Contabilidad";
    }
    
}