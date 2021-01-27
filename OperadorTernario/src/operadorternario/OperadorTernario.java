/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Natacha
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int n1, n2, r;
        n1 = 14;
        n2 = 18;
        r = (n1>n2)?n1+n2:n1-n2;//se o n1 maior que n2, r recebe 0, senão r recebe 1.
        System.out.println(r);*/
       
       //COMPARANDO STRINGS:
       
       /*String nome1 = "Natacha";
       String nome2 = "Natacha";
       String nome3 = new String("Natacha");
       String res;
       //res = (nome1==nome2)?"igual":"diferente";
       res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);*/
       
       //OPERADORES LÓGICOS:
       
       int x, y, z;
       x = 4;
       y = 7;
       z = 12;
       boolean r;
       r = (x<y ^ y==z)?true:false;
        System.out.println(r);

    }
    
}
