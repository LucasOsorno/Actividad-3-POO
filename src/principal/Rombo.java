/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author david
 */
public class Rombo {
    double D, d;
    
    Rombo(double D, double d){
        this.D = D;
        this.d = d;
    }
    double Area(){
        return (D*d/2);
    }
    double Perimetro(){
        return (4*Math.sqrt(Math.pow((D/2),2) + Math.pow((d/2), 2)));
    }
/*Se hacen los calculos así ya que dadas las diagonales, se puede
    conocer el lado del rombo mediante el Teorema de Pitagoras
    */
    
    double Lado(){
        return (Math.sqrt(Math.pow((D/2),2) + Math.pow((d/2), 2)));
    }
    
    
}
