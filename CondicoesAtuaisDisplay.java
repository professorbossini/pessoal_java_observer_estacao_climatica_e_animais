public class CondicoesAtuaisDisplay implements Observer {
    public void atualizar (double t, double u, double p){
        System.out.println("Condições Atuais");
        System.out.printf("T: %.2f\u00B0C\n", t);
        System.out.printf ("U: %.2f%%\n", u * 100);
        System.out.printf ("P: %.2fmbar\n", p);
    }
}
