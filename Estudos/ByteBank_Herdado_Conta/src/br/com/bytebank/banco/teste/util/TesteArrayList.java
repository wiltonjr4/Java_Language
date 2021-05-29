package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        //<> --> Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);


        System.out.println(lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        for(Conta conta : lista){
            System.out.println(conta);
        }


    }

}
