public class testaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.depositar(50);
        System.out.println("Saldo atual do Paulo é de: R$" + contaDoPaulo.saldo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.depositar(1000);
        System.out.println("Saldo atual da Marcela é de: R$" + contaDaMarcela.saldo);

        String mensagemSacar = contaDoPaulo.sacar(100);
        System.out.println(mensagemSacar
        + "\nNovo saldo é: R$" + contaDoPaulo.saldo);

        String mensagemTranferir = contaDaMarcela.tranferir(300, contaDoPaulo);
        System.out.println(mensagemTranferir);

        System.out.println("Novo Saldo da Marcela é de: R$" + contaDaMarcela.saldo
        + "\nNovo Saldo do Paulo é de: R$" + contaDoPaulo.saldo);
    }
}
