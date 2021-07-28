
// se crea una herencia de la clase Electrodomestico
public class Televisor extends Electrodomestico
{
    private String resolucion;
    private int pulgadas;
    
    /*
    Se crean varios constructores, dependiendo los parametros que
    se han llamado en la clase principal
    */
    
    public Televisor(String color, String marca, int precio)
    {
        //llamar el constructor del padre que tenga los parametros igual
        super(color,marca,precio);
    }
    //se puede crear otro o adicionar al metodo de arriba
    public Televisor(String color, String marca, int precio,String resolucion,int pulgadas)
    {
        //llamar el constructor del padre que tenga los parametros igual
        super(color,marca,precio);
        //crear los constructores para esta clase
        this.resolucion= resolucion;
        this.pulgadas = pulgadas;
    }
    
    public void setResolucion()
    {
        this.resolucion = resolucion;
    }
    public String getResolucion()
    {
        return resolucion;
    }
    public void setPulgadas()
    {
        this.pulgadas = pulgadas;
    }
    public int getPulgadas()
    {
        return pulgadas;
    }
}
