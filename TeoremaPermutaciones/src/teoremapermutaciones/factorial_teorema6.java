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
public class factorial_teorema6 {
int numN,numN1,numR,numR2, resta;
   double resultado;
   double factorial1= 1;
   double factorial2= 1;
   double factorial3= 1;
   
   public factorial_teorema6(int numeroN, int numeroN1, int numeroR, int numeroR2){
   this.numN=numeroN;
   this.numN1=numeroN1;
   this.numR=numeroR;
   this.numR2=numeroR2;
   
   resta=numeroN1-numeroR;
   }
   public void factoriales()
    {
         //n!
           for (int i=1; i<=numN;i= i+1)
        {
            factorial1= factorial1*i;
            
        }
        //r!   
        for (int i=1; i<=numR2;i= i+1)
        {
            factorial2= factorial2*i;
            
        }
                        
        //(n-r)!
         for (int i=1; i<=resta;i= i+1)
        {
            factorial3= factorial3*i;
            
        }
        
           resultado=(factorial1/(factorial2*factorial3));
    }
   public double imprimir()
    {
       factoriales();
       
       return resultado;
    }
  
   
   
   
}
