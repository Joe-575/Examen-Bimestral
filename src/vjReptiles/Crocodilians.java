package vjReptiles;

public class Crocodilians extends Reptiles {

    private String vjNombre = "Crocodiliano";

    public Crocodilians(){
        super.vjLoading();
        System.out.println("|---------------------------- Crocodilians");
    }

    public void vjSaludar(){
        System.out.println("");
        System.out.println("\t Hola, soy un " + vjNombre);
        System.out.println("\t"+vjNombre+" saluda a todos");
    }
}