/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author philippe.kpsales
 */
public class Aula_4 {
    public static void main(String[] args) {
       Scanner oT = new Scanner(System.in);
       int A[][] = new int[5][5];
       String linha="";
       int coluna=0, lin=0, soma=0;      
       int max = -1 , min = 9999;
       int iMax=0,jMax=0, iMin=0,jMin=0;
       double md=0;

       //carregar a matriz
       for(int i=0; i<A.length;i++)
       {
           for(int j=0;j<A[0].length;j++)
           {
              A[i][j] = (int) (Math.random()*5000);
           }
       }
     
       //01 - mostrar a matriz na tela
       for(int i=0; i<A.length;i++)
       {
           for(int j=0;j<A[0].length;j++)
           {
               linha+="\t"+A[i][j]; //linha=linha+"\t"+A[i][j]
           }
           System.out.println(linha);
           linha="";
       }
       
       //02 - Mostrar a Diagonal Principal
       System.out.println("elementos da Diagonal Principal");
       for(int i=0; i<A.length;i++)
       {
           for(int j=0;j<A[0].length;j++)
           {
               if(i==j)
                  linha+="\t"+A[i][j]; 
               else
                  linha+="\t"+"  "; 
           }           
           System.out.println(linha);
           linha=""; 
       }
      
       //3
       System.out.print("Digite a coluna:");
       coluna = oT.nextInt();
       if((coluna<0) || (coluna>4))
           System.out.println("coluna inexistente");
       else
       {
            for(int i=0; i<A.length;i++)
            {
                soma+=A[i][coluna];
            }  
            System.out.println("soma da "+coluna+" ="+soma); 
       }
       
       //4
       soma =0;
       System.out.print("Digite a linha:");
       lin = oT.nextInt();
       if((lin<0) || (lin>4))
           System.out.println("linha inexistente");
       else
       {
            for(int j=0; j<A[0].length;j++)
            {
                soma+=A[lin][j];
            }  
            System.out.println("soma da "+lin+" ="+soma); 
       }
      
       //5
       System.out.println("elementos acima da Diagonal Principal");
       for(int i=0; i<A.length;i++)
       {
           for(int j=0;j<A[0].length;j++)
           {
               if(i<j)
                  linha+="\t"+A[i][j]; 
               else
                  linha+="\t"+"  "; 
           }           
           System.out.println(linha);
           linha=""; 
       }
       
       //6 e 7
       for(int i=0; i<A.length;i++)
       {
           for(int j=0;j<A[0].length;j++)
           {
               if(A[i][j]>max)
               {
                   max = A[i][j];
                   iMax = i;
                   jMax = j;
               }
               
               if(A[i][j]<min)
               {
                   min = A[i][j];
                   iMin = i;
                   jMin = j;
               }
            }           
       }
        System.out.println("posicao maxima "+iMax+" "+jMax+"="+max);
        System.out.println("posicao minima "+iMin+" "+jMin+"="+min); 
    
        
       System.out.println("elementos Pares");
       for(int i=0; i<A.length;i++)
       {
           for(int j=0;j<A[0].length;j++)
           {
               if(A[i][j]%2==1)
                  linha+="\t"+A[i][j]; 
               else
                  linha+="\t"+"XXX"; 
           }           
           System.out.println(linha);
           linha=""; 
       }
       
         for(int i=0; i<A.length;i++)
       {
           for(int j=0;j<A[0].length;j++)
           {
                soma+=A[i][j];
           }                      
       }
        md = (1.0*soma)/(A.length*A[0].length);
    
     System.out.println("media:"+md);
       
       
        
    }
}
