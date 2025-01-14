/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3aejercicio10;

public class PagoMatricula {
    double Patrimonio, PagoMatricula = 50000;
    int Estrato;
    
    PagoMatricula(double Patrimonio, int Estrato, double PagoMatricula){
        this.Patrimonio = Patrimonio;
        this.Estrato = Estrato;
        this.PagoMatricula = PagoMatricula;
    }
    public double Matricula(double Patrimonio, int Estrato, double PagoMatricula){
        if (Patrimonio > 2000000 && Estrato>3){
            return (PagoMatricula + (0.03*Patrimonio));
        }
        else{
            return PagoMatricula;
        }
    } 
}
