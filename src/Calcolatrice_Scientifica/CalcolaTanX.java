package Calcolatrice_Scientifica;

public class CalcolaTanX {
    double angoloInGradi ;

    public CalcolaTanX(double gradi ) {
        this.angoloInGradi  = gradi ;
    }

    public void calcoloTanX(){
        double angoloInRadianti  = Math.toRadians(angoloInGradi);
        double tangente = Math.tan(angoloInRadianti);
        System.out.print("\nIl risultato di tanX è: " + tangente);
    }
}


