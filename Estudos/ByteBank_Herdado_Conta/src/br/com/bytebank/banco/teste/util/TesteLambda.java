package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambda {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        cc1.depositar(333.0);
        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.depositar(444.0);
        Conta cc3 = new ContaCorrente(22, 11);
        cc3.depositar(111.0);
        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.depositar(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        //LAMBDA
        lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) );

        lista.forEach ( (conta) -> System.out.println(conta) );

    }

}
