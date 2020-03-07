package br.edu.fatecfranca.ads.exe1;

import java.util.Date;
import javax.swing.JOptionPane;

public class TestaPassageiro {

    public static void main(String[] args) {
        
        Passageiro passageiro = new Passageiro();
        passageiro.setCpf("310.528.878-43");
        passageiro.setNome("Fransérgio");
        
        Voo voo = new Voo();
        voo.setDestino("Bahia");
        voo.setNumero("3265");
        
        Reserva reserva = new Reserva();
        reserva.setCodigo(1234);
        reserva.setData(new Date());
        
        Passageiro passageiro2 = new Passageiro("410.563.656-53","Pamela Cristina");
        Voo voo2 = new Voo("Espirito Santo", "7452");
        Reserva reserva2 = new Reserva(4321,new Date());
        
        reserva.setVoo(voo);
        reserva.setPassageiro(passageiro);
        reserva2.setVoo(voo2);
        reserva2.setPassageiro(passageiro2);
        
        JOptionPane.showMessageDialog(null, reserva.toString());
        JOptionPane.showMessageDialog(null, reserva2.toString());
        
        
    }
    
}
