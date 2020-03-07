package br.edu.fatecfranca.ads.exe1;

public class Passageiro {
    private String nome,cpf;
    
    public Passageiro(){
        this.nome = nome;
        this.cpf = cpf;
    }

    public Passageiro(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    
    
    //setters -- getters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passageiro: " + nome 
                + "\n cpf: " + cpf;
    }
    
    
    
    
}
