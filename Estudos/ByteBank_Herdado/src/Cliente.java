public class Cliente implements Autenticavel{

    private MetodoAutenticador autenticador;

    public Cliente(){
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
}
