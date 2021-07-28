
/*
Clase base tiene los constructores y los atributos   
*/
// no se puede crear objetos de esta clase con abstract
public class SalaCine
{
    //protected sigue privada pero puede heredar otra clase 
    protected int capacidadMax;
    protected int cantidadActual;
    protected String nombrePelicula;
    //se crea el objeto para llamar los atributos de la clase Persona
    protected Persona [] personas;
    
    public SalaCine()
    {
        this.capacidadMax = 50;
        this.cantidadActual = 0;
        this.nombrePelicula = "";
    }
    
    public SalaCine(int capacidadMax, int cantidadActual, String nombrePelicula)
    {
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
        this.nombrePelicula = nombrePelicula;
    }
    
    public int getCapacidadMax()
    {
        return this.capacidadMax;
    }
    
    public void setCapacidadMax(int capacidadMax)
    {
        this.capacidadMax = capacidadMax;
    }
    
    public int getCantidadActual()
    {
        return this.cantidadActual;
    }
    
    public void setcantidadActual(int cantidadActual)
    {
        this.cantidadActual = cantidadActual;
    }
    
    public String getNombrePelicula()
    {
        return this.nombrePelicula;
    }
    
    public void setNombrePelicula(String nombrePelicula)
    {
        this.nombrePelicula = nombrePelicula;
    }
    //crear el get y set de una persona
    public void setPersonas(Persona [] personas)
    {
        this.personas = personas;
    }
    public Persona [] getPersonas()
    {
        return this.personas;
    }
    
    protected void limpiarSala()
    {
        System.out.println("limpieza general");
    }
    //sobreescribir el toString con la informacion del objeto
    public String toString()
    {
        String mensaje = "Capacidad: "+capacidadMax+"\n"+
                        "Cantidad actual: "+cantidadActual+"\n"+
                        "pelicula: "+nombrePelicula;
        return mensaje;
    }
}



