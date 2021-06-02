import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DesafioNumerosPares {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numero = Integer.parseInt(st.nextToken());
        if (numero == 0){
            System.out.println("Numero não pode ser igual a 0");
        } else {
            System.out.println("--------------------");
            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) System.out.println(i);
            }
        }


    }
}
