package RedeSocial;
import Dados.*;
import Dados.Quizz;
import EstruturasDeDados.Lista;
import EstruturasDeDados.Pilha;


import java.util.Locale;



public class PerguntasQuizz {
    private double afinidadeCachorro;
    private double afinidadeGato;



    public Lista<Quizz> perguntas(Lista<Quizz> listaQuizz, Amigos amigos, String resposta, Lista<Amigos> listaA) {



        if (listaA.buscarList(listaA,amigos.toString())){
            listaQuizz.inserirInicio(new Quizz(resposta.toUpperCase(Locale.ROOT), amigos));
        }
        else {
            throw new RuntimeException("não existe esse amigo na lista");
        }



        return listaQuizz;

    }
    public double retornarAfinidade(Lista<Quizz> lista){
        int afinidade = 0;
        for (Dado<Quizz> i = lista.getInicio(); i.getProximo() != null; i = i.getProximo()){
            afinidade++;
        }
        return afinidade;
    }


    public Pilha<Afinidade> retornarCachorro(Lista<Quizz> lista){
        Pilha<Afinidade> cachorro = new Pilha<Afinidade>();
        System.out.println("cachorro:");
        for (Dado<Quizz> i = lista.getInicio(); i.getProximo() != null; i = i.getProximo()) {
            if (i.getElemento().getRespostas().equals("cachorro".toUpperCase(Locale.ROOT))) {
                cachorro.push(new Afinidade(i.getElemento().getAmigo().getNome(),i.getElemento().getRespostas()));
                afinidadeCachorro++;
            }
        }
        double afinidade = afinidadeCachorro/retornarAfinidade(lista)*100;
        System.out.println("afinidade = "+afinidade+"%");
        return cachorro;
    }

    public Pilha<Afinidade> retornarGato(Lista<Quizz> lista){
        System.out.println("gato:");
        Pilha<Afinidade> gato = new Pilha<Afinidade>();
        for (Dado<Quizz> i = lista.getInicio(); i.getProximo() != null; i = i.getProximo()) {
            if (i.getElemento().getRespostas().equals("gato".toUpperCase(Locale.ROOT))) {
                gato.push(new Afinidade(i.getElemento().getAmigo().getNome(),i.getElemento().getRespostas()));
                afinidadeGato++;
            }
        }
        double afinidade = afinidadeGato/retornarAfinidade(lista)*100;

        System.out.println("afinidade = "+afinidade+"%");
        return gato;
    }


}
