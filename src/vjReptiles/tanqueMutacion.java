package vjReptiles;

import java.util.Random;
import java.util.Scanner;

public class tanqueMutacion {

    public void vjIngresarClave(){
        
        Scanner vjEntrada = new Scanner(System.in);
        String vjClave;
        boolean vjAcceso = false;

        for (int i = 0; i < 3; i++) {
            System.out.print(" Ingrese la clave para acceder a la mutación: ");
            vjClave = vjEntrada.nextLine();

            if (vjClave.equals("321mutar")) {
                vjMutarCocodrilian();
                vjAcceso = true;
                break;
            } else {
                System.out.println(" Clave incorrecta. Intente de nuevo.");
                
            }
        }
        vjEntrada.close();
        
    }

    public static void vjMutarCocodrilian(){
            float vjcargaActual = 0;
            double ccnumero_random = Math.floor(((Math.random() * 1000)+100));
            float cccarga_maxima = (float) ccnumero_random;

            for(int ccporcentaje_barra=1;ccporcentaje_barra<=20;ccporcentaje_barra++){
                for (int ccbarra = 0; ccbarra < ccporcentaje_barra; ccbarra++) {
                System.out.print("\033[31m"+"▄");
                }
                for (int espacios = 0; espacios < 22-ccporcentaje_barra; espacios++) {
                    System.out.print(" ");
                }
                vjcargaActual = cccarga_maxima*0.1f + vjcargaActual;
                System.out.print(vjcargaActual+" de "+cccarga_maxima+"(mSv)");
                try {
                    Thread.sleep(1000);
                    System.out.print("\r");
                    System.out.print(" ");
                    System.out.print("\r");
                } catch (Exception e) {
                    System.err.println("Interrupción durante la carga: " + e.getMessage());
                }
            }
            System.out.println("\u001B[37m"+"▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄ "+ccnumero_random+" de "+ccnumero_random+"(mSv)");
        }
    }

