/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Numeros {
    public void cadenaNum(){
    int a=10;
    int contador;
    int positivo=0,negativo=0,cero=0;
    Scanner ler= new Scanner(System.in);
    for(contador=0;contador<a;contador++){
        System.out.println("Introduzca numeros");
      int num=  ler.nextInt();
      if(num<0)
      negativo++;
      else if (num==0)
      cero++;
      if (num>0)
      positivo++;
      
    }
      System.out.println("Los numeros positivos son: "+positivo+"\nLos negativos: "+negativo+"\nLos ceros: "+cero);
    }
    
}
