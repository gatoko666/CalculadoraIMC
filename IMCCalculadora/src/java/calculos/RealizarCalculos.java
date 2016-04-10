/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

import org.eclipse.jdt.internal.compiler.ast.Javadoc;

/**
 *
 * @author gatoko
 */
public class RealizarCalculos {
    
   //Calculo  del imc 
      public double calcularIMC(double altura, int peso)
    {
        return (peso/Math.pow(altura, 2));
    }
    
      
      
      
      
      //Calculo del estado del IMC
    public String obtenerClasificacion(double altura, int peso)
    {
        double imc = calcularIMC(altura, peso);
        System.out.println(imc);
        
        if( imc < 16 )
            return "Delgadez Severa";
        else if( imc >= 16 && imc <= 16.99 )
            return "Delgadez moderada";
        else if( imc >= 17 && imc <= 18.49 )
            return "Delgadez aceptable";
        else if( imc >= 18.5 && imc <= 24.99 )
            return "Peso Normal";
        else if( imc >= 25 && imc <= 29.99 )
            return "Sobrepeso";
        else if( imc >= 30 && imc <= 34.99 )
            return "Obeso: Tipo I";
        else if( imc >= 35 && imc <= 40 )
            return "Obeso: Tipo II";
        else
            return "Obeso: Tipo III";
    }
    
}
