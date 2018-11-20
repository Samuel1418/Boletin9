/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author Samuel
 */
public class Suma {
    double contador1=0;
        double contador2=1;
       //Si no se pone en double, al hacer la multiplicacion se nos va de rango
        
    public void sumas(){
    int a=90;
    double contador;
    
    for(contador=11;contador<a;contador++){
     contador1= contador1+contador;
    }
        System.out.println("La suma de los numeros es: "+contador1);
}
    public void productos(){
    int a=90;
    double contador;

    for(contador=11;contador<a;contador++){
     contador2= contador2*contador;
    }
        System.out.println("La multiplicacion de los numeros es "+contador2);
}
}
