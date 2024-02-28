/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alg;

import java.util.Scanner;

/**
 *
 * @author philippe.kpsales
 */
public class Alg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[700];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 700);

        }

        int menor = vetor[0];
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            System.out.println("menor valor" + menor);
            System.out.println("maior valor" + maior);
        }
    }
}
