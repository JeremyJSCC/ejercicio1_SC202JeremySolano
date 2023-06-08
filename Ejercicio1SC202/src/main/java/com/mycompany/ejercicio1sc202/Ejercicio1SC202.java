/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1sc202;
import javax.swing.JOptionPane;
/**
 *
 * @author jerjo
 */
public class Ejercicio1SC202 {

    public static void main(String[] args) {
        
        String ingreso_personal;
        int cantidad_persona;
        ingreso_personal = JOptionPane.showInputDialog("Ingrese la cantidad de personas");
        cantidad_persona = Integer.parseInt(ingreso_personal);
        System.out.println(cantidad_persona);
        //////////////////////////////////////////////////////////////////////////////////////////////
        String salario_personal;
        int Salario; 
            for (int i = 0; i <cantidad_persona; i++){
            salario_personal = JOptionPane.showInputDialog("Ingrese los salarios");
            Salario = Integer.parseInt( salario_personal);
             
            double descuento = Salario * 0.0925;
            double salarioDescontado = Salario - descuento;
            System.out.println("Descuento aplicado para la persona " + (i+1) + ": " + descuento);
            System.out.println("Salario después del descuento para la persona " + (i+1) + ": " + salarioDescontado);
            
        }
            
            
          
    }
}
