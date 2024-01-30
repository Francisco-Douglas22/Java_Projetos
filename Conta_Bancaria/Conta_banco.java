// Classe abstrata Conta
public abstract class Conta_banco{
    private String numeroConta;
    private double saldo;

    // Construtor
    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    // Métodos de acesso
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos para depositar e sacar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    // Método abstrato para calcular juros
    public abstract void calcularJuros();
}

// Classe ContaCorrente que herda de Conta
public class ContaCorrente extends Conta {
    private static final double TAXA_JUROS = 0.02; // 2% de juros

    // Construtor
    public ContaCorrente(String numeroConta) {
        super(numeroConta);
    }

    // Implementação do método calcularJuros
    @Override
    public void calcularJuros() {
        double saldo = getSaldo();
        depositar(saldo * TAXA_JUROS);
    }
}

// Classe ContaPoupanca que herda de Conta
public class ContaPoupanca extends Conta {
    private static final double TAXA_JUROS = 0.05; // 5% de juros

    // Construtor
    public ContaPoupanca(String numeroConta) {
        super(numeroConta);
    }

    // Implementação do método calcularJuros
    @Override
    public void calcularJuros() {
        double saldo = getSaldo();
        depositar(saldo * TAXA_JUROS);
    }
}

