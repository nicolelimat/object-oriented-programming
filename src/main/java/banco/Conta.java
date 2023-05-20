package banco;

public class Conta {
    private double saldo;

    public Conta (double saldoInicial){
        saldo = saldoInicial;
        System.out.println("Criando uma conta com o saldo de R$ "+ saldoInicial);
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        System.out.println("Depositando R$ " + valor);
        saldo += valor;
    }

    public void sacar(double valor){
        System.out.println("Sacando R$ " + valor);
        saldo -= valor;
    }
}
