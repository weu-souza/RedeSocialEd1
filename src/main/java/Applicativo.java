import Lista.Lista;
import Dados.Amigos;
import RedeSocial.RedeSocial;

import java.util.Locale;

public class Applicativo {
    public static void main(String[] args){
        RedeSocial<Amigos> r = new RedeSocial<Amigos>();

        Amigos iniciar = new Amigos("","",0);
        Amigos amigos = new Amigos("amigo 1","masculino".toUpperCase(Locale.ROOT),25);
        Amigos amigos1 = new Amigos("amigo 2","feminino".toUpperCase(Locale.ROOT),26);
        Amigos amigos2 = new Amigos("amigo 3","masculino".toUpperCase(Locale.ROOT),20);
        Amigos amigos3 = new Amigos("amigo 4","feminino".toUpperCase(Locale.ROOT),15);
        Amigos amigos4 = new Amigos("amigo 5","masculino".toUpperCase(Locale.ROOT),15);
        Amigos amigos5 = new Amigos("amigo 6","feminino".toUpperCase(Locale.ROOT),15);
Lista<Amigos> l = new Lista<Amigos>();
            System.out.println(l);
        l.inserirInicio(iniciar);
        l.inserirInicio(amigos);
        l.inserirInicio(amigos1);
        r.convidarAmigo(l,amigos);
        r.convidarAmigo(l,amigos1);
        r.convidarAmigo(l,amigos2);
        r.adicionarMaisAmigos(l,amigos3);
        System.out.println(l);
        r.exibirAmigos(l);
        r.apagarAmigo(l,amigos1);
        r.exibirAmigos(l);






//        l.removerMeio(l.getPosicao());
//        System.out.println(l);
//        System.out.println("posicao: "+l.getPosicao());




    }
}
