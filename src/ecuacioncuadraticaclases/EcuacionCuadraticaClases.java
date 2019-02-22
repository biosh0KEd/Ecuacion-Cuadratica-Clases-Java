/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacioncuadraticaclases;

import java.util.Scanner;

/**
 *
 * @author Efraín
 */
public class EcuacionCuadraticaClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada;
        Entrada = new Scanner(System.in);
        System.out.println("Resolucion de ecuacions cuadraticas");
        System.out.println("Ingrese el valor de X:");
        double x = Entrada.nextDouble();
        System.out.println("Ingrese el valor de Y:");
        double y = Entrada.nextDouble();
        System.out.println("Ingrese el valro de Z:");
        double z = Entrada.nextDouble();
        EcuacionCuadratica Equ;
        Equ = new EcuacionCuadratica(x, y, z);
        System.out.println("El resultado es:");
        System.out.println(Equ.FormulaGeneral());
        
    }
    
}
