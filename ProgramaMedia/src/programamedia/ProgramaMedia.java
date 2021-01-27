/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Natacha
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CONDIÇÃO SIMPLES:
        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi " + m);
        if (m>=9){
            System.out.println("Parabéns, Natacha!");
    }*/
    //CONDIÇÃO COMPOSTA:
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Informe o seu Ano de Nascimento: ");
        int nasc = keyboard.nextInt();    
        int idade = 2020 - nasc;  
        System.out.println("Tens " + idade +" "+ "anos!");
        if (idade>=18){
            System.out.println("Logo, tu és maior de idade!");
            
        } else{
            System.out.println("Logo, tu és menor de idade!"); 
        }
}
}
