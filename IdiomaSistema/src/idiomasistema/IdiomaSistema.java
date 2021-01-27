/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Natacha
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("A linguagem do meu sistema é: " );
       Locale idioma = Locale.getDefault();
    System.out.println(idioma.getDisplayLanguage()+ " " +idioma.getLanguage());  
    }
    
}
