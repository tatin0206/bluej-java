
public class calcularPorcentajeBono
{
public static double calcularPorcentajeBono(int anios,float bono) 
    {
// switch (a) { case 1: bloque de instruccion break; default: bloque de instrucciones break;}
   
    double porcentaje; 
    
    if (anios >= 10)
        {
             porcentaje = 0.3;
            
            
        }
        
    else if ((anios >=5) &&  (anios <=9))
    
    {
        porcentaje = 0.2;
    }
    
    else if ((anios >=3) &&  (anios <=4))
    {
        porcentaje = 0.1;
    }
    
    else
    {
        porcentaje = 0.05;
    }
    
        return porcentaje*bono;
    }
}