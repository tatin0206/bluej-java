import javax.swing.JOptionPane;

public class Pantalla
{
public static void presentarmenu()
    
    {
        // Se crean las variables
        String menu;
        int opcion;
         //se crea el menu del sistema       
        menu = "Menu principal\n\n"+
                      "1) Ingresar datos de la caja\n"+
                      "2) Catalogar y costear\n"+
                      "0) Salir\n"+
                      "Ingrese opcion:";
    // Se realiza el bucle
    do {
        // crear la excepcion cuando ocurra un error
        try
        {
            //se crea el menu para escoger las opciones
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,menu));
        }
        catch(Exception e)
        {
            //reutilizar codigo del bucle para ir a la opcion 0
            opcion = -1;
        }
        
        //menu de opciones
        switch (opcion)
            {
            case 1:
                informacion_caja();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Opcion 2 seleccionada");
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Opcion terminada");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion incorrecta, intente de nuevo");
                break;
                
        
            }
        }
        //se rompe el bucle
    while(opcion !=0);
}

    public static double validarDatoNumerico(String pregunta)
    {
        boolean datoOK=true;
        double  dato = 0;
        do
        {
        try
        {
            dato = Double.parseDouble(JOptionPane.showInputDialog(null,pregunta));
            if (dato > 0)
            {
                datoOK = true;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Dato invalido, intente de nuevo");
                datoOK = false;
            }
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Dato errado, intente de nuevo");
        }
        }
        while(datoOK == false);
        return dato;
    }
    
    public static String preguntarMaterial()
    {
        String material = "";
        int opcion;
        String menu;
         //se crea el menu del sistema       
        menu = "Lista de materiales\n\n"+
                      "1) Cartulina\n"+
                      "2) Carton corrugado\n"+
                      "0) Alta densidad\n"+
                      "Seleccione material:";
    // Se realiza el bucle
    do {
        // crear la excepcion cuando ocurra un error
        try
        {
            //se crea el menu para escoger las opciones
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,menu));
        }
        catch(Exception e)
        {
            //reutilizar codigo del bucle para ir a la opcion 0
            opcion = -1;
        }
        
        //menu de opciones
        switch (opcion)
            {
            case 1:
                material = "Cartulina";
                break;
            case 2:
                material = "Carton corrugado";
                break;
            case 3:
                material = "Alta densidad";
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion incorrecta, intente de nuevo");
                break;
                
        
            }
        }
        //se rompe el bucle
    while(opcion <1 || opcion > 3);
    return material;
}
    
    
    public static void informacion_caja()
    {
        double largo = validarDatoNumerico("Ingrese largo de la caja en cm");
        double ancho = validarDatoNumerico("Ingrese ancho de la caja en cm");
        double altura = validarDatoNumerico("Ingrese altura de la caja en cm");
        String material = preguntarMaterial();
        
        
        Caja c = new Caja(altura, ancho,largo,material); 
        
        /** para enviar de manera individual, con los constructores 
        individuales
        
        * crear el objeto Caja c = new Caja()
        * obtener los datos  
        * c.setAncho(ancho)
        * c.setAltura(altura);
        * c.setMaterial(material);
        **/
        JOptionPane.showMessageDialog(null,"Datos ingresados");
        String datos = c.Informacion_caja();
        JOptionPane.showMessageDialog(null,datos);      
    }
}
