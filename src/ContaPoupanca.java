public class ContaPoupanca extends Conta {
    private double rendimentoMensal;

    public ContaPoupanca(String numeroConta, String titular, double rendimentoMensal) {
        super(numeroConta, titular);
        this.rendimentoMensal = rendimentoMensal;
    }

    public void aplicarRendimento() {
        saldo += saldo * rendimentoMensal;
        System.out.println("Rendimento aplicado. Novo saldo: R$" + saldo);
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }
}