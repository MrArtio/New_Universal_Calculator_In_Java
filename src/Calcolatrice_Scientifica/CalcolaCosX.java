package Calcolatrice_Scientifica;

public class CalcolaCosX {
    double Gradi;

    public CalcolaCosX(double gradi ) {
        this.Gradi = gradi;
    }

    public void calcoloCosX(){
        double Radianti = Math.toRadians(Gradi);
        double coseno = Math.cos(Radianti);
        System.out.print("\nIl risultato di cosX è: " + coseno);
    }
}


