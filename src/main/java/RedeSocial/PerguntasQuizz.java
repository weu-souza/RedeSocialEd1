package RedeSocial;
import Dados.*;
import Dados.Quizz;
import Lista.Lista;




import java.util.Locale;

import java.util.Scanner;

public class PerguntasQuizz {


    Scanner sc = new Scanner(System.in);

    public void perguntas(Lista<Quizz> listaQuizz, Amigos amigos, String resposta, String resposta1) {

        for (int i = 1; i < 3; i++) {
            switch (i) {
                case 1:
//                    System.out.println("você gosta de cachorro ou gato?");
                    listaQuizz.inserirInicio(new Quizz(i, resposta.toUpperCase(Locale.ROOT), amigos));
//                    listaQuizz.inserirInicio( new Quizz(i, sc.next().toUpperCase(Locale.ROOT),amigos));

                    break;

                case 2:
//                    System.out.println("você gosta de playstation ou xbox?");
                    listaQuizz.inserirInicio(new Quizz(i, resposta1.toUpperCase(Locale.ROOT), amigos));
//                    listaQuizz.inserirInicio( new Quizz(i, sc.next().toUpperCase(Locale.ROOT),amigos));

                    break;

            }
        }


        perguntaAfinidade(listaQuizz);


    }

    public void perguntaAfinidade(Lista<Quizz> lista) {
        Lista<Afinidade> cachorro = new Lista<Afinidade>();
        Lista<Afinidade> gato = new Lista<Afinidade>();
        Lista<Afinidade> playstation = new Lista<Afinidade>();
        Lista<Afinidade> xbox = new Lista<Afinidade>();
        for (Dados<Quizz> i = lista.getInicio(); i.getProximo() != null; i = i.getProximo()) {
            if (i.getElemento().getIdPergunta() == 1) {
                if (i.getElemento().getRespostas().equals("cachorro".toUpperCase(Locale.ROOT))) {
                    cachorro.inserirInicio(new Afinidade(i.getElemento().getAmigo().getNome(),i.getElemento().getRespostas()));

                }
                if (i.getElemento().getRespostas().equals("gato".toUpperCase(Locale.ROOT))) {
                    gato.inserirInicio(new Afinidade(i.getElemento().getAmigo().getNome(),i.getElemento().getRespostas()));

                }
            }
            if (i.getElemento().getIdPergunta() == 2) {
                if (i.getElemento().getRespostas().equals("playstation".toUpperCase(Locale.ROOT))) {

                    playstation.inserirInicio(new Afinidade(i.getElemento().getAmigo().getNome(),i.getElemento().getRespostas()));

                }
                if (i.getElemento().getRespostas().equals("xbox".toUpperCase(Locale.ROOT))) {

                    xbox.inserirInicio(new Afinidade(i.getElemento().getAmigo().getNome(),i.getElemento().getRespostas()));

                }

            }
        }
        System.out.println(cachorro);
        System.out.println(gato);
        System.out.println(playstation);
        System.out.println(xbox);



    }

}
