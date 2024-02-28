/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetor;

/**
 *
 * @author philippe.kpsales
 */
public class Fibonacci {
  
     public static void main(String[] args) {
         int fibonacci[] = new int [13];
         
         fibonacci[0] = 0;
         fibonacci[1] = 1;
         
         for(int i = 2; i < fibonacci.length; i++ ) 
             fibonacci[i] = fibonacci[i - 1]+fibonacci[i -2];
         
         for(int i = 0 ; i < fibonacci.length; i ++)
             System.out.println(i + "\t"+ fibonacci[i]);
    }
}
