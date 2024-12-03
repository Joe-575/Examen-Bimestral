package vjReptiles;

import vjAmniota.Amniota;

public abstract class Reptiles extends Amniota{
    public Reptiles(int nivel){
        super(nivel-1);
        super.vjLoading();
        for (int i = 0; i < nivel; i++) {
            System.out.print("-");
        }
        System.out.println(" Reptiles");
    }

    public void vjSaludar(){
        System.out.println(" Hola soy un reptil");
    }
}
