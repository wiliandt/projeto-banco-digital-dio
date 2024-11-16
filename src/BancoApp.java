public class BancoApp {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("001", "João Silva", 500.0);
        ContaPoupanca cp = new ContaPoupanca("002", "Maria Oliveira", 0.01);

        cc.depositar(1000.0);
        cp.depositar(2000.0);

        System.out.println(cc);
        System.out.println(cp);

        cc.sacar(200.0);
        cp.sacar(2500.0);

        cc.transferir(cp, 300.0);

        cp.aplicarRendimento();

        System.out.println(cc);
        System.out.println(cp);
    }
}
