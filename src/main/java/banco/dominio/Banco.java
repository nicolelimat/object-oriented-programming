package banco.dominio;

import java.util.ArrayList;

public class Banco {
    private static Banco banco = new Banco();
    ;
    private ArrayList<Cliente> clientes;

    private Banco(){
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

    public static Banco getBanco(){
        return banco;
    }
}
