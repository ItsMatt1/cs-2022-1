import java.util.Objects;

public class Login {
    protected String usuario, senha;

    public boolean fazerLogin(String user, String pass) throws LoginInvalido {
        if (Objects.equals(user, getUsuario()) && (Objects.equals(pass,getSenha())))
        {
            return true;
        }
        else
        {
            throw new LoginInvalido();
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
