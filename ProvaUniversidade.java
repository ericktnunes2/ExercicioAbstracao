public class ProvaUniversidade {
    double AV1;
    double AV2;

    public ProvaUniversidade(double AV1, double AV2) {
        this.AV1 = AV1;
        this.AV2 = AV2;
    }

    public double calcularMedia(){
        double media = (this.AV1 + this.AV2) / 2;
        return media;
    }

}
