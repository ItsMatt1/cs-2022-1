public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom()
    {
        System.out.println("au au");
    }

    @Override
    public void correr()
    {
        System.out.println("Correndo!");
    }

}
