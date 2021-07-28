public class Nevera extends Electrodomestico
{   
    private String tipo;
    private double capacidad;
    public Nevera(String tipo, double capacidad)
    {
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    
    public String getTipo()
    {
        return tipo;
    }
    
    public double getCapacidad()
    {
        return capacidad;
    }
    
    /*
     * para ejecutar todos los constructores de la clase padre
     * se puede dejar super() en blanco
     */
}