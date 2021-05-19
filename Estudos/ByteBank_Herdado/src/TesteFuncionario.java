public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario junior = new Gerente();
        junior.setSalario(2590.80);

        System.out.println(junior.getNome());
        System.out.println(junior.getBonificacao());

    }
}
