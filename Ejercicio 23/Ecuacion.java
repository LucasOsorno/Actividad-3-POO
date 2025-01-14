/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3aejercicio23;

public class Ecuacion {
    public static double solucion1 (double A,double B,double C){
        return (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
    }
    public static double solucion2 (double A,double B,double C){
        return (-B - Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
    }
    public static double Discriminante(double A,double B,double C){
        return Math.pow(B,2) - 4*A*C;
    }  
}
