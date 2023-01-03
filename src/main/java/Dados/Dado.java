package Dados;

public class Dado<T>{
    private T elemento;
    private Dado<T> proximo;
    private Dado<T> anterior;




    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Dado<T> getProximo() {
        return proximo;
    }

    public void setProximo(Dado<T> proximo) {
        this.proximo = proximo;
    }

    public Dado<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Dado<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return  "elemento: " + elemento +" "+
                "proximo:" + proximo;
    }
}
