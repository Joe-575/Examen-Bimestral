package vjReptiles;

public class Crocodilians extends Reptiles {

    public String nombre;

    public Crocodilians(int nivel){
        super(nivel-1);
        super.vjLoading();
        for (int i = 0; i < nivel; i++) {
            System.out.print("-");
        }
        System.out.println(" Crocodilians");
    }

    
    public void vjSaludar(){
        System.out.println(" Hola, soy un Crocodiliano");
    }
}