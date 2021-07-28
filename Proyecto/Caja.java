
 
public class Caja
{
    private double altura;
    private double ancho;
    private double largo;
    private String material;
    private double volumen;
    
    public Caja(double Altura, double Ancho, double Largo, String Material)//constructores para enviar informacion
    {
        altura = Altura;
        ancho = Ancho;
        largo = Largo;
        material = Material;
        volumen = altura * ancho * largo;
                
    }
    
    public String Informacion_caja()
    
    {
    
    String mensaje = "Informacion de la caja:" +altura+ ", "+ancho+ ", "+largo+ ", "+material+", "+volumen;
    return mensaje;
    }
    //se crea el constructor inicializado
    public Caja()
    {
        largo = 0;
        ancho = 0;
        altura = 0;
        material = "";
    }
    
    // se crean get y set para crear constructores individuales
    public void setLargo(double largo)
    {
        this.largo = largo;
    }
    public double getLargo()
    {
        return largo;
    }
    public void setAncho(double an)
    {
    this.ancho = an;
    }
    public double getAncho()
    {
        return ancho;
    }
    public void setAltura(double al)
    {
        this.altura = al;
    }
    public double getAltura()
    {
        return altura;
    }
    public void setMaterial(String mate)
    {
        this.material = mate;
    }
    public String getMaterial()
    {
        return material;
    }
}
