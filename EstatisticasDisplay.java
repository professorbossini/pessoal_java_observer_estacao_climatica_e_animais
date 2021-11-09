import java.util.*;
public class EstatisticasDisplay implements Observer{
    private List <Double> temperaturas = new ArrayList<>();;
    public void atualizar (double t, double u, double p){
        temperaturas.add(t);
        if (temperaturas.size() >= 10){
            double media = 0;
            for (double temp: temperaturas){
                media += temp;
            }
            System.out.printf("Estatísticas\n");
            System.out.printf ("Média de temperatura dos últimos dez dias: %.2f\u00B0C\n", media / temperaturas.size());
        }
    }
}
