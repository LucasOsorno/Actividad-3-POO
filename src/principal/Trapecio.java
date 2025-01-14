/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author david
 */
public class Trapecio {
    double lado1, lado2, BM, Bm, altura;
    
    Trapecio(double BM, double Bm, double lado1, double lado2, double altura){
        this.BM = BM;
        this.Bm = Bm;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }
    
    double Area(){
        return((altura/2)*(BM+Bm));   
    }
    double Perimetro(){
        return (lado1+lado2+BM+Bm);
    }
    
}
