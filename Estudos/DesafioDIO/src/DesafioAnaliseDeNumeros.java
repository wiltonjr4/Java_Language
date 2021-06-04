import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioAnaliseDeNumeros {

    public static void main(String[] args) throws IOException {

        List<Integer> lista = new ArrayList();

        for(int i = 0; i < 5; i++) {
            Scanner leitor = new Scanner(System.in);
            lista.add(leitor.nextInt());
        }

        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();
        List<Integer> positivo = new ArrayList<>();
        List<Integer> negativo = new ArrayList<>();

        for (Integer integer : lista) {
            if (integer > 0) {
                positivo.add(integer);
            }
            if (integer < 0) {
                negativo.add(integer);
            }
            if (integer % 2 == 0) {
                par.add(integer);
            }
            if (integer % 2 != 0) {
                impar.add(integer);
            }
        }

        System.out.println(par.size() + " valor(es) par(es)");
        System.out.println(impar.size() + " valor(es) impar(es)");
        System.out.println(positivo.size() + " valor(es) positivo(s)");
        System.out.println(negativo.size() + " valor(es) negativo(s)");
    }
}
