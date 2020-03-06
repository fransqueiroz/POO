package list2.pkg1;
/**
 *
 * @author fransergio
 */
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class List21 {
    public static void main(String[] args) {
        String numc = JOptionPane.showInputDialog("Insira o numero da conta: ");
        String numa = JOptionPane.showInputDialog("Insira o numero da agência: ");
        String nome = JOptionPane.showInputDialog("Insira o nome do Cliente: ");
        float sal = Float.parseFloat(JOptionPane.showInputDialog("Insira o saldo da conta: "));
        
        Cliente cliente1 = new Cliente(numc, numa, nome, sal);
        cliente1.realizarDeposito(250);
        cliente1.realizarSaque(30);
        
        cliente1.toString();
        
        numc = JOptionPane.showInputDialog("Insira o numero da conta");
        numa = JOptionPane.showInputDialog("Insira o numero da agência");
        nome = JOptionPane.showInputDialog("Insira o nome do cliente");
        sal = Float.parseFloat(JOptionPane.showInputDialog("Insira o saldo da conta"));
        
        Cliente cliente2 = new Cliente();
        cliente2.setNumConta(numc);
        cliente2.setNumAgencia(numa);
        cliente2.setNome(nome);
        cliente2.setSaldo(sal);
        
        cliente2.realizarDeposito(500);
        cliente2.realizarSaque(250);
        
        cliente2.toString();
        
    }
    
}
