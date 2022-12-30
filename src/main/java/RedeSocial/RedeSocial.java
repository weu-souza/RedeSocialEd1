package RedeSocial;

import Dados.Amigos;
import Lista.Lista;




public class RedeSocial<T> {


    public void convidarAmigo(Lista<Amigos> lista, Amigos valor){
        if (!lista.buscarList(lista,valor.toString())) {
            lista.inserirInicio(valor);
        }
    }

    public void adicionarMaisAmigos(Lista<Amigos> lista,Amigos valor){
        convidarAmigo(lista,valor);
    }
    public void apagarAmigo(Lista<Amigos> lista, Amigos valor){
        if (lista.buscarList(lista,valor.toString())){
            lista.removerMeio(lista.buscarRmv(lista,valor.toString()));
        }
        else {
            throw new RuntimeException("não existe amigos com estas caracteristicas");
        }

    }

    public void exibirAmigos(Lista<Amigos> lista){
        Ordenar ordenar = new Ordenar();

        if (!lista.isEmpty()){

         System.out.println(ordenar.exibirFeminino(lista));
         System.out.println(ordenar.exibirMasculino(lista));
        }
        else {
            throw new RuntimeException("Lista de amigos vazia");
        }
    }



    public void exibirAfinidade(Lista<T> lista){

    }





}
