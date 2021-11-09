public class Cachorro implements OldObserver{
    @Override
    public void atualizar(int n) {
        System.out.printf ("Cachorro: %d\n", n);
    }
}
