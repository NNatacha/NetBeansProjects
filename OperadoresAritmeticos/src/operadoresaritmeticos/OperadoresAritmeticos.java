/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Natacha
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("A média é igual a " + m+".");*/
       //Operadores Unários
       /*int numero = 5;
       int valor = 5 + numero ++;
       System.out.println(valor);*/
       /* int x = 4;
       x += 2; //x=x+2
       System.out.println(x);*/
       
       /*float v = 8.5f;
       int ar = (int) Math.round(v);
        System.out.println(ar);*/
       
       /*double aleatorio = Math.random();
       int n = (int) (15 + aleatorio * (50-15)); //num aleatoria entre 15-50
        System.out.println(n);*/
       int num = 4;
       int result = 0;
       System.out.println("Valor original: " + result);
       result = num++; // Primeiro atribui, depois incrementa
       System.out.println("Valor de num após o incremento: " + num);
       System.out.println("Valor de result após o incremento: " + result);
       num = 4; result = 0;
       result = ++num; // Primeiro incrementa, depois atribui
       System.out.println("Valor de num após o incremento: " + num);
       System.out.println("Valor de result após o incremento: " + result);
       
      
       
        
    }
    
}
