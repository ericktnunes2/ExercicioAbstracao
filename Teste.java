public class Teste {
    public static void main(String[] args) {
        ProvaUCB provaucb = new ProvaUCB(5, 9);
        if (provaucb.aprovado()) {
            System.out.println("Aluno aprovado na UCB.");
        } else {
            System.out.println("Aluno reprovado na UCB.");
        }

        ProvaFafifo provafafifo = new ProvaFafifo(7, 5);
        if (provafafifo.aprovado()) {
            System.out.println("Aluno aprovado na Fafifo.");
        } else {
            System.out.println("Aluno reprovado na Fafifo.");
        }
    }
}
