/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teoremapermutaciones;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class factorialteorema5 {
int a;
    double factorial=1;
    public factorialteorema5(int a)
    {
        this.a=a;
    }
    
    public void operacion()
    {
               
        for (int i=1; i<=a;i= i+1)
        {
            factorial= factorial*i;
            
        }
            
    }
    public double imprimir()
    {
        operacion();     
        return(factorial);
            
    }
}
