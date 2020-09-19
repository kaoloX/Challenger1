import br.com.fiap.b2w.model.Usuario;

public class LoginUsuario {

    private String loginUsu;
    private String senhaUsu;

    Usuario usuario = new Usuario ();

    public void loginUsuario () {
    }

    public String getSenhaUsu() {return senhaUsu;}

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public String getLoginUsu() {
        return loginUsu;
    }

    public void setLoginUsu(String loginUsu) {
        this.loginUsu = loginUsu;
    }
}


