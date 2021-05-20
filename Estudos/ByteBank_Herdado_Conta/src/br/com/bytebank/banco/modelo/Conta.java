package br.com.bytebank.banco.modelo;
public abstract class Conta {

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

    public void sacar(double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Tentativa de Sacar: " + valor + ", Saldo Atual: " + this.saldo);
        }

        this.saldo -= valor;
    }

    public void tranferir(double valor, Conta destino) throws SaldoInsuficienteException{
        this.sacar(valor);
        destino.depositar(valor);
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

