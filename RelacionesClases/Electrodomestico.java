/* para no crear objetos de la clase
   se debe colocar en la clase abstract*/
abstract class Electrodomestico
{//sigue siendo privado externamente pero en herencia puede ser visible
    protected String color;
    protected String marca;
    protected int precio;
    
    //constructor no inicializados
    public Electrodomestico()
    
    {
        this.color = "";
        this.marca = "";
        this.precio = 0;
        
    }
    //constructor inicializado
    public Electrodomestico(String color, String marca, int precio)
    
    {
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }
    
    /*Crear constructores individuales set = Obtiene los datos 
     * get = acceder a los datos donde se necesitan
    */
    public String getColor()
    {
        return this.color;    
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public String getMarca()
    {
        return this.marca;
    }
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public int getPrecio()
    {
        return this.precio;
    }
    
    public void setPrecio( int precio)
    {
        this.precio = precio;
    }
    
    
    
}


