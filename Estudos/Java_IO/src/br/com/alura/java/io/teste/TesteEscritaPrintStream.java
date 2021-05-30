package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStream {

    public static void main(String[] args) throws IOException {

        //Fluxo de Saida com Arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        PrintStream ps = new PrintStream("lorem5.txt", "UTF-8");

        ps.println("It is a long established fact that a reader will be distracted by the readable content of");
        ps.println("sahuashuashuashauh aubduabd augb ua auhuh");

        ps.close();

    }

}
