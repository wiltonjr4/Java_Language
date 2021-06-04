import java.io.IOException;
import java.util.Scanner;

public class DesafioMultiplos {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int numero1 = Math.abs(leitor.nextInt());
        int numero2 = Math.abs(leitor.nextInt());

        if (numero1 > numero2) {
            if (numero1 % numero2 == 0){System.out.println("São Multiplos");} else {System.out.println("Não São Multiplos");}
        } else {
            if (numero2 % numero1 == 0){System.out.println("São Multiplos");} else {System.out.println("Não São Multiplos");}
        }
    }
}
