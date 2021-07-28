import java.text.DecimalFormat;
public class TerrenoRectangular extends Terreno
{
    public TerrenoRectangular(double largo, double ancho, String sector)
    {
        super(largo, ancho,sector);
    }
    
    
    public double getArea()
    {
       area = largo * ancho;
        return this.area;
    }
    
    public String toString()
    {
        DecimalFormat formato = new DecimalFormat("#,###.00");
        String mensaje = "Terreno rectangular "+"\n"+
        "Area: "+getArea()+" m2"+"\n"+
        "Valor: $"+formato.format(getPrecio())+"\n";
        
        return mensaje;
        
    }
}