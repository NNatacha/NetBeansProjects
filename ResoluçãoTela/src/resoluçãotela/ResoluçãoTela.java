/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resoluçãotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Natacha
 */
public class ResoluçãoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Toolkit tela = Toolkit.getDefaultToolkit();
    Dimension d = tela.getScreenSize();
    System.out.println("Sua tela tem resolução: "+d.width+" x "+d.height);
    }
    
}
