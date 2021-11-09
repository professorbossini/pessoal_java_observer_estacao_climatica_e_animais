import java.util.*;
public class PrevisoesDisplay implements Observer{
    private Random gerador = new Random();
    public void atualizar (double t, double u, double p){
        double previsao = t - 2 + gerador.nextDouble() * 4;
        System.out.println("Previsões");
        System.out.printf ("Previsão para o próximo dia: %.2f\u00B0C\n", previsao);
    }
}
