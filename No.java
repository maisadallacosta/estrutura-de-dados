public class No {
    Integer conteudo;
    No prox;

    public No(Integer conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public Integer getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }
}