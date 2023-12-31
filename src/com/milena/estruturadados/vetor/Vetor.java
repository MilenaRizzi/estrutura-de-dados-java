package com.milena.estruturadados.vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho = 0;

    // cria um vetor com a capacidade que eu determinar na hora de instanciar
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    /*
     * public void adiciona(String elemento) {
     * for(int i = 0; i < this.elementos.length; i++) {
     * if(this.elementos[i] == null) {
     * this.elementos[i] = elemento;
     * break; //para o código para na primeira posição nula que ele encontrar
     * }
     * }
     * }
     */

    /*
     * public void adiciona(String elemento) throws Exception {
     * if (this.tamanho < this.elementos.length) {
     * this.elementos[this.tamanho] = elemento;
     * this.tamanho++;
     * } else {
     * throw new
     * Exception("Vetor já está cheio, não é possível adicionar mais elementos",
     * null);
     * }
     * }
     */

    // utilizando boolean para retornar true ou false caso o elemento não exista.
    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // adiciona elementos numa posicação já ocupada
    public boolean adiciona(int posicao, String elemento) {
        this.aumentaCapacidade();
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        // move todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    // método private pois será chamado apenas internamente
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[posicao];
    }

    // método busca sobrecarregado(OVERLOAD) para buscar pelo elemento em si - posso
    // retornar boolean ou um int com a posição
    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder("[");

        // utilizou-se tamanho - 1, para iterar só até o penúltimo elemento
        for (int i = 0; i < tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }

        // o if se encarrega de pegar o último elemento. É bom para que o Vetor seja
        // fechado direitinho sem sobra de vírgula no final
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

}
