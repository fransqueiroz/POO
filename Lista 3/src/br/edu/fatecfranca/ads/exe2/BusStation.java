package br.edu.fatecfranca.ads.exe2;

import java.util.ArrayList;

public class BusStation {
    private String nome;
    private String cidade;
    private ArrayList<Onibus> bus;

    public BusStation() {
        bus = new ArrayList();
    }

    public BusStation(String nome, String cidade, ArrayList<Onibus> bus) {
        this.nome = nome;
        this.cidade = cidade;
        this.bus = bus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getBus() {
        return bus;
    }

    public void setBus(ArrayList<Onibus> bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "BusStation =" + "nome=" + nome + ""
                + "\n cidade=" + cidade + ""
                + "\n" + bus ;
    }
    
   
    public void addBus(Onibus onibus){
        this.bus.add(onibus);
    }  
    
    public boolean removeBus(Onibus onibus){
        return this.bus.remove(onibus);
    }
    
    public int getBus(Onibus onibus){
        return this.bus.indexOf(onibus);
    }
    
    public boolean updateBus(Onibus atual, Onibus novo){
        int posicao = this.getBus(atual);
        if(posicao != -1){
            this.bus.set(posicao, novo);
            return true;
        }
        else return false;
    }
}
