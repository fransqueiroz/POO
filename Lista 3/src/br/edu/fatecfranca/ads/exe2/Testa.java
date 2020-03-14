
package br.edu.fatecfranca.ads.exe2;

import javax.swing.JOptionPane;


public class Testa {

    public static void main(String[] args) {
        Passageiro p1 = new Passageiro();
        p1.setNome("Jose");
        p1.setRg("43.234.234-3");
        Passageiro p2 = new Passageiro();
        p2.setNome("Paulo");
        p2.setRg("43.099.234-x");
        Passageiro p3 = new Passageiro();
        p3.setNome("Fulano");
        p3.setRg("02.194.764-x");
        Passageiro p4 = new Passageiro();
        p4.setNome("Justino");
        p4.setRg("42.777.111.6");
        Passageiro p5 = new Passageiro();
        p5.setNome("Bela");
        p5.setRg("88.555.441-0");
        Passageiro p6 = new Passageiro();
        p6.setNome("Lilica");
        p6.setRg("33.222.111-6");
        
        Onibus b1 = new Onibus();
        b1.setNumero(01);
        b1.setPlaca("ABC-1234");
        Onibus b2 = new Onibus();
        b2.setNumero(02);
        b2.setPlaca("CBA-4321");
        
        b1.addPassageiro(p1);
        b1.addPassageiro(p5);
        b1.addPassageiro(p2);
        
        b2.addPassageiro(p6);
        b2.addPassageiro(p4);
        b2.addPassageiro(p3);
        
        BusStation rodoviaria = new BusStation();
        rodoviaria.setCidade("Franca");
        rodoviaria.setNome("Lotação Máxima");
        
        rodoviaria.addBus(b1);
        rodoviaria.addBus(b2);
        
        JOptionPane.showMessageDialog(null, rodoviaria.toString());
        
        
        
    }
    
}
