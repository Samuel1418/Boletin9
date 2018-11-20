/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Triangulo {
    public void traiangle(){
    int base;
    int altura;
    Scanner ler= new Scanner(System.in);
        System.out.println("Introduzaca la base");
       base= ler.nextInt();
     System.out.println("Introduzca altura");
       altura=    ler.nextInt();
    while(base<=0){
        System.out.println("Introduzca una base valida");
        base=ler.nextInt();
    }
        while(altura<=0){
            System.out.println("Introduzca una altura valida");
            altura= ler.nextInt();
        }
        System.out.println("El area es: "+(base*altura));
           
    } 
        
    
}
