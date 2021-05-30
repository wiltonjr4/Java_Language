package br.com.alura.java.io.teste;

import java.io.*;

public class TesteCopiaArquivo {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        InputStream fis = new FileInputStream("lorem.txt"); // System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        //Fluxo de Saida com Arquivo
        OutputStream fos = new FileOutputStream("lorem3.txt"); // System.out;
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null && linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();

        }

        br.close();
        bw.close();

    }

}
