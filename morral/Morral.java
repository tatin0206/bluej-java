import javax.swing.JOptionPane;

public class Morral
{
    public String tamano;
    public String colorPrimario;
    public int CantBolsillos;
    public double alturaCm;
    public double anchoCm;
    public boolean TienePortaCarpeta;
    public double Precio;
    private double PesoActual = 1.0; 
    
    //Crear el metodo en la clase
    public void guardarElemento()
    {
    double pesoObjeto = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese peso del elemento a guardar"));
    PesoActual += pesoObjeto;
    }
    //obtener los atributos privados
    public double obtenerPesoActual()
    {
    return PesoActual;
    }
    
    
}
