public class Pato implements OldObserver{
    @Override
    public void atualizar(int n) {
        System.out.printf ("Pato: %d\n", n);
    }
}
