package banco;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
//    private int numeroDeClientes;

    public Banco(){
//        this.clientes = new Cliente[5];
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
//        clientes[numeroDeClientes] = cliente;
//        numeroDeClientes ++;
        clientes.add(cliente);
    }

    public Cliente getCliente(int indice){
        return clientes.get(indice);
    }

    public int getNumeroDeClientes(){
//        return numeroDeClientes;
        return clientes.size();
    }
}
