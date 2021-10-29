

package teoremapermutaciones;

public class Factorialteorema4 {
    int a;
    double factorial=1;
    public Factorialteorema4(int a)
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
