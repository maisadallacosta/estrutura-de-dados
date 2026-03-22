public class PilhaSimples {
    Integer[] pilha;
    int topo;

    public PilhaSimples(int tamanho){
        this.pilha = new Integer[tamanho];
        this.topo = -1;
        System.out.println("Pilha simples criada com sucesso");
    }

   private boolean estaCheia() {
        if (topo == pilha.length - 1) {
            System.out.println("Pilha cheia!");
            return true;
        }
        return false;
    }

    private boolean estaVazia() {
        return topo == -1;
    }

    public void adicionarElemento(Integer elemento){
        if (!estaCheia()){
            topo++;
            pilha[topo] = elemento; // LIFO, quando novo elemento adicionado, SEMPRE ficara no topo ate que outro seja adicionado
            System.out.println(elemento + " adicionado com sucesso");
        } else {
            System.out.println("Pilha cheia, nenhum elemento poderá ser adicionado");
        }
    }

    public Integer removerElemento(){
        if (!estaVazia()){
            // remocao LIFO, atribuindo mudancao na pilha e mudando valor variavel
            Integer removido = pilha[topo]; 
            pilha[topo] = null; 
            topo--; 
            System.out.println(removido + " removido da pilha");
            return removido;
        } else {
            System.out.println("Pilha vazia, nenhum elemento pode ser removido");
            return null;
        }
    }

    public int adicionarVarios(Integer[] elementos){
        int adicao = 0;

        for (Integer elemento : elementos) {
            if (!estaCheia()) {
                adicionarElemento(elemento);
                adicao++;
            }
        }

        return adicao;
    }

    public void limpar(){ // vai remover posicao por posicao
        for (int i =0; i <= topo; i++){
            pilha[i] = null; 
        }
        topo = -1; // zera a pilha
        System.out.println("Pilha vazia");
    }

     public void exibirElementos(){
        if (estaVazia()){ System.out.println("Pilha vazia, sem elementos para exibir");
        } else {
            for (int i = topo; i >=0; i--){ // exibicao LIFO
                System.out.println(pilha[i]);
            }
        }
    }

    public Integer obterTopo(){
        if (!estaVazia()){
            return pilha[topo];
        } return null;
    }

    public int contar(){
        return topo + 1;
    }

}
