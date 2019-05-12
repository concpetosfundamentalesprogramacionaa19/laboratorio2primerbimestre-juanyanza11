
package laboratorio2;

import java.util.Scanner;

/**
 * @author juanyanza11
 */
public class Laboratorio2 {

    public static void main(String[] args) {
        // TODO code application logic here

        String nombre = "", apellido = "", mensaje = "", mensajeh = "",opcionalidad="";
        String totales = "";
        double sueldo, pasaje, bar, salida, total = 0;
        double tpasaje = 0, tsalida = 0, tbar = 0;
        int nH, menu = 1, c = 1;
        int r = 1;
        Scanner datos = new Scanner(System.in);

        do {

            // Ingreso de datos
            System.out.println("Ingrese sus nombres");
            nombre = datos.nextLine();
            System.out.println("Ingrese sus apellidos");
            apellido = datos.nextLine();
            System.out.println("Ingrese sus ingresos semanales");
            sueldo = datos.nextDouble();
            System.out.println("Número de hijos");
            nH = datos.nextInt();

            for (c = 1; c <= nH; c++)  {
                
                System.out.printf("Ingrese el costo hijo %d de pasajes diario\n", c);
                pasaje = datos.nextDouble();
                System.out.printf("Ingrese el costo en del hijo %d bar\n",c);
                bar = datos.nextDouble();
                System.out.printf("Ingrese gastos en salidas del hijo %d\n",c);
                salida = datos.nextDouble();
                
               tpasaje = tpasaje + pasaje;
               tbar = tbar + bar;
               tsalida = tsalida + salida;
               
                total = tpasaje + tbar + tsalida;
                
             
                mensajeh = String.format("%s\nHijo %d\t\t\t%.2f\t\t\t"
                        + "%.2f\t\t\t%.2f\t\t\t\n\n"
                        + "",mensajeh,c,pasaje, bar,salida);
            
                if (total < sueldo){
                    opcionalidad = "alcanza";
                }else{
                    if (total >= sueldo){
                    opcionalidad = "falta";
                    }
                
                }
                 
           }
            
            
            totales = String.format("Totales\t\t\t%.2f\t\t\t"
                    + "%.2f\t\t\t%.2f",tpasaje, tbar,tsalida);
            
            mensaje = String.format("\nReporte 00%d\n\nNombre"
                    + " del padre: %s %s\nSueldo"
                    + " semanal: %.2f\nNumero de hijos:"
                    + " %d\n\nReporte de"
                    + " gastos\nPersona\t\t\tPasaje\t\t\tBar\t\t\tSalida\n"
                    + 
                    "",r,nombre, apellido,sueldo,nH,c);
            
           System.out.printf("%s %s%s\n\n",mensaje,mensajeh,totales);
           System.out.printf("El padre de familia %s %s le [%s] el dinero"
                   + " semanal, para sus gastos\n\nFin"
                   + " del reporte 00%d\n\n",nombre,apellido,opcionalidad,r);
            
           System.out.println("Desea continuar digite:\n(1.) Si\n(2.) No");
            menu = datos.nextInt();
            if (menu == 1){
                   r = r + 1;
            }
     }while (menu ==1);   
    }

}
