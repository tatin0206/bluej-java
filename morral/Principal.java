
public class Principal
{
    public static void main(String [] args)
    {
    //Crear un objeto
    Morral morralito = new Morral();
    //traer los atributos de la clase   
    morralito.tamano = "Grande";
    morralito.alturaCm = 45.3;
    //traer un atributo privado
    
    System.out.println("El tamaño de mi morralito es "+ morralito.alturaCm);
    //Se trae el metodo de la clase trayendo el metodo que trae el return
    System.out.println("El peso del morralito es "+morralito.obtenerPesoActual());
      morralito.guardarElemento();
    
    Morral otroMorral = new Morral();
    otroMorral.tamano = "Grande";
    otroMorral.alturaCm = 51.2;
    System.out.println("El tamaño de mi otroMorral es "+ otroMorral.alturaCm);
            
    }
}

