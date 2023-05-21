package banco;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String sobrenome;
    private ArrayList<Conta> contas;
    private ContaPoupanca contaPoupanca;
    private ContaCorrente contaCorrente;

    public Cliente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        contas = new ArrayList<>();
        contaPoupanca = null;
        contaCorrente = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Conta getConta(Integer id) {
        return contas.get(id);
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public int getNumeroDeContas(){
        return contas.size();
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
