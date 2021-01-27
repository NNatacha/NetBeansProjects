/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Natacha
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Entrada de dados:
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n ", nome, nota);      
        // Saída de dados:
        /*String nome = "Natacha"; foi colocado string em maiúscula 
        *porque ñ tem o tipo primitivo  */
         //float nota = 8.5f;
        //System.out.println("Sua nota é " + nota);
        //System.out.printf("Sua nota é %.2f \n", nota);
        //System.out.printf("A nota de %s é %.2f \n", nome, nota);
        //System.out.format("Sua nota é %.2f \n", nota);
        
        
    }
    
}
