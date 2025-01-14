/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3aejercicio19;

public class TrianguloEquilatero {
 int lado;
 TrianguloEquilatero(int lado){
     this.lado = lado;
 }
 double Area(){
     return ((Math.pow(lado, 2)*Math.sqrt(3))/4);   
}
 double Perimetro(){
     return (3 * lado);
 }
 double Altura(){
     return ((Math.sqrt(3)*lado)/2);
 }
}
