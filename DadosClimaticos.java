public class DadosClimaticos {

    private CondicoesAtuaisDisplay condicoesAtuaisDisplay;
    private EstatisticasDisplay estatisticasDisplay;
    private PrevisoesDisplay previsoesDisplay;

    public double getTemperatura(){
        return 0;
    }

    public double getUmidade(){
        return 0;
    }

    public double getPressao(){
        return 0;
    }

    public void dadosAlterados(){
        condicoesAtuaisDisplay.atualizar();
        estatisticasDisplay.atualizar();
        previsoesDisplay.atualizar();
    }
}