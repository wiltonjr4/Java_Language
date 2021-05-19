public class TesteConta {

    public static void main(String[] args) {
        ContaCorrente contaCorrentePaulo = new ContaCorrente(111, 111);
        contaCorrentePaulo.depositar(100);

        ContaPoupanca contaPoupancaMaria = new ContaPoupanca(222, 222);
        contaPoupancaMaria.depositar(200);

        //System.out.println(contaCorrentePaulo.tranferir(10, contaPoupancaMaria));

        System.out.println(contaCorrentePaulo.getSaldo());
        System.out.println(contaPoupancaMaria.getSaldo());

    }

}
