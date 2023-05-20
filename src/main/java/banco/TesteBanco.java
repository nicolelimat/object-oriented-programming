package banco;

import java.util.Locale;

public class TesteBanco {

    public static void main (String[] args){

        Cliente brunoHenrique = new Cliente("Bruno","Henrique");
        Conta contaBH = new Conta(50000);
        brunoHenrique.setConta(contaBH);

        Cliente evertonRibeiro = new Cliente("Everton", "Ribeiro");
        Conta contaER = new Conta(45000);
        evertonRibeiro.setConta(contaER);

        Cliente filipeLuis = new Cliente("Filipe", "Luis");
        Conta contaFL = new Conta(70000);
        filipeLuis.setConta(contaFL);

        Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa");
        Conta contaGB = new Conta(220000);
        gabrielBarbosa.setConta(contaGB);

        Cliente diegoAlves = new Cliente("Diego", "Alves");
        Conta contaDA = new Conta(50000);
        diegoAlves.setConta(contaDA);

//        Cliente diegoAlves2 = new Cliente("Diego", "Alves 2");
//        Conta contaDA2 = new Conta(50000);
//        diegoAlves.setConta(contaDA2);

        System.out.println();

        Banco banco = new Banco();
        banco.adicionarCliente(brunoHenrique);
        banco.adicionarCliente(evertonRibeiro);
        banco.adicionarCliente(filipeLuis);
        banco.adicionarCliente(gabrielBarbosa);
        banco.adicionarCliente(diegoAlves);
//        banco.adicionarCliente(diegoAlves2);


//        Printando o array clientes pelo seu índice
        for(int i = 0; i < banco.getNumeroDeClientes(); i++){
            System.out.println("Cliente [" + i + "] : " + banco.getCliente(i).getNome() +
                    " " + banco.getCliente(i).getSobrenome() + "." +
                    " Saldo R$: " + banco.getCliente(i).getConta().getSaldo());
        }

    }
}
