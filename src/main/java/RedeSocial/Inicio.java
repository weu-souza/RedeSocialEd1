package RedeSocial;

import Dados.Amigos;
import Dados.Dados;
import Lista.Lista;

import java.util.Locale;

public class Inicio {
    RedeSocial<Amigos> redeSocial = new RedeSocial<Amigos>();
    Amigos iniciar = new Amigos("","",0);
    Amigos amigos = new Amigos("1","masculino".toUpperCase(Locale.ROOT),25);
    Amigos amigos1 = new Amigos("amigo 2","feminino".toUpperCase(Locale.ROOT),26);
    Amigos amigos2 = new Amigos("amigo 3","masculino".toUpperCase(Locale.ROOT),20);
    Amigos amigos3 = new Amigos("amigo 4","feminino".toUpperCase(Locale.ROOT),15);
    Amigos amigos4 = new Amigos("amigo 5","masculino".toUpperCase(Locale.ROOT),15);
    Amigos amigos5 = new Amigos("amigo 6","feminino".toUpperCase(Locale.ROOT),15);


    Lista<Amigos> lista = new Lista<Amigos>();

    public void iniciar(){

    }

    public void ConvidarAmigos(){
        System.out.println("insira os amigos que quer convidar: ");
        

    }


}
