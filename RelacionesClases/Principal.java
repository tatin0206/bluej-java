public class Principal
{
    public static void main (String [] args)
    {
        Televisor e = new Televisor("Negro","Samsung",1500000);
        System.out.println("El color de mi televisor es: "+ e.getColor());
        
        /* se llama a una clase heredada vacia se llaman 
         * los set de la clase padre
         */
        
        //enviar los datos que cree del constructor de nevera
        Nevera nev = new Nevera("Top freezer",15.3);
        //enviar datos de constructor vacio
        nev.setColor("Gris");
        nev.setMarca("Haceb");
        nev.setPrecio(1500000);
        System.out.println("caracteristicas de la nevera\n"+
                            nev.getColor()+nev.getPrecio()+nev.getTipo()+
                            nev.getCapacidad());
        
        
        
    }
}