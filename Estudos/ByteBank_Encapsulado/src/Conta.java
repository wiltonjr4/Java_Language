public class Conta {
    private static int total;
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero){
        Conta.total++;

        this.agencia = agencia;
        this.numero = numero;
    }

    public static int getTotal() {return Conta.total;}

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

    public int getNumero(){ return this.numero;}

    public void setNumero(int numero) {this.numero = numero;}

    public int getAgencia() {return this.agencia;}

    public void setAgencia(int agencia) {this.agencia = agencia;}

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }


}

