package vjReptiles;

public class Crocodilians extends Reptiles {
    public String nombre;

    public Crocodilians(String nombre, int nivel){
        super(nivel-1);
        super.vjLoading();
        this.nombre = nombre;
        for (int i = 0; i < nivel; i++) {
            System.out.print("-");
        }
        System.out.println(" Crocodilians");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void vjSaludar(){
        super.vjSaludar();
        System.out.println(" Me llamo " + getNombre());
    }
}