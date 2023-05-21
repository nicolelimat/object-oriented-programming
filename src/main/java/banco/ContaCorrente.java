package banco;

public class ContaCorrente extends Conta {
    private ContaPoupanca protecaoContaPoupanca;
//    private double chequeEspecial;

    public ContaCorrente(double saldoInicial){
        this(saldoInicial, null);
    }

//    public ContaCorrente(double saldoInicial, double chequeEspecial){
//        super(saldoInicial);
//        this.chequeEspecial = chequeEspecial;
//    }

    public ContaCorrente(double saldoInicial, ContaPoupanca protecao){
        super(saldoInicial);
        protecaoContaPoupanca = protecao;
    }

    public ContaPoupanca getContaPoupanca(){
        return protecaoContaPoupanca;
    }

    public void setContaPoupanca (ContaPoupanca contaPoupanca){
        protecaoContaPoupanca = contaPoupanca;
    }

//    public boolean sacar(double valor){
//        if((chequeEspecial+saldo) >= valor){
//            saldo-= valor;
//            return true;
//        } else {
//            return false;
//        }
//    }
    @Override
    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo-= valor;
            return true;
        } else if (protecaoContaPoupanca != null){
            ContaPoupanca protecao = protecaoContaPoupanca;
            double total =  protecao.getSaldo() + saldo;
            if (total >= valor){
                valor -= saldo;
                saldo = 0;
                protecao.sacar(valor);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
