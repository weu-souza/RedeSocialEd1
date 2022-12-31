package RedeSocial;
import Dados.Quizz;
import Lista.Lista;
import Dados.Amigos;

import java.util.Random;
import java.util.Scanner;

public class PerguntasQuizz {

Random random = new Random();
Scanner sc = new Scanner(System.in);
    public void perguntas(Amigos amigo,Lista<Integer> lista){
        Lista<Quizz> listaQuizz = new Lista<Quizz>();
        lista.inserirFinal(-1);

        for (int i = 0; i < 4; i++) {
            adicionarNum(lista);
//            int x = lista.removerInicio();
            System.out.println(lista);
        }






//            switch (x){
//                case 0:System.out.println("você gosta de cachorro ou gato?");
//                    listaQuizz.inserirInicio(new Quizz(x+1,sc.next(),amigo));
//                    System.out.println(listaQuizz);
//                    break;
//                case 1:
//                    System.out.println("você e catolico ou evangelico?");
//                    listaQuizz.inserirInicio(new Quizz(x+1,sc.next(),amigo));
//                    System.out.println(listaQuizz);
//                    break;
//                case 2:
//                    System.out.println("você gosta de futebol ou basquete?");
//                    listaQuizz.inserirInicio(new Quizz(x+1,sc.next(),amigo));
//                    System.out.println(listaQuizz);
//                    break;
//                case 3:
//                    System.out.println("você gosta de playstation ou xbox?");
//                    listaQuizz.inserirInicio(new Quizz(x+1,sc.next(),amigo));
//                    System.out.println(listaQuizz);
//                    break;
//
//        }



    }

    public void adicionarNum(Lista<Integer> lista){
        int x = random.nextInt(4);
        if (!lista.buscarList(lista, String.valueOf(x))){
            lista.inserirInicio(x);

        }

    }
}
