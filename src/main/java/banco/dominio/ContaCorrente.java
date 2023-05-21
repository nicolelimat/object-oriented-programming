package banco.dominio;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(double saldoInicial){
        this(saldoInicial, 0);
    }

    public ContaCorrente(double saldoInicial, double chequeEspecial){
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor){
        if((chequeEspecial+saldo) >= valor){
            saldo-= valor;
            return true;
        } else {
            return false;
        }
    }
}
