//extends genera herencia con otra clase

/*
Buenas practicas
inicializar un constructor vacio
inicializar un constructor con todos los atributos
*/
public class SalaCineImax extends SalaCine
{
    //se puede adicionar atributos a las clase que heredan de otra clase
    private String sistemaSonido;
    
    /*para utilizar el contrcutor de la clase padre
     debo inicializar un constructor blanco en el hijo
     y colocar la palabra super()
     */
    public SalaCineImax()
    {
        super();
        this.sistemaSonido = ""; 
    }
    
    //para traer un constructor inicializado del padre
    
    public SalaCineImax(int capacidadMax, int cantidadActual, String nombrePelicula, String sistemaSonido)
    {
        super(capacidadMax, cantidadActual, nombrePelicula);
        this.sistemaSonido = sistemaSonido;
    }
    
    public void setSistemaSonido(String sistemaSonido)
    {
        this.sistemaSonido = sistemaSonido;
    }
    
    public String getSistemaSonido()
    {
        return this.sistemaSonido;
    }
    
}