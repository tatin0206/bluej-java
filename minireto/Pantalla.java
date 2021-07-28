import java.util.Scanner;
import java.text.DecimalFormat;
public class Pantalla
{   
    private Terreno[] terrenos;
    private int cantidadTerrenos;
    private double precio;
    
    
    public void preguntarDatos()
    {   
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de terrenos: ");
        cantidadTerrenos = Integer.parseInt(teclado.nextLine());
        terrenos = new Terreno[cantidadTerrenos];
        
        for (int i =0; i<cantidadTerrenos;i++)
        {
            
            System.out.println("ingrese el largo del terreno "+(i+1)+": ");
            double largo = Double.parseDouble(teclado.nextLine());
            System.out.println("ingrese el ancho del terreno "+(i+1)+": ");
            double ancho = Double.parseDouble(teclado.nextLine());
            System.out.println("Ingrese el sector del terreno "+(i+1)+": "+" (Urbano/Rural): ");
            String sector = teclado.nextLine();
        
            terrenos[i] = new TerrenoRectangular(largo,ancho,sector);
        }
    }
    
    public void calcularPrecio()
    {   
        precio =0;
        for (int i =0;i<cantidadTerrenos;i++)
        {
        double precio =+ terrenos[i].getPrecio();
        }
    }
    
    public void mostrarSuma()
    {
    DecimalFormat formato = new DecimalFormat("#,###.00");
    //otra forma para recorrer
    for (Terreno t: terrenos)
    {
        System.out.println(t);
    }
    
        System.out.println("El valor del terreno es: "+formato.format(precio));
    }    
} 
