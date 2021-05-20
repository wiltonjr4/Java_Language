package br.com.bytebank.banco.modelo;

//br.com.bytebank.banco.modelo.CalcularImposto --> FQN
public class CalcularImposto{

    private double totalImposto;

    public  void registra(Tributavel tributavel){

        double valor = tributavel.getValorImposto();
        this.totalImposto += valor;

    }

    public double getTotalImposto() {
        return totalImposto;
    }

}
