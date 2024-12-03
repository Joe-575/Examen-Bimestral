package vjOsteichthyes;

import vjGnothostomata.Gnothosmata;

public abstract class Osteichthyes extends Gnothosmata {
    public Osteichthyes(int nivel){
        super(nivel-1);
        super.vjLoading();
        for (int i = 0; i < nivel; i++) {
            System.out.print("-");
        }
        System.out.println(" Osteichthyes ");
    }
}
