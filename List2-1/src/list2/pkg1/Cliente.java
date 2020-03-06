package list2.pkg1;
/**
 *
 * @author fransergio
 */
public class Cliente {
    private String numConta;
    private String numAgencia;
    private String nome;
    private float saldo;
    
    //Metodo Construtores

    public Cliente(String numConta, String numAgencia, String nome, float saldo) {
        setNumConta(numConta);
        setNumAgencia(numAgencia);
        setNome(nome);
        setSaldo(saldo);
    }
    
    public Cliente(){
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    //setters
    public void setNumConta(String numConta){
        if (numConta.length() == 8 && numConta.charAt(6) == '-')
            this.numAgencia = numAgencia;
        else
            System.out.println("Numero da agência deve ter no minimo 8 digitos e de um dígito verificador");
    }
    
    public void setNumAgencia(String numAgencia){
        if(numAgencia.length() == 6 && numAgencia.charAt(4) == '-')
            this.numAgencia = numAgencia;
        else
            System.out.println("Numero da agência deve ter tamanho 6 e precisa de um dígito verificador");
    }
    
    
    public void setNome(String nome){
        if(nome.length() <= 30)
            this.nome = nome;
        else
            System.out.println("Nome deve conter no máximo 30 caracteres");
    }
    
    public void setSaldo(float saldo){
        if(saldo >= 0 )
            this.saldo = saldo;
        else
            System.out.println("Saldo não pode ser negativo");
    }
    //getters
    
    public String getNumConta(){
        return this.numConta;
    }
    
    public String getNumAgencia(){
        return this.numAgencia;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    //methods
    
    public void realizarDeposito(float valor){
        this.saldo += valor;
    }
    
    public void realizarSaque(float valor){
        this.saldo -= valor;
    }
    
    public String toString(){
        return "Numero da conta: " + this.numConta +
               "\n Numero da Agência:" + this.numAgencia +
               "\n Nome: " + this.nome +
               "\n Saldo Atual: " + this.saldo;
    }
}
