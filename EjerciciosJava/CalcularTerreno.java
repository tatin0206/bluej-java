

public class CalcularTerreno
{
    
    public static void main(String [] args)
    {
    //lista de variables
    double largo,ancho,precioxmetro,area,valorinicial,descuento,total;    
    //instrucciones
    largo = 40;
    ancho = 50;
    precioxmetro = 500;
    //Calcular el area del terreno y su valor inicial
    area = largo * ancho;
    valorinicial = area * precioxmetro;
    if (area > 500 && area <= 1000)
    {
    descuento = valorinicial * 0.17;
    }
    
    else if (area > 1000)
    {
    descuento = valorinicial * 0.25;
    }
    else
    {
    descuento = 0;
    }
    total = valorinicial - descuento;
    System.out.println("El valor del terreno es de " + total);
    }
}
