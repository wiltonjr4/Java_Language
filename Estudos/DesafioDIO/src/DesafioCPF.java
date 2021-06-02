import java.util.Locale;
import java.util.Scanner;

public class DesafioCPF {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        String[] cpf = new String[4];
        cpf = sc.nextLine().replace(".", "-").split("-");

        for (String s : cpf) {
            System.out.printf("%s\n", s);
        }

        sc.close();
    }
}
