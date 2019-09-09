public class MetodosEstatico {

    public static void MetodoEstatico (){
        System.out.println("Hey look me, i am a static");
    }
    public void MetodoNaoEstatico (){
        System.out.println("Hey look me, i am NOT a static");
    }
    public static void main(String[] args) {
        /* 
        Os métodos estáticos são métodos que não dependem de um objeto. 
        Tais métodos são chamados sem que haja uma instância da classe que declara o método.
        Como o método estático não possui ligação com um objeto, 
        então o método não pode usar variáveis de instância, que são variáveis de um objeto.
        Executar um método sem precisar instanciar uma classe.
        */
        MetodosEstatico m = new MetodosEstatico();
        m.MetodoNaoEstatico();
        MetodoEstatico();
    }
}