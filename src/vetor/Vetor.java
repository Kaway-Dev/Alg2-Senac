/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetor;

/**
 *
 * @author philippe.kpsales
 */
public class Vetor {

    public static void main(String[] args) {
        String nome[] = {"Ph", "Israel", "Matheus", "Lucao"};
        
        double pessoa[] = new double[nome.length];
        double venda[] = new double[nome.length];
        double p = (Math.random()*5)+1;
        double v = (Math.random() *15000)+1;

        for (int i = 0; i < nome.length; i++) {

            System.out.println(i+"\t"+nome[i]);

        }
         System.out.println(p);
          System.out.println(v);
    }
}
