public class LoginInvalido extends Exception{
    String mensagem = "Falha ao validar o login.";

    public String getMensagem() {
        return mensagem;
    }
}
