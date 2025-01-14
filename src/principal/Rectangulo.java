/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author david
 */
public class Rectangulo {
    public double lado1;
    public double lado2;
    
    Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double Area(){
        return lado1*lado2;
    }
    public double Perimetro(){
        return (2*lado1) + (2*lado2);
    }
    
}
