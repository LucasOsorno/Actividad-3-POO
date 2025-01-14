/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author david
 */
public class Cuadrado {
    public double lado;
    
    Cuadrado(double lado){
        this.lado = lado;
    }
    public double Area(){
        return Math.pow(lado,2);
    }
    public double Perimetro(){
        return 4*lado;
    } 
    
}
