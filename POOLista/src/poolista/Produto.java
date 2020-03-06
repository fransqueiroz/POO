package poolista;
public class Produto {
    int id;
    String descricao;
    int quantidade;
    float preco;

    public Produto(int id, String descricao, int quantidade, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public int comprar(int x) {
        this.quantidade =  this.quantidade + x;
        return this.quantidade;
    }
    public int vender(int x) {
        this.quantidade = this.quantidade - x;
        return this.quantidade;
    }
    public float subir(float x) {
        this.preco = this.preco + x;
        return this.preco;
    }
    public float descer(float x) {
        this.preco = this.preco - x;
        return this.preco;
    }
    
    public void mostrar(){
        System.out.println("id: " + this.id);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço: " + this.preco);
    }
}
