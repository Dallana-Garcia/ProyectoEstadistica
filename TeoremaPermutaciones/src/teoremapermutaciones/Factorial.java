
package teoremapermutaciones;

public class Factorial {
   int numN,numN2,numR,resta;
   double resultado;
   double factorial1= 1;
   double factorial2= 1;
 
 
 
        
    public Factorial(int numeroN,int numeroN2, int numeroR){
     this.numN = numeroN;
     this.numN2 = numeroN2;
     this.numR = numeroR;
     resta=numN2-numR;
    }
    
    public void operacion()
    {
               
        for (int i=1; i<=numN;i= i+1)
        {
            factorial1= factorial1*i;
            
        }
        for (int i=1; i<=resta; i++)
        {
            factorial2= factorial2*i;
            
        }
        
       resultado= factorial1/factorial2;

    }
    
   
    
    public double imprimir()
    {
       operacion();
       
       return resultado;
    }
}
