package RedeSocial;

import Lista.Lista;



public class RedeSocial<T> {


    public void convidarAmigo(Lista<T> lista, T valor){
        if (!lista.buscarList(lista,valor)) {
            lista.inserirInicio(valor);
        }
    }

    public void adicionarMaisAmigos(Lista<T> lista,T valor){
        if (!lista.buscarList(lista,valor)){
            lista.inserirMeio(2,valor);
        }

    }
    public void apagarAmigo(Lista<T> lista, T valor){
        if (lista.isEmpty()){
            throw new RuntimeException("não existe amigos");
        }
        else {
            lista.buscarRmv(lista,valor);
            lista.removerMeio(lista.getPosicao());
        }

    }
    public void exibirAmigos(Lista<T> lista){

        System.out.println(lista);
    }

    public void exibirAfinidade(Lista<T> lista){

    }




}
