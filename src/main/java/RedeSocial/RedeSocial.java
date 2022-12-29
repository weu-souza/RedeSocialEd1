package RedeSocial;

import Dados.Amigos;
import Dados.Dados;
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

    public void exibirAmigos(Lista<Amigos> lista){
        if (!lista.isEmpty()){
//            remove o valor que foi inserido pra inciar a lista
            lista.removerFinal();
//            faz o sort
            Sort(lista);
//            printa a lista

            System.out.println(lista);

        }


    }

    public void exibirAfinidade(Lista<T> lista){

    }
    public void Sort(Lista<Amigos> lista){

            for ( Dados<Amigos> i = lista.getInicio(); i.getProximo() !=null ; i = i.getProximo()){
                for (Dados<Amigos> j = i.getProximo(); j != null; j = j.getProximo()){
                    if (j.getElemento().getIdade() < i.getElemento().getIdade()) {
                        Amigos aux = i.getElemento();
                        i.setElemento(j.getElemento());
                        j.setElemento(aux);
                        }
                }
            }
    }




}
