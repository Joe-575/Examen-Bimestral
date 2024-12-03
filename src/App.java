import vjReptiles.Crocodilians;
import vjReptiles.tanqueMutacion;

public class App {
    public static void main(String[] args) throws Exception {
        Crocodilians coco = new Crocodilians("Crocodiliano",7);
        coco.vjSaludar();
        tanqueMutacion vjTanqueMutacion =  new tanqueMutacion();
        vjTanqueMutacion.vjIngresarClave();
    }
}
