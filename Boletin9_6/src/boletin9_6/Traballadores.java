/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Traballadores {
 private double soldo;
 private double gananMenos;
 private double gananEntre=0;
 private double numTraballadores;
 public void funcionSoldos(){
 Scanner ler =new Scanner(System.in);
     do{
         System.out.println("Introduzca soldo");
         soldo = ler.nextDouble();
         numTraballadores++;
         if(soldo>=1000&&soldo<=1750)
             gananEntre++;
         if(soldo<1000)
             gananMenos--;
     }while(soldo!=0);
 System.out.println("O número de traballadores que cobra entre 1000 e 1750 é: "+gananEntre+"\nEl "+(((gananMenos*100)/numTraballadores)*-1)+"% de los trabajadores ganan menos de 1000 euros");
 }
}
    
    
    


