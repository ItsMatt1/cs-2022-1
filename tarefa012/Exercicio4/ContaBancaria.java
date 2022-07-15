public class ContaBancaria {
    protected double saldo;

    public void depositar(Double valor)
    {
        this.saldo += valor;
    }

    public void sacar(Double valor) throws SaldoInsuficienteException {
        if (valor < saldo)
            this.saldo -= valor;
        else 
            throw new SaldoInsuficienteException();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
