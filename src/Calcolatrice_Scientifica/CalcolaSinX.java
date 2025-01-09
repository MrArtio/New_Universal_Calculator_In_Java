package Calcolatrice_Scientifica;

public class CalcolaSinX {
    double angoloGradi;

    public CalcolaSinX(double angoloGradi) {
        this.angoloGradi = angoloGradi;
    }

    public void calcoloSinX(){
        double angoloRadianti = Math.toRadians(angoloGradi);
        double seno = Math.sin(angoloRadianti);
        System.out.print("\nIl risultato di sinX è: " + seno);
    }
}


