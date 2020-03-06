package list2.pkg2;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class List22 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira o nome do Aluno: ");
        String numeroAluno = JOptionPane.showInputDialog("Insira o Id do Aluno: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do Aluno: "));
        float p1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da P1: "));
        float p2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da P2: "));
        
        Aluno aluno1 = new Aluno(nome,numeroAluno,idade,p1,p2);
        
        nome = JOptionPane.showInputDialog("Insira o nome do Aluno: ");
        numeroAluno = JOptionPane.showInputDialog("Insira o Id do Aluno: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do Aluno: "));
        p1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da P1: "));
        p2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da P2: "));
        
        Aluno aluno2 = new Aluno();
        aluno2.setnome(nome);
        aluno2.setnumeroAluno(numeroAluno);
        aluno2.setIdade(idade);
        aluno2.setp1(p1);
        aluno2.setp2(p2);
        
        JOptionPane.showMessageDialog(null, aluno1.toString()); 
        JOptionPane.showMessageDialog(null, aluno2.toString()); 
        JOptionPane.showMessageDialog(null, ((aluno1.aprovacao()) ? "Aprovado" : "Reprovado")); 
        JOptionPane.showMessageDialog(null, ((aluno2.aprovacao()) ? "Aprovado" : "Reprovado"));
    }
}
