package vjTetrapoda;

import vjSorcoptery.Sorcoptery;

public abstract class Tetrapoda extends Sorcoptery {
    public Tetrapoda(int nivel){
        super(nivel-1);
        super.vjLoading();
        for (int i = 0; i < nivel; i++) {
            System.out.print("-");
        }
        System.out.println(" Tetrapoda");
    }
}
