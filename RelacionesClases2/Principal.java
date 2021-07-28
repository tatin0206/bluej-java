//video 1:26:41 video 15

public class Principal
{
    public static void main(String [] args)
    {
    // apartar espacio en memoria
    // ingresar datos general SalaCine sala1 = new SalaCine(50,0,"El vengador del Futuro");
    //enviar datos individual
    
    SalaCineImax sala1 = new SalaCineImax();
    SalaCine4XD sala3 = new SalaCine4XD();
    sala1.setCapacidadMax(50);
    sala1.setcantidadActual(0);
    sala1.setNombrePelicula("El vengador del futuro");
    
    //Se puede crear un objeto de una clase heredada
    SalaCineImax sala2 = new SalaCineImax();
    sala2.setSistemaSonido("THX");
    System.out.println("El sistema de sonido de mi sala es de: "+sala2.getSistemaSonido());   
    
    //ingresar datos
    System.out.println("La capacidad de mi sala es de : "+sala1.getCapacidadMax());
    
    //enviar datos de manera general
    Persona persona1 = new Persona("Carlos",25);
    System.out.println("El nombre de la persona es: "+persona1.getNombre());
    
    //obtener datos de la clase que creamos en salacine
    /*sala1.setPersona(persona1);
    System.out.println("El nombre de la persona que esta dentro es: "+sala1.getPersona().getNombre());
    System.out.println("la edad de la persona que esta dentro es: "+sala1.getPersona().getEdad());
    */
    //crear un arreglo
    Persona [] personas = new Persona[3];
    Persona persona0 = new Persona("Carlos",25);
    Persona persona2 = new Persona("David",18);
    Persona persona3 = new Persona("Pedro",24);
    
    personas[0] = persona1;
    personas[1] = persona2;
    personas[2] = persona3;
    
    //reducir el codigo anterior
    
    //enviar la lista de personas
    sala1.setPersonas(personas);
    
    System.out.println("El nombre de la persona que esta dentro es: "+sala1.getPersonas()[1].getNombre());
    System.out.println("la edad de la persona que esta dentro es: "+sala1.getPersonas()[1].getEdad());
    /*
    Clase base: clases que representan elementos de negocio
        -GET, SET, ATRIBUTOS, CONSTRUCTORES
    */
   
       //sobre escribir metodos
       sala1.limpiarSala();
       sala3.limpiarSala();
       
       //metodo sobreescrito con toString sin llamar el metodo
       System.out.println(sala1);
    }
    
}
