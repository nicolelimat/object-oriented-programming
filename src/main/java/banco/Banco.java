package banco;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;

    public Banco(){
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public Cliente getCliente(int indice){
        return clientes.get(indice);
    }

    public ArrayList<Cliente> getCliente(String nome, String sobrenome){
        ArrayList<Cliente> resultados = new ArrayList<>();
        for(int i = 0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            if((cliente.getNome() == nome) && (cliente.getSobrenome() == sobrenome)){
                resultados.add(cliente);
            }
        }
        return resultados;
    }

    public int getNumeroDeClientes(){
        return clientes.size();
    }
}
