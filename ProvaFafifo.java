public class ProvaFafifo extends ProvaUniversidade{


    public ProvaFafifo(double AV1, double AV2) {
        super(AV1, AV2);
    }

    public boolean aprovado(){
        if (calcularMedia() >= 6){
            return true;
        } else {
            return false;
        }
    }
}
