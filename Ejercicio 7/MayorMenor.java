/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3aejercicio7;

/**
 *
 * @author david
 */
public class MayorMenor {
    public static String MayorMenor(double A, double B){
        if (A>B){
            return "A es mayor que B";  
        }
        else if (A==B){
            return "A es igual que B";
        }
        else{
            return "B es mayor que A";
        }
    } 
}
