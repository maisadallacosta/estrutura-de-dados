package src;
public class MainSimples {
    public static void main(String[] args) {

        PilhaSimples pilha = new PilhaSimples(5);

        pilha.adicionarElemento(97);
        pilha.adicionarElemento(95);
        pilha.adicionarElemento(13);

        organizarTerminal();

        System.out.println("Elementos pilha simples: ");
        pilha.exibirElementos();
        System.out.println("\nQuantidade de elementos: " + pilha.contar());

        organizarTerminal();

        System.out.println("Topo da pilha: " + pilha.obterTopo());

        organizarTerminal();
        pilha.removerElemento(); // remocao

        organizarTerminal();
        System.out.println("Elementos pós remoção: ");
        pilha.exibirElementos(); // print pós remocao
        System.out.println("\nQuantidade de elementos: " + pilha.contar());
        System.out.println("Topo da pilha: " + pilha.obterTopo());

        organizarTerminal();

        Integer[] valores = {10, 20, 30};
        pilha.adicionarVarios(valores);

        organizarTerminal();

        System.out.println("Após adicionar vários:");
        pilha.exibirElementos();

        System.out.println("\nQuantidade de elementos: " + pilha.contar());
        System.out.println("Topo da pilha: " + pilha.obterTopo());

        organizarTerminal();

        pilha.limpar();

    }

    public static void organizarTerminal(){
        System.out.println("-------------------------------");
    }
}
