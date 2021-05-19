public class TesteSacar {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(132, 444);

        conta.depositar(200);

        try {
            conta.sacar(210);
        } catch(Exception exception){
            System.out.println("Erro: " + exception.getMessage());
        }
        //System.out.println(conta.getSaldo());
    }
}
