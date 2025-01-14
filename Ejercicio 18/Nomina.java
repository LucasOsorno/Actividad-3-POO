/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3aejercicio18;

public class Nomina {
    int Horas,Retencion;
    double ValorHora;
    
    Nomina(int Horas, double ValorHora, int Retencion){
        this.Horas = Horas;
        this.ValorHora = ValorHora;
        this.Retencion = Retencion;
    }
    double Bruto(){
        return Horas * ValorHora;
    }
    double Neto(){
        return (Horas*ValorHora)-((Horas*ValorHora)*Retencion/100);
    }
    
}
