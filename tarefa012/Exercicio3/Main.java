public class Main {
    public static void main(String[] args) throws LoginInvalido {
        //Testar o login

        Login log = new Login();

        log.setUsuario("Matheus");
        log.setSenha("123");

        try{

        log.fazerLogin("Matheus","123");
        System.out.println("Passou");

        log.fazerLogin("Matheus!!!","123###");
        System.out.println("Nao passou");
        }
        catch (LoginInvalido e)
        {
            System.out.println(e.getMensagem());
        }
    }
}