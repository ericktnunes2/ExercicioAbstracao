public class ProvaUCB extends ProvaUniversidade{



    public ProvaUCB(double AV1, double AV2) {
        super(AV1, AV2);
    }

    public boolean aprovado(){
        if (calcularMedia() >= 7){
            return true;
        } else {
            return false;
        }
    }
}
