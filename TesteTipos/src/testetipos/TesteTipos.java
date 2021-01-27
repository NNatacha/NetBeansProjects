/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author Natacha
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int idade = 30;
        String valor = Integer.toString(idade);//converter numero int em string
        System.out.println(valor);*/
       String valor = "30.5";
       float idade = Float.parseFloat(valor);
      // int idade = Integer.parseInt(valor); //parse=converter, converter um valor em inteiro
        System.out.println(idade);
        
    }
    
}
