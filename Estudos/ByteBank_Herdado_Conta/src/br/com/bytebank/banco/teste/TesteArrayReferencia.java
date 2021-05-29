package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencia {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente(222, 555);

        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(333,666);
        contas[1] = cc2;

        System.out.println(contas[0].getNumero() + "\n" + contas[1].getNumero());

    }

}
