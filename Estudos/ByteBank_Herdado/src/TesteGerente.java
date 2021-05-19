public class TesteGerente {

    public static void main(String[] args) {
        Gerente gerentePaulo = new Gerente();
        gerentePaulo.setNome("Paulo");
        gerentePaulo.setCpf("222-222-222-22");
        gerentePaulo.setSalario(5000.0);

        System.out.println(gerentePaulo.getNome());
        System.out.println(gerentePaulo.getCpf());
        System.out.println(gerentePaulo.getSalario());

        System.out.println(gerentePaulo.autenticar(2222));

        System.out.println(gerentePaulo.getBonificacao());
    }

}
