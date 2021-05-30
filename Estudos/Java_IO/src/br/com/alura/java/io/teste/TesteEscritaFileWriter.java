package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

        //Fluxo de Saida com Arquivo
//      OutputStream fos = new FileOutputStream("lorem2.txt");
//      Writer osw = new OutputStreamWriter(fos);
//      BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
        bw.write("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ");
        bw.newLine();
        bw.write("sahuashuashuashauh aubduabd augb ua auhuh");

        bw.close();

    }

}
