import Dados.Quizz;
import Lista.Lista;
import Dados.Amigos;
import RedeSocial.RedeSocial;
import RedeSocial.Ordenar;
import RedeSocial.Inicio;
import RedeSocial.PerguntasQuizz;

import java.util.Locale;
import java.util.Random;


public class Applicativo {
    public static void main(String[] args){
        RedeSocial<Amigos> r = new RedeSocial<Amigos>();
        Lista<Quizz> listaNum = new Lista<Quizz>();

        Amigos iniciar = new Amigos("","",0);
     Amigos amigos = new Amigos("amigo ","masculino".toUpperCase(Locale.ROOT),25);
        Amigos amigos1 = new Amigos("amigo 1","feminino".toUpperCase(Locale.ROOT),26);
        Amigos amigos2 = new Amigos("amigo 2","masculino".toUpperCase(Locale.ROOT),20);
        Amigos amigos3 = new Amigos("amigo 3","feminino".toUpperCase(Locale.ROOT),15);
        Amigos amigos4 = new Amigos("amigo 2","masculino".toUpperCase(Locale.ROOT),20);
        Amigos amigos5 = new Amigos("amigo 5","feminino".toUpperCase(Locale.ROOT),15);
Lista<Amigos> l = new Lista<Amigos>();

//            System.out.println(l);
//        l.inserirInicio(iniciar);
//        l.inserirInicio(amigos);
//        l.inserirInicio(amigos1);
//        r.convidarAmigo(l,amigos);
//        r.convidarAmigo(l,amigos1);
//        r.convidarAmigo(l,amigos2);
//        r.adicionarMaisAmigos(l,amigos2);
//        System.out.println(l);
//        System.out.println(l);

        PerguntasQuizz p = new PerguntasQuizz();
        Lista<Quizz> listaQuizz = new Lista<Quizz>();
        p.perguntas(listaQuizz,amigos2,"cachorro","xbox");
        p.perguntas(listaQuizz,amigos,"gato","playstation");
        p.perguntas(listaQuizz,amigos3,"cachorro","xbox");
        p.perguntas(listaQuizz,amigos1,"gato","playstation");




//        Inicio i = new Inicio();
//        i.iniciar();


//        r.exibirAmigos(l);













    }
}
