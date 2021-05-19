public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println("Exception");
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");

        throw new ArithmeticException("Deu Erro!");

        }
        //System.out.println("Fim do metodo2");
}
