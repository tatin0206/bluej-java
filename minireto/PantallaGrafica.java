import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class PantallaGrafica
{
    /*
    si se agragan los arrray dentro de la clase con otro array 
    se llama composicion
    */
   
    //creacion de arrayList
    private ArrayList <Terreno> terrenos;
    private int cantidadTerrenos;
    private double precio;
    private double suma;
    
    
    public void preguntarDatos()
    {   
        cantidadTerrenos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad de terrenos"));
                
        for (int i =0; i<cantidadTerrenos;i++)
        {
            
            String forma = JOptionPane.showInputDialog(null,"ingrese la forma del terreno "+(i+1)+" (rectangular, triangular, trapezoidal: ");
            double largo = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el largo del terreno "+(i+1)+": "));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el ancho del terreno "+(i+1)+": "));
            String sector = JOptionPane.showInputDialog(null,"Ingrese el sector del terreno "+(i+1)+": "+" (Urbano/Rural): ");
            
            if (forma.toLowerCase().trim().equals("rectangular"))
            {   //añadir nuevos campos
                terrenos.add(new TerrenoTriangular(largo,ancho,sector));
            }
            else if (forma.toLowerCase().trim().equals("triangular"))
            {
                terrenos.add(new TerrenoRectangular(largo,ancho,sector));
            }
            
            else if (forma.toLowerCase().trim().equals("trapezoidal"))
            {
                double largo2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo largo del terreno "+(i+1)+":"));
                terrenos.add(new TerrenoTrapezoidal(largo,largo2,ancho,sector));
            }
            
            
        }
    }
    
    public void calcularPrecio()
    {   
        suma = 0;
        for (int i =0;i<cantidadTerrenos;i++)
        {
            suma = suma + terrenos.get(i).getPrecio();
        }
    }
    
    public void mostrarSuma()
    {
    DecimalFormat formato = new DecimalFormat("#,###.00");
    //otra forma para recorrer
    for (Terreno t: terrenos)
    {
        JOptionPane.showMessageDialog(null,t);
    }
    
        JOptionPane.showMessageDialog(null,"El valor del terreno es: "+formato.format(suma));
    }    
} 
