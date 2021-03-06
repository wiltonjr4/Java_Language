public class Gerente extends Funcionario implements Autenticavel {

    private MetodoAutenticador autenticador;

    public Gerente(){
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

    public double getBonificacao() {
        return super.getSalario();
    }

}
