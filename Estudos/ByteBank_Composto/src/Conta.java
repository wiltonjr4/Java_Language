public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public String sacar(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            return "Você Sacou: R$" + valor;
        } else {
            return "Você Não Conseguiu Sacar!";
        }
    }

    public String tranferir(double valor, Conta destino) {
        if (this.saldo >= valor){
            this.sacar(valor);
            destino.depositar(valor);
            return "Valor Tranferido com SUCESSO!";
        }
        return "ERRO! Transferência Não Realizada";
    }

    public double getSaldo(){
        return this.saldo;
    }

}

