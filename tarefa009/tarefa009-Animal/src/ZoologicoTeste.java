public class ZoologicoTeste {

    public static void main(String[] args) {

        Animal[] jaulas = new Animal[10];

        Animal c = new Cachorro("dog 1");
        jaulas[0]= c;
        Animal c1 = new Cachorro("dog 2");
        jaulas[1]= c1;
        Animal c2 = new Cachorro("dog 3");
        jaulas[2]= c2;
        Animal c3 = new Cachorro("dog 4");
        jaulas[3]= c3;

        Animal cav = new Cavalo("Cav 1");
        jaulas[4] = cav;
        Animal cav1 = new Cavalo("Cav 2");
        jaulas[5] = cav1;
        Animal cav2 = new Cavalo("Cav 3");
        jaulas[6] = cav2;

        Animal p = new Preguica("Preg 1");
        jaulas[7] = p;
        Animal p1 = new Preguica("Preg 2");
        jaulas[8] = p1;
        Animal p2 = new Preguica("Preg 3");
        jaulas[9] = p2;

        for (int i=0;i<10;i++){
            jaulas[i].emitirSom();
        }

    }
}
