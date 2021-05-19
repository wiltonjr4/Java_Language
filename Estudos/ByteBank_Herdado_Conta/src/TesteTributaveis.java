public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.depositar(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalcularImposto calculo = new CalcularImposto();
        calculo.registra(cc);
        calculo.registra(seguro);

        System.out.println(calculo.getTotalImposto());

    }

}
