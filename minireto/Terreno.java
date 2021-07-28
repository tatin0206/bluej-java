//anclarca con la clase interfaz
public abstract class Terreno implements ContratoTerreno
{
    protected double largo;
    protected double ancho;
    protected String sector;
    protected double precio;
    protected double area;
    protected double valorXm2;
    
    public Terreno()
    {
        this.largo = 0;
        this.ancho = 0;
        this.sector = "";
    }
    
    public Terreno(double largo, double ancho, String sector)
    {
        this.largo = largo;
        this.ancho = ancho;
        this.sector = sector;
    }
    
    public void setLargo(double largo)
    {
        this.largo = largo;
    }
    
    public double getLargo()
    {
        return this.largo;
    }
    
    public void setAncho(double ancho)
    {
        this.ancho = ancho;
    }
    
    public double getAncho()
    {
        return this.ancho;
    }
    
    //las clases que la hereden si la implementen y el padre se vuelve abstracta
    //las hijas no deben estar vacias
    
    public abstract double getArea();
        
    public double getValorXm2 ()
    {
        //toLowerCase() para devolver todo en minusculas
        if (sector.toLowerCase().equals("urbano"))
        {
            valorXm2=3000000;
        }
        else
        {
            valorXm2=1800000;
        }
        return this.valorXm2;
    }
    
    public double getPrecio()
    {
        precio = getValorXm2() * getArea();
        return precio;
    }
    
    public abstract String toString();
    
}