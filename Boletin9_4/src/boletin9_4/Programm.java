/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Programm {

    public void taboas(){
        Scanner ler = new Scanner(System.in);
        int a = 10;
        int contador=0;
        int num;
        
         do{
        System.out.println("Intodruzca nuúmero para ver su tabla, pulse 0 para parar");
        num = ler.nextInt();
        contador++;
        System.out.println(contador * num);
        }while(num!=0);
}
}





