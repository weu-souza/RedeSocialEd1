package Lista;

import Dados.Dados;
import Dados.Amigos;

import java.util.Objects;

public class Lista<T> {


    private Dados<T> inicio;
    private Dados<T> fim;
    private int tamanho;

    public Dados<T> getInicio() {
        return inicio;
    }

    public void setInicio(Dados<T> inicio) {
        this.inicio = inicio;
    }

    public Dados<T> getFim() {
        return fim;
    }

    public void setFim(Dados<T> fim) {
        this.fim = fim;
    }

    public boolean isEmpty() {
        return inicio == null && fim == null;
    }

    public void inserirInicio(T valor) {
        Dados<T> dado = new Dados<T>();
        dado.setElemento(valor);
        dado.setAnterior(null);
        dado.setProximo(this.inicio);
        if (inicio != null) {
            inicio.setAnterior(dado);
        }
        inicio = dado;
        if (tamanho == 0) {
            fim = inicio;
        }
        tamanho++;
    }


    public T removerInicio() {
        if (inicio == null) {
            return null;
        }
        T remov = inicio.getElemento();
        inicio = inicio.getProximo();
        if (inicio != null) {
            inicio.setAnterior(null);
        } else {
            fim.setElemento(null);
        }
        tamanho--;
        return remov;
    }

    public void inserirFinal(T valor) {
        Dados<T> dado = new Dados<T>();
        dado.setElemento(valor);
        dado.setProximo(null);
        dado.setAnterior(this.fim);
        if (fim != null) {
            fim.setProximo(dado);
        }
        fim = dado;
        if (tamanho == 0) {
            inicio = fim;
        }
        tamanho++;
    }

    public T removerFinal() {
        if (fim == null) {
            return null;
        }
        T remov = fim.getElemento();
        fim = fim.getAnterior();
        if (fim != null) {
            fim.setProximo(null);
        } else {
            inicio.setElemento(null);
        }
        tamanho--;
        return remov;
    }

    public void inserirMeio(int indice, T valor) {
        if (indice <= 0) {
            inserirInicio(valor);
        } else if (indice >= tamanho) {
            inserirFinal(valor);
        } else {
            Dados<T> local = inicio;
            for (int i = 0; i < indice - 1; i++) {
                local = local.getProximo();
            }
            Dados<T> dado = new Dados<T>();
            dado.setElemento(valor);
            dado.setAnterior(local);
            dado.setProximo(local.getProximo());
            local.setProximo(dado);
            dado.getProximo().setAnterior(dado);
            tamanho++;

        }
    }

    public T removerMeio(int indice) {
        if (indice < 0 || indice >= tamanho || inicio == null) {
            return null;
        } else if (indice == 0) {

            return removerInicio();
        } else if (indice == tamanho - 1) {

            return removerFinal();
        }

        Dados<T> local = inicio;
        for (int i = 0; i < indice; i++) {
            local = local.getProximo();
        }
        if (local.getAnterior() != null) {
            local.getAnterior().setProximo(local.getProximo());
        }
        if (local.getProximo() != null) {
            local.getProximo().setAnterior(local.getAnterior());
        }
        tamanho--;
        return local.getElemento();
    }


    public int buscarRmv(Lista<T> lista,String valor) {
        Dados<T> aux = lista.inicio;
        int posicao =0;

        while (!Objects.equals(aux.getElemento().toString(), valor)) {
            aux = aux.getProximo();
            posicao++;
        }


        return posicao;
    }

    public boolean buscarList(Lista<T> lista, String valor) {
        for (Dados<T> aux = lista.inicio; aux.getProximo() != null; aux = aux.getProximo()) {
            if (aux.getElemento().toString().equals(valor)) {
                return true;
            }
        }
        return false;
    }





    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        Dados<T> local = inicio;

        while (local != null) {
            str.append(local.getElemento()).append("\n ");
            local = local.getProximo();
        }

        return str.toString();
    }
}
