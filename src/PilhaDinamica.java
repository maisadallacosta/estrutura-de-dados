package src;
public class PilhaDinamica {
    No topo;

    public PilhaDinamica(){
        this.topo = null;
        System.out.println("Pilha dinâmica criada");
    }

    private boolean estaVazia() {
        return topo == null;
    }

    public void adicionarElemento(Integer elemento){
        No novo = new No(elemento);
        novo.setProx(topo);
        topo = novo;
        System.out.println(elemento + " adicionado a pilha dinâmica");
    }

    public Integer removerElemento(){
        if (!estaVazia()){
            Integer removido = topo.getConteudo();
            topo = topo.getProx(); // se fosse na pilha duplamente encadeada, a implementacao deveria ser feita usando getAnterior()
            System.out.println(removido + " removido da pilha dinâmica");
            return removido;
        } else {
            System.out.println("A pilha esta vazia, nenhum elemento pode ser removido");
            return null;
        }
    }

    public int adicionarVarios(Integer[] elementos){
        int adicao = 0;

        for(int i = 0; i < elementos.length; i++){
            adicionarElemento(elementos[i]); // reutilizando medoto faz o uso de configuracoes quanto ao ultimo valor adicionado tornando-se o topo
            adicao++;
        }

        return adicao;
    }

    public void limpar(){
        topo = null; // zerar o topo ativa metodo da lixeira, funcionando como zerar o primeiro elemento de uma fila!
        System.out.println("Pilha vazia");
    }

    public Integer obterTopo(){
        if (!estaVazia()){
            return topo.getConteudo();
        } else {
            return null;
        }
    }

    public void exibirElementos(){
        if (!estaVazia()){
            No aux = topo;

            while (aux != null){
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        } else {
            System.out.println("Pilha vazia, nenhum elemento a ser exibido");
        }
    }

    public int contar(){
        int tamanho = 0;
        No aux = topo;

        while(aux != null){
            tamanho++;
            aux = aux.getProx();
        }

        return tamanho;
    }
}
