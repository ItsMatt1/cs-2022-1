public class SaldoInsuficienteException extends Exception {
    String mensagem = "Voce nao possui o saldo suficiente para realizar essa operacao.";

    public String getMensagem() {
        return mensagem;
    }
}
