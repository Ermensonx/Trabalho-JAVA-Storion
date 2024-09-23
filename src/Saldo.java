public class Saldo {
    private double saldo;

    public Saldo() {
        this.saldo = 0.0;
    }

    public Saldo(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Saldo adicionado: R$" + valor);
        } else {
            System.out.println("Valor inválido para adicionar saldo.");
        }
    }

    public boolean debitarSaldo(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saldo debitado: R$" + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }
}
