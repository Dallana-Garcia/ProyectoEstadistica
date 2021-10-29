
package teoremapermutaciones;

public class Factorial_2 {
 int numN,resta;
 double resultado;
 double factorial1= 1;

 public Factorial_2(int n){
     this.numN = n;
     resta=numN-1;
    }
    
public void operacion()
    {
               
        for (int i=1; i<=resta;i= i+1)
        {
            factorial1= factorial1*i;
            
        }
        resultado = factorial1;
    }

public double imprimir()
    {
       operacion();
       
       return resultado;
    }
    
}
