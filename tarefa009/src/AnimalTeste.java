public class AnimalTeste {

    public static void main(String[] args) {

        Animal dog = new Cachorro("Crystal");
        dog.emitirSom();
        dog.correr();

        Animal horse = new Cavalo("Cavalo Branco de Napoleão");
        horse.emitirSom();
        horse.correr();

        Animal sloth = new Preguica("Cap");
        sloth.emitirSom();
        sloth.correr();

    }

}
