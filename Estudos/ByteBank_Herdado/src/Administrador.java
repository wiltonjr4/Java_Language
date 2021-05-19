public class Administrador extends Funcionario implements Autenticavel{

    private MetodoAutenticador autenticador;

    public Administrador(){
        this.autenticador = new MetodoAutenticador();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticar(int senha) {
        return this.autenticador.autenticar(senha);
    }

    @Override
    public double getBonificacao(){
        return 50;
    }

}
