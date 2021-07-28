
public class SalaCine4XD extends SalaCine
{
    private String marcaSilla;
    
    public SalaCine4XD()
    {
        super();
        this.marcaSilla = ""; 
    }
    
    public SalaCine4XD(int capacidadMax, int cantidadActual, String nombrePelicula, String marcaSilla)
    {
        super(capacidadMax, cantidadActual, nombrePelicula);
        this.marcaSilla = marcaSilla;
    }
    
    public void setMarcaSilla(String marcaSilla)
    {
        this.marcaSilla = marcaSilla;
    }
    
    public String getMarcaSilla()
    {
        return this.marcaSilla;
    }
    @Override //para dejar informacion para que se comporte el metodo diferente
    //se sobreescribe de la salacine para enviar un mensaje diferente
    public void limpiarSala()
    {
        System.out.println("Limpieza con trapero");
    }
}