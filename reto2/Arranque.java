

public class Arranque
{
    public static void main (String [] args)
    {
    Empleado emp = new Empleado("Lucia Gomez",1097000000,"lucia.gomez@correo.com",2,"Desarrollo",true);
    Empleado uno = new Empleado("Lucia Gomez",1097000000,"lucia.gomez@correo.com",2,"Administrativos",true);
    Empleado dos = new Empleado("Lucia Gomez",1097000000,"lucia.gomez@correo.com",2,"Servicios",true);
    Empleado tres = new Empleado("Lucia Gomez",1097000000,"lucia.gomez@correo.com",2,"Desarrollo",false);
    Empleado cuatro = new Empleado("Lucia Gomez",1097000000,"lucia.gomez@correo.com",2,"Administrativos",false);
    Empleado cinco = new Empleado("Lucia Gomez",1097000000,"lucia.gomez@correo.com",2,"Servicios",false);
    //System.out.println(emp.getInfo());
    System.out.println(uno.getInfo());
    //System.out.println(dos.getInfo());
    //System.out.println(tres.getInfo());
    System.out.println(cuatro.getInfo());
    //System.out.println(cinco.getInfo());
    
    }
}
