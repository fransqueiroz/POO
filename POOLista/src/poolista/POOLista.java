package poolista;
/**
 *
 * @author Fransérgio da Silva Queiroz
 */
public class POOLista {
    public static void main(String[] args) {
        Produto produto1 = new Produto(01,"Descrição do Produto 1",10, 14.5f);
        Produto produto2 = new Produto(02,"Descrição do Produto 2",65, 64.5f);
        produto1.mostrar();
        produto2.mostrar();
        produto1.comprar(5);
        produto2.vender(10);
        produto1.subir(2.5f);
        produto2.descer(54.5f);
        produto1.mostrar();
        produto2.mostrar();
    }
    
}
