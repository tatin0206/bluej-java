

public class Principal
{
    public static void main(String [] args)
    {
    
    Alimento banana = new Alimento(120);
    Alimento raices = new Alimento(60);
    Alimento platano = new Alimento(78.5);
    Alimento alimentos [] = new Alimento[3];
    alimentos [0] = banana;
    alimentos [1] = raices;
    alimentos [2] = platano;
    
    
    Gorila gorila = new Gorila(150.5,1.67);
    gorila.setAlimsIngeridos(alimentos);
    System.out.println(gorila.getPeso());
    System.out.println(gorila.getPesoAlims());
    System.out.println(gorila.getIMC());
    }   
}

