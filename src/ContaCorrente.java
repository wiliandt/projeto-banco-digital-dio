public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular, double limiteChequeEspecial) {
        super(numeroConta, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limiteChequeEspecial)) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso (Conta Corrente).");
            return true;
        } else {
            System.out.println("Saque inválido ou saldo + limite insuficientes.");
            return false;
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}
