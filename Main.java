public class Main {
    public static void main(String[] args) {
        DadosClimaticos estacao = new DadosClimaticos();
        estacao.registrarObserver(new CondicoesAtuaisDisplay());
        estacao.registrarObserver (new EstatisticasDisplay());
        estacao.registrarObserver (new PrevisoesDisplay());
        estacao.iniciar();
    }   
}
