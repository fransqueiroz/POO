import java.util.ArrayList;
public class Curso {
    private int id;
    private String nome;
    private ArrayList<Disciplina> disciplinas;
  
    public Curso() {
        //iniciando ArrayList
        disciplinas = new ArrayList();
    }

    public Curso(int id, String nome, ArrayList<Disciplina> disciplina) {
        this.id = id;
        this.nome = nome;
        this.disciplinas = disciplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + 
                "\n nome=" + nome + 
                "\n disciplina=" + disciplinas + '}';
    }

   
    //CRUD
    public void addDisciplina(Disciplina disciplina){
       this.disciplinas.add(disciplina);        
    }       
    
    public boolean deleteDisciplina(Disciplina disciplina){
        return this.disciplinas.remove(disciplina);
    }
    public int getDisciplina(Disciplina disciplina){
        return this.disciplinas.indexOf(disciplina);
    }
    public boolean updateDisciplina(Disciplina atual, Disciplina nova){
        int posicao = this.getDisciplina(atual);
        if(posicao != -1){
            this.disciplinas.set(posicao, nova);
            return true;
        }
        else return false;
    }
}
