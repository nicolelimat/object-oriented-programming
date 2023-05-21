//package banco;
//
//import java.util.Locale;
//
//public class TesteBanco {
//
//    public static void main (String[] args){
//
//        System.out.println("=============== CRIAÇÃO DE CONTAS BANCÁRIAS ================");
//        Cliente brunoHenrique = new Cliente("Bruno","Henrique");
//        Conta contaBH = new ContaPoupanca(50000,3);
//        brunoHenrique.setConta(contaBH);
//        System.out.println("Criando uma conta poupança para o cliente " + brunoHenrique.getNome() + " " + brunoHenrique.getSobrenome() +
//                "com o saldo de R$ " + contaBH.getSaldo() + " " +
//                " e taxa de rendimento de 3%.");
//
//        Cliente evertonRibeiro = new Cliente("Everton", "Ribeiro");
//        Conta contaER = new ContaCorrente(45000,30000);
//        evertonRibeiro.setConta(contaER);
//        System.out.println("Criando uma conta corrente para o cliente " + evertonRibeiro.getNome() + " " + evertonRibeiro.getSobrenome() +
//                "com o saldo de R$ " + contaER.getSaldo() + " " +
//                " e cheque especial de R$ 30.000,00.");
//
//        Cliente filipeLuis = new Cliente("Filipe", "Luis");
//        Conta contaFL = new ContaCorrente(70000);
//        filipeLuis.setConta(contaFL);
//        System.out.println("Criando uma conta corrente para o cliente " + filipeLuis.getNome() + " " + filipeLuis.getSobrenome() +
//                "com o saldo de R$ " + contaFL.getSaldo() + " " +
//                " e cheque especial de R$ 70.000,00.");
//
//        Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa");
//        Conta contaGB = new ContaPoupanca(220000,3);
//        gabrielBarbosa.setConta(contaGB);
//        System.out.println("Criando uma conta poupança para o cliente " + gabrielBarbosa.getNome() + " " + gabrielBarbosa.getSobrenome() +
//                "com o saldo de R$ " + contaGB.getSaldo() + " " +
//                " e taxa de rendimento de 3%.");
//
//        Cliente diegoAlves = new Cliente("Diego", "Alves");
//        Conta contaDA = new ContaCorrente(50000);
//        diegoAlves.setConta(contaDA);
//        System.out.println("Criando uma conta corrente para o cliente " + diegoAlves.getNome() + " " + diegoAlves.getSobrenome() +
//                "com o saldo de R$ " + contaDA.getSaldo() + " " +
//                " e cheque especial de R$ 50.000,00.");
//
//        Cliente lorenaLara = new Cliente("Lorena", "Lara");
//        Conta contaLL = contaDA;
//        lorenaLara.setConta(contaLL);
//        System.out.println(diegoAlves.getNome() + " " + diegoAlves.getSobrenome() +
//                " autourizou o cadastro de sua conta corrente como sendo conjunta com a cliente"
//                + lorenaLara.getNome() + " " + lorenaLara.getSobrenome() + ".");
//
//        System.out.println();
//
//        Banco banco = new Banco();
//        banco.adicionarCliente(brunoHenrique);
//        banco.adicionarCliente(evertonRibeiro);
//        banco.adicionarCliente(filipeLuis);
//        banco.adicionarCliente(gabrielBarbosa);
//        banco.adicionarCliente(diegoAlves);
//
//        System.out.println("=============== RELATÓRIO DE TRANSAÇÕES ================");
//        System.out.println("Recuperando o cliente Bruno Henrique");
//        System.out.println("Sacando R$ 1.200,00: " + brunoHenrique.getConta().sacar(1200));
//        System.out.println("Depositando R$ 8.525,00: " + brunoHenrique.getConta().depositar(8525));
//        System.out.println("Sacando R$ 12.800,00: " + brunoHenrique.getConta().sacar(12800));
//        System.out.println("Sacando R$ 50.000,00: " + brunoHenrique.getConta().sacar(50000));
//        System.out.println("Cliente [" + brunoHenrique.getNome() + ", " + brunoHenrique.getSobrenome() + "] " +
//                "tem o saldo de R$ " + brunoHenrique.getConta().getSaldo());
//
//        System.out.println();
//
//        System.out.println("Recuperando o Everton Ribeiro");
//        System.out.println("Saque de R$ 12500.00: " + evertonRibeiro.getConta().sacar(12500));
//        System.out.println("Saque de R$ 18500.00: " + evertonRibeiro.getConta().sacar(18500));
//        System.out.println("Deposito de R$ 3500.00: " + evertonRibeiro.getConta().depositar(3500));
//        System.out.println("Saque de R$ 17000.00: " + evertonRibeiro.getConta().sacar(17000));
//        System.out.println("Saque de R$ 25000.00: " + evertonRibeiro.getConta().sacar(25000));
//        System.out.println("Cliente [" + evertonRibeiro.getNome() + ", " + evertonRibeiro.getSobrenome() + "] " +
//                "tem o saldo de R$ " + evertonRibeiro.getConta().getSaldo());
//
//        System.out.println();
//
//        System.out.println("Recuperando o cliente Diego Alves");
//        System.out.println("Saque de R$ 28000.00: " + diegoAlves.getConta().sacar(28000));
//        System.out.println("Deposito de R$ 3000.00: " + diegoAlves.getConta().depositar(3000));
//        System.out.println("Saque de R$ 17000.00: " + diegoAlves.getConta().sacar(17000));
//        System.out.println("Cliente [" + diegoAlves.getNome() + ", " + diegoAlves.getSobrenome() + "] " +
//                "tem o saldo de R$ " + diegoAlves.getConta().getSaldo());
//
//        System.out.println();
//
//        System.out.println("Recuperando a cliente Lorena Lara");
//        System.out.println("Saque de R$ 32000.00: " + lorenaLara.getConta().sacar(32000));
//        System.out.println("Deposito de R$ 13000.00: " + lorenaLara.getConta().depositar(13000));
//        System.out.println("Saque de R$ 16600.00: " + lorenaLara.getConta().sacar(16600));
//        System.out.println("Cliente [" + lorenaLara.getNome() + ", " + lorenaLara.getSobrenome() + "] " +
//                "tem o saldo de R$ " + lorenaLara.getConta().getSaldo());
//
//        System.out.println();
//
////        Printando o array clientes pelo seu índice
//        for(int i = 0; i < banco.getNumeroDeClientes(); i++){
//            System.out.println("Cliente [" + i + "] : " + banco.getCliente(i).getNome() +
//                    " " + banco.getCliente(i).getSobrenome() + "." +
//                    " Saldo R$: " + banco.getCliente(i).getConta().getSaldo());
//        }
//    }
//}
