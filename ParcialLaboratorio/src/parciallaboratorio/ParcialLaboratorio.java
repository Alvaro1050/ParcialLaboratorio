/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallaboratorio;

import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class ParcialLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el Segundo numero"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el Tercer numero"));
        
        int numeroMenor = 0;

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1);
            if (numero2 > numero3) {
                System.out.println(numero2);
                System.out.println(numero3);
                numeroMenor = numero3;
            } else {
                System.out.println(numero3);
                System.out.println(numero2);
                numeroMenor = numero2;
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2);
            if (numero1 > numero3) {
                System.out.println(numero1);
                System.out.println(numero3);
                numeroMenor = numero3;
            } else {
                System.out.println(numero3);
                System.out.println(numero1);
                numeroMenor = numero1;
            }
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println(numero3);
            if (numero2 > numero1) {
                System.out.println(numero2);
                System.out.println(numero1);
                numeroMenor = numero1;
            }else{
                System.out.println(numero1);
                System.out.println(numero2);
                numeroMenor = numero2;
            }
        }
        
        System.out.println("El numero menor entre ("+numero1+","+numero2+","+numero3+") es: "+numeroMenor);
    }

}
