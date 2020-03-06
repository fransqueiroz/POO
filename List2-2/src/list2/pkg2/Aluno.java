package list2.pkg2;

public class Aluno {
    private String nome;
    private int numeroAluno;
    private int idade;
    private float p1;
    private float p2;
    
    //constructors

    public Aluno(String nome, String numeroAluno, int idade, float p1, float p2) {
        setnome(nome);
        setnumeroAluno(numeroAluno);
        setIdade(idade);
        setp1(p1);
        setp2(p2);
    }
    
    public Aluno(){
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    //setters
    public void setnome(String nome){
        if(nome.length() <= 30)
            this.nome = nome;    
        else
            System.out.println("O nome não deve ultrapassar 30 caracteres");        
    }
    public void setnumeroAluno(String numeroAluno){
        if(numeroAluno.length() == 6)
            this.numeroAluno = Integer.parseInt(numeroAluno);
        else
            System.out.println("O ID do Aluno está Incorreto");
    }
    public void setIdade(int idade){
        if(idade > 0)
            this.idade = idade;
        else
            System.out.println("A Idade não pode ser negativa");
    }
    public void setp1(float p1){
        if(p1 > 0)
            this.p1 = p1;
        else
            System.out.println("A Nota não pode ser negativa");
    }
    public void setp2(float p2){
        if(p2 > 0 )
            this.p2 = p2;
        else
            System.out.println("A Nota não pode ser negativa");
    }
    
    //getters
    public String getNome(){
        return this.nome;
    }
    public int getnumeroAluno(){
        return this.numeroAluno;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getp1(){
        return this.p1;
    }
    public float getp2(){
        return this.p2;
    }
    
    public float notaFinal() {
        return ((p1 + p2) / 2);
    }
    
    public boolean aprovacao() {
        if (this.notaFinal() >= 6) {
            return true;
        } 
        else {
            return false;
        }
    }
    
    public String toString(){
        return "Nome do Aluno:" + this.nome +
               "\n Numero de Identificação:" + this.numeroAluno +
               "\n Idade: " + this.idade;
    }
    
}