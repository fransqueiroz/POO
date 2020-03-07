package br.edu.fatecfranca.ads.exe1;

import java.util.Date;

public class Reserva {
    private int codigo;
    private Date data;
    private Passageiro passageiro;
    private Voo voo;
    
    public Reserva(){
       this.codigo = codigo;
        this.data = data; 
    } 

    public Reserva(int codigo, Date data) {
        setCodigo(codigo);
        setData(data);
    }
    
    
    //setters -- getters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    

    @Override
    public String toString() {
        return "Reserva: " + codigo + 
                "\n data=" + data 
                + "\n" + passageiro.toString()
                + "\n" + voo.toString();
    }
    
    
    
    
}
