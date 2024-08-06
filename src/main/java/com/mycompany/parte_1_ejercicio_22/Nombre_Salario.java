/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_ejercicio_22;

/**
 *
 * @author Alejandro Bernal
 */
public class Nombre_Salario {
    double horas;
    double valor_hora;
    String nombre;
    public Nombre_Salario(double horas, double valor_hora, String nombre) {
        this.horas = horas;
        this.valor_hora = valor_hora;
        this.nombre = nombre;
    }
    String Salario() {
        
        if((horas*valor_hora)>450000){ 
            return String.valueOf(horas*valor_hora);
        }
        else {
            return nombre;
        }
        
    } 
    
}
