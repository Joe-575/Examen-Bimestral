package vjAmniota;

import vjTetrapoda.Tetrapoda;

public abstract class Amniota extends Tetrapoda {
    public Amniota(int nivel) {
        super(nivel-1);
        super.vjLoading();
        for (int i = 0; i < nivel; i++) {
            System.out.print("-");
        }
        System.out.println(" Amniota");
    }
}
