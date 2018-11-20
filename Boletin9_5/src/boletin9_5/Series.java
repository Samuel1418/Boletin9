/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Series {
    Scanner ler = new Scanner(System.in);
    
    public void serie1(){
        System.out.println("Introduzca o numero de elementos para a serie");
        int a=ler.nextInt();
        int contador;
        for(contador=0;contador<a;contador++){
           int num1=2;
           int num2= num1+contador*2;
            System.out.print(num2+"+");
        }
    }
    public void serie2(){
      System.out.println("Introduzca o numero de elementos para a serie");
        int a=ler.nextInt();
        int contador;
        int num1= 1;
        int num2=0;
        for(contador=0;contador<a;contador=contador+2){
          num1=num1-2;
          num2=num2+2;
            System.out.print(num1+","+num2);        
    }         
    }
    public void serie3(){
        System.out.println("Introduzca o numero de elementos para a serie");
        int a=ler.nextInt();
        int contador;
        int numero1=0;
        int numero2=1;
        for(contador=0;contador<a;contador++){
       numero1=numero1+numero2;
       numero2=numero1+numero2;
            System.out.print(numero1+","+numero2+",");
    }
    
}
}
