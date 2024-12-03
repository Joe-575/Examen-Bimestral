package vjSorcoptery;

import vjOsteichthyes.Osteichthyes;

public abstract class Sorcoptery extends Osteichthyes {
    public Sorcoptery(int nivel) {
        super(nivel-1);
        super.vjLoading();
        for (int i = 0; i < nivel; i++) {
            System.out.print("-");
        }
        System.out.println(" Sorcoptery ");
    }
}
