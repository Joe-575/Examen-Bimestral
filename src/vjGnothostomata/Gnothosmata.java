package vjGnothostomata;

public abstract class Gnothosmata {
    public Gnothosmata(){
        vjLoading();
        System.out.println("|----Ghothosmata ");
    }

    public void vjLoading(){
        String[] caracter = {"|","/","-","\\"};
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r"+caracter[i % caracter.length] + " " + i + "%  ");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                
            }
        }
    }
}
