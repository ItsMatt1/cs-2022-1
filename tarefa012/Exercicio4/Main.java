public class Main {
    public static void main(String[] args) {
        //Testar classe da conta

        ContaBancaria conta = new ContaBancaria();

        try {

            conta.depositar(500.0);
            System.out.println("Depositou 500 reais");

            conta.depositar(150.0);
            System.out.println("Depositou 150 reais");

            conta.sacar(160.0);
            System.out.println("Sacou 160 reais");

            System.out.println("Seu saldo eh de: "+conta.getSaldo());

            conta.sacar(510.0);
        }
        catch (SaldoInsuficienteException e)
        {
            System.out.println(e.getMensagem());
        }
    }
}