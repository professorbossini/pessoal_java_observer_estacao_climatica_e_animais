import java.util.*;
public class GeradorAleatorio implements Subject{

    private List <Observer> observers;
    private Random gerador;
    private int numeroAtual;

    public GeradorAleatorio () {
        this.observers = new ArrayList<>();
        this.gerador = new Random();
    }

    public void registrarObserver (Observer o) {
        this.observers.add(o);
    }

    public void removerObserver (Observer o){
        this.observers.remove(o);
    }

    public void notificarObservers(){
        for (Observer o : observers){
            o.atualizar(this.numeroAtual);
        }
    }

    public void iniciar () {
        while (true){
            try{
                this.numeroAtual = gerador.nextInt(20) + 1;
                notificarObservers();
                System.out.println("****************************");
                Thread.sleep(5000);
            }   
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
