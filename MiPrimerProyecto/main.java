import javax.swing.JOptionPane;

//libreria para capturar datos por consola
import java.util.Scanner;

public class main
{
    public static void main (String [] args)
    {
    // tambien se pueden definir el valor de las variebles desde el principio
    int salario;
    double porc_salud;
    double porc_pension;
    double aporte_salud;
    double aporte_pension;
    double total;
    //captura desde consola 
    //Scanner teclado = new Scanner(System.in);
    //instrucciones
    
    //Definir los valores de las variables
    //System.out.println("¿Ingrese salario?");
    //se guarda la captura en una variable
    //salario = Integer.parseInt(teclado.nextLine());
    //captruar datos desde un cuadro de dialogo
    salario = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese Salario"));
    porc_salud = 4;
    porc_pension = 4.5;
    
    //Ejecutar las operaciones ejercidas
    
    aporte_salud = salario * (porc_salud / 100);
    aporte_pension = salario * (porc_pension / 100);
    total = salario - aporte_salud - aporte_pension;
    
    //Salida del codigo por consola
    
    System.out.print("Su salario actual es: "+total);
    //System.out.println(); imprimir con salto de linea
    
    //Salida por ventana de dialogo
    //null se coloca para que sea independiene, que este en una ventana diferente
    //despues de la coma es el mensaje que se quiere colocar
    JOptionPane.showMessageDialog(null,"Su salario actual es: "+total);
    
    //estructura condicional if (a==1){} else if (a==2){} else {}
    
    // switch (a) { case 1: bloque de instruccion break; default: bloque de instrucciones break;}
    
    // se pueden unir dos casos case 1,2:
    
    //while (condicion): instruccion
    
    //while (true): instruccion if (condicion): break para romper ciclo con un if
    
    // while (a>45) {instruccion} condicion posterior do {instruccion}
    
    //do {instruccion} while(condicion);
    
    //for (int i=0; i<=8;i++)
    
    
    
    }
}
