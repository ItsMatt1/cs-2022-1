public class Preguica extends Animal{

    public Preguica(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom()
    {
        System.out.println("bzzzzzz");
    }

    @Override
    public void correr()
    {
        System.out.println("Eu não corro, eu subo em arvores.");
    }


}
