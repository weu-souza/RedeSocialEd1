package RedeSocial;

import Dados.Amigos;
import Dados.Dado;
import EstruturasDeDados.Lista;

import java.util.Locale;

public class Ordenar {
    public void SortAmigos(Lista<Amigos> lista){

        for (Dado<Amigos> i = lista.getInicio(); i.getProximo() !=null ; i = i.getProximo()){
            for (Dado<Amigos> j = i.getProximo(); j != null; j = j.getProximo()){
                if (j.getElemento().getIdade() < i.getElemento().getIdade()) {
                    Amigos aux = i.getElemento();
                    i.setElemento(j.getElemento());
                    j.setElemento(aux);
                }
            }
        }
    }
    public Lista<Amigos> exibirFeminino(Lista<Amigos> lista){
        Lista<Amigos> feminino = new Lista<Amigos>();
        System.out.println("Feminino: \n");
        for (Dado<Amigos> i = lista.getInicio(); i.getProximo() !=null ; i = i.getProximo()){
            if (i.getElemento().getSexo().equals("feminino".toUpperCase(Locale.ROOT))){
                feminino.inserirInicio(i.getElemento());
                SortAmigos(feminino);

            }

        }
       return feminino;

    }
    public Lista<Amigos> exibirMasculino(Lista<Amigos> lista){
        Lista<Amigos> masculino = new Lista<Amigos>();
        System.out.println("Masculino: \n");
        for (Dado<Amigos> i = lista.getInicio(); i.getProximo() !=null ; i = i.getProximo()){
            if (i.getElemento().getSexo().equals("masculino".toUpperCase(Locale.ROOT))) {
                masculino.inserirInicio(i.getElemento());
                SortAmigos(masculino);
            }
        }
        return masculino;
    }





}
