import java.util.*;
public class DadosClimaticos implements Subject{
    //esses três não existem mais, já que
    //serão armazenados na coleçao de observers
    // private CondicoesAtuaisDisplay condicoesAtuaisDisplay;
    // private EstatisticasDisplay estatisticasDisplay;
    // private PrevisoesDisplay previsoesDisplay;
    
    private List <Observer> observers;
    private Random gerador;
    private double temperatura, umidade, pressao;

    public DadosClimaticos(){
        this.observers = new ArrayList<>();
        this.gerador  = new Random();
    }

    public double getTemperatura(){
        return temperatura;
    }

    public double getUmidade(){
        return umidade;
    }

    public double getPressao(){
        return pressao;
    }

    public void dadosAlterados(){
       notificarObservers();
    }

    public void alterarDados(){
        //graus celsius
       this.temperatura = 20 + gerador.nextDouble () * 10;
       //percentual
       this.umidade = 0.1 + gerador.nextDouble () * 0.7;
       //milibar. 1 milibar = 100Pa
       this.pressao = 900 + gerador.nextDouble () * 200;
       this.dadosAlterados();
    }

    public void iniciar (){
        while (true){
            try{
                this.alterarDados();
                Thread.sleep(5000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void registrarObserver(Observer o) {
        this.observers.add(o);
        
    }

    @Override
    public void removerObserver(Observer o) {
        this.observers.remove(o);
        
    }

    @Override
    public void notificarObservers() {
       for (Observer o : observers){
           o.atualizar (
               getTemperatura(),
               getUmidade(),
               getPressao()
           );
       }
       System.out.printf("********************************************\n");
        
    }
}
