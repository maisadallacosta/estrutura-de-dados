public class MainDinamica {
        public static void main(String[] args) {

        PilhaDinamica pilha = new PilhaDinamica();

        pilha.adicionarElemento(42);
        pilha.adicionarElemento(57);
        pilha.adicionarElemento(29);

        organizarTerminal();

        System.out.println("Elementos pilha dinãmica: ");
        pilha.exibirElementos();

        organizarTerminal();

        System.out.println("Topo da pilha dinâmica: " + pilha.obterTopo());

        organizarTerminal();

        pilha.removerElemento();

        System.out.println("\nElementos da pilha pós remoção: ");
        pilha.exibirElementos(); // exibicao pós remocao
        
        System.out.println("\nQuantidade de elementos: " + pilha.contar());
        System.out.println("Topo da pilha dinâmica: " + pilha.obterTopo());

        organizarTerminal();

        Integer[] valores = {4, 89, 43};
        pilha.adicionarVarios(valores);

        organizarTerminal();

        System.out.println("Após adicionar vários:");
        pilha.exibirElementos();

        System.out.println("\nQuantidade de elementos: " + pilha.contar());
        System.out.println("Topo da pilha dinâmica: " + pilha.obterTopo());

        organizarTerminal();

        pilha.limpar();
    }

    public static void organizarTerminal(){
        System.out.println("-------------------------------");
    }
}
