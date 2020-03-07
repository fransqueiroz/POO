package br.edu.fatecfranca.ads.exe0;
public class Conta {
    private String nro, agencia, nome;
    private float saldo;

    public Conta(){
        
    }   
    
    public String getNro() {
        return nro;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    

    @Override
    public String toString() {
        return "Conta{" + "nro=" + nro + 
                "\n, agencia=" + agencia + 
                "\n, nome=" + nome + 
                "\n, saldo=" + saldo + '}';
    }
    
    
}
