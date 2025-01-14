/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author david
 */
public class Triangulo {
    public double base;
    public double altura;
    
    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double Area(){
        return base*altura/2;
    }
    
    public double Perimetro(){
        return base+altura+Hipotenusa();
        
    }    
    public double Hipotenusa(){
        return Math.pow((base*base)+(altura*altura), 0.5);
    }
    /*No se define un condicional para el triangulo equilatero ya que 
      un triangulo rectangulo en geometria euclidiana NUNCA es equilatero*/
    public String tipoTriangulo(){
        if ((base==altura)&& (altura!=Hipotenusa())){
            return "El triangulo es isosceles";   
    }else {
            return "El triangulo es escaleno";
        }
    }
    
}
