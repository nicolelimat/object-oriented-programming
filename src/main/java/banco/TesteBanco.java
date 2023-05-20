package banco;

import java.util.Locale;

public class TesteBanco {

    public static void main (String[] args){

        Conta c1 = new Conta(1000);
        c1.sacar(250);
        c1.depositar(320.5);
        c1.sacar(120);
        System.out.println("O saldo da conta é de R$ " + c1.getSaldo());

    }
}
