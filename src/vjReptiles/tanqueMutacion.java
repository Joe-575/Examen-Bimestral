package vjReptiles;

import java.util.Random;
import java.util.Scanner;

public class tanqueMutacion {

    public void vjIngresarClave(){
        
        Scanner vjEntrada = new Scanner(System.in);
        String vjClave;
        boolean vjAcceso = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la clave para acceder a la mutación: ");
            vjClave = vjEntrada.nextLine();

            if (vjClave.equals("321mutar")) {
                vjMutarCocodrilian();
                vjAcceso = true;
                break;
            } else {
                System.out.println("Clave incorrecta. Intente de nuevo.");
            }
        }
    }

    public static void vjMutarCocodrilian(){
        String vjNombre = "Crocodiliano";
        System.out.println("\n" +vjNombre + " es un Crocodilions /"+vjNombre+" sera mutado.... ");

        Random random = new Random();
        int fileSize = random.nextInt(901) + 100; 
        int progressBarLength = 30; 

        System.out.println(" Irradiando (" + fileSize + " kB)...");

        for (int i = 0; i <= 100; i++) {
            int filledLength = i * progressBarLength / 100;
            int emptyLength = progressBarLength - filledLength;

            String progressBar = "[" + "-".repeat(filledLength) + ".".repeat(emptyLength) + "]";

            System.out.print("\r" + progressBar + " " + i + "%");

            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                System.out.println("\nError: " + e.getMessage());
            }
        }
    }
}
