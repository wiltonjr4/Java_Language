import java.util.Scanner;

public class DesafioCalculoDeViajem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] lista = new String[2];
        lista = scan.nextLine().split(" ");

        int tempoTotal = Integer.parseInt(lista[0]);
        int distanciaTotal = Integer.parseInt(lista[1]);

        System.out.printf("%.3f\n", ( tempoTotal  * distanciaTotal  )/12.0);

    }

}
