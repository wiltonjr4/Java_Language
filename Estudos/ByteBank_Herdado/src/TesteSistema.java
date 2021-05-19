public class TesteSistema {

    public static void main(String[] args) {
        Gerente gerentePaulo = new Gerente();
        gerentePaulo.setSenha(2222);

        Cliente clienteZe = new Cliente();
        clienteZe.setSenha(2222);

        Administrador administrador = new Administrador();
        administrador.setSenha(3333);

        SistemaInterno sistema = new SistemaInterno();
        sistema.autentica(gerentePaulo);
        sistema.autentica(administrador);
        sistema.autentica(clienteZe);

    }

}
