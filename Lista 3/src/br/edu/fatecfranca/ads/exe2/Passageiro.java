package br.edu.fatecfranca.ads.exe2;

public class Passageiro {
    private String nome;
    private String rg;

    public Passageiro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Passageiro =" + "nome=" + nome + ", rg=" + rg + '\n';
    }
    
    
}
