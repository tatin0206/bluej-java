

public class Empleado
{
    private String nombre;
    private int identificacion;
    private String email;
    private double antiguedad;
    private String area;
    private boolean jefe;
    public String dato;
    public double devengado;
    private double desarrollo = 3200000;
    private double administrativa = 2800000;
    private double servicios = 1500000;
    public double sueldo = 3634104;
    private double EPS;
    public double Fondo = 0;
    private double pago_nomina;
    
    public Empleado(String nom, int id, String mail, double ant, String ar, boolean jef)
    {
    nombre = nom;
    identificacion = id;
    email = mail;
    antiguedad = ant;;
    area = ar;
    jefe = jef;
        
        if (area.equals("Desarrollo") && jefe == true)
    {
        devengado = desarrollo+1200000;
        dato = "SI";
        
    }
    else if (area.equals("Administrativos") && jefe == true)
    {
        devengado = administrativa+1000000;
        dato = "SI";
    }
    else if (area.equals("servicios") && jefe == true)
    {
        devengado = servicios+600000;
        dato = "SI";
    }
    else if (area.equals("Desarrollo") && jefe == false)
    {
        devengado = desarrollo;
        dato = "NO";
    }
    else if (area.equals("Administrativos") && jefe == false)
    {
        devengado = administrativa;
        dato = "NO";
    }
    else
    {
        devengado = servicios;
        dato = "NO";
    }
    
    EPS = devengado*0.04;
    if (devengado >= sueldo)
    {
       Fondo = devengado*0.01;
            
    }
    pago_nomina = devengado - EPS-EPS-Fondo;
    }
    
    
    
    
    public String getInfo()
    {
    
    String mensaje = "Nombre: "+nombre+"\n"+"Id: "+identificacion+"\n"+"Email: "+email+"\n"+"T antig: "+antiguedad+" anios"+"\n"+"Area: "+area+"\n"+"Jefe: "+
    dato+"\n"+"Devengado: "+devengado+"\n"+"EPS: "+EPS+"\n"+"AFP: "+EPS+"\n"+"Fondo: "+Fondo+"\n"+"Nomina a pagar: "+pago_nomina;
    return mensaje;
    }
}
