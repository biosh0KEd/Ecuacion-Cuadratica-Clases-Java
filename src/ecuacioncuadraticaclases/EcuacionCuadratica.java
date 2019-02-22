/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacioncuadraticaclases;

/**
 *
 * @author Efraín
 */
public class EcuacionCuadratica {
    private double x;
    private double y;
    private double z;
    public EcuacionCuadratica(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String  FormulaGeneral() {
        double bCuadrada = y * y;
        double ac4 = 4 * x * z;
        double determinante = bCuadrada - ac4;
        double denominador = 2 * x;
        if (determinante == 0){
            String resultado = "" + -y / denominador;
            return(resultado);
        }
        else if (determinante >= 1){
            double numeradorP = -y + Math.sqrt(determinante);
            double numeradorN = -y - Math.sqrt(determinante);
            double resultadoP = numeradorP / denominador;
            double resultadoN = numeradorN / denominador;
            return(resultadoN + " y " + resultadoP);
        }
        else {
            double numReal = -y / denominador;
            double numImaginario = Math.sqrt(-determinante) / denominador;
            return(numReal + " +/- " + numImaginario + "i");
        }
    }
}
