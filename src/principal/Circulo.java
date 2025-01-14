/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author david
 */
public class Circulo {
    public double radio;
    
    Circulo(double radio){
        this.radio = radio;
    }
    public double Area(){
        return Math.PI *Math.pow(radio,2);
    }
    
    public double Perimetro(){
        return 2*Math.PI * radio;
    }
    
}
