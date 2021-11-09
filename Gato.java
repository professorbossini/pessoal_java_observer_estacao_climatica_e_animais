public class Gato implements OldObserver{
    @Override
    public void atualizar(int n) {
        System.out.printf ("Gato: %d\n", n);
    }
}
