package Dados;

public class Dados<T>{
    private T elemento;
    private Dados<T> proximo;
    private Dados<T> anterior;




    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Dados<T> getProximo() {
        return proximo;
    }

    public void setProximo(Dados<T> proximo) {
        this.proximo = proximo;
    }

    public Dados<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Dados<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return  "elemento: " + elemento +" "+
                "proximo:" + proximo;
    }
}
