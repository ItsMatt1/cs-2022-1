public class Cavalo extends Animal{

    public Cavalo(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom()
    {
        System.out.println("rihnn rih hirihn");
    }

    @Override
    public void correr()
    {
        System.out.println("Correndo!");
    }
}
