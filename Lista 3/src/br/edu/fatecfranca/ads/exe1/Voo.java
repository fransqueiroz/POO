package br.edu.fatecfranca.ads.exe1;

public class Voo {
    private String numero,destino;
    
    public Voo(){
        this.numero = numero;
        this.destino = destino;
    }

    public Voo(String numero, String destino) {
        setNumero(numero);
        setDestino(destino);
    }
    
    
    //setters -- getters

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Voo numero :" + numero 
                + "\n Destino: " + destino;
    }

    
    
    
}
