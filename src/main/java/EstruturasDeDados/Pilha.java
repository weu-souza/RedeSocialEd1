package EstruturasDeDados;

import Dados.Dado;

public class Pilha<T> {


    private Dado<T> topo;
    private Dado<T> base;
    private int tamanho;


    public boolean isEmpty(){
        return true;
    }


    public void push(T n) {

        Dado<T> dado = new Dado<T>();
        dado.setElemento(n);
        dado.setProximo(null);
        dado.setAnterior(this.topo);
        if (topo != null) {
            topo.setProximo(dado);
        }
        topo = dado;
        if (tamanho == 0) {
            base = topo;
        }
        tamanho++;

    }

    public T pop() {
        if (topo == null) {
            return null;
        }
        T remov = topo.getElemento();
        topo = topo.getAnterior();
        if (topo != null) {
            topo.setProximo(null);
        } else {
            base.setElemento(null);
        }
        tamanho--;
        return remov;

    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        Dado<T> local = base;

        while (local != null) {
            str.append(local.getElemento()).append("\n ");
            local = local.getProximo();
        }

        return str.toString();
    }
}
