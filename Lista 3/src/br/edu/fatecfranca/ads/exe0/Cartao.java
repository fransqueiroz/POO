package br.edu.fatecfranca.ads.exe0;

public class Cartao {
    private int cvv;
    private String validade,bandeira,nro;
    private String senha;
    private Conta conta; //associação
    

    public Cartao(){
        
    }
    public String getNro() {
        return nro;
    }

    public int getCvv() {
        return cvv;
    }

    public String getValidade() {
        return validade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public Conta getConta() {
        return conta;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    
    
    public boolean sacar(float x, String senha){
        if( this.senha.equals(senha) && this.conta.getSaldo() > x){
            this.conta.setSaldo(this.conta.getSaldo() - x);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cartao{" + "nro= " + nro + ""
                + "\n cvv= " + cvv + 
                "\n validade= " + validade + 
                "\n bandeira= " + bandeira + 
                "\n " + conta.toString() + '}';
    }
    
    
    
}
