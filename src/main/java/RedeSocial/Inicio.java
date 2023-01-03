package RedeSocial;

import Dados.*;
import EstruturasDeDados.*;

import java.util.Locale;
import java.util.Scanner;

public class Inicio {

    Amigos iniciar = new Amigos("", "", 0);
    Amigos amigos = new Amigos("weu ", "masculino".toUpperCase(Locale.ROOT), 25);
    Amigos amigos1 = new Amigos("amigo 1", "feminino".toUpperCase(Locale.ROOT), 26);
    Amigos amigos2 = new Amigos("amigo 2", "masculino".toUpperCase(Locale.ROOT), 20);
    Amigos amigos3 = new Amigos("amigo 3", "feminino".toUpperCase(Locale.ROOT), 15);
    Amigos amigos4 = new Amigos("amigo 2", "masculino".toUpperCase(Locale.ROOT), 20);
    Amigos amigos5 = new Amigos("amigo 5", "feminino".toUpperCase(Locale.ROOT), 15);

    Scanner sc = new Scanner(System.in);

    RedeSocial<Amigos> r = new RedeSocial<Amigos>();

    public void iniciar() {
        Lista<Amigos> l = new Lista<Amigos>();
        Lista<Quizz> listaQuizz = new Lista<Quizz>();
        listaQuizz.inserirInicio(new Quizz("",new Amigos("","",0)));
        l.inserirInicio(iniciar);
        System.out.println("digite a quantidade de amigos que deseja convidar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("insira o nome do amigo que queira convidar: ");
            String nome = sc.next();
            System.out.println("insira o sexo do amigo que queira convidar: ");
            String sexo = sc.next().toUpperCase(Locale.ROOT);
            System.out.println("insira a idade do amigo que queira convidar: ");
            Integer idade = sc.nextInt();
            r.convidarAmigo(l, new Amigos(nome, sexo, idade));
        }
        int x;

        do {

            System.out.println(" 1- adicionar mais amigos \n 2- Apagar amigos \n 3- Exibir amigos\n 4- Responder quizz \n 5- Exibir afinidade \n 0-Fechar");
            x = sc.nextInt();
            menu(x, l,listaQuizz);


        } while (x != 0);


    }


    public void menu(int x, Lista<Amigos> lista,Lista<Quizz>listaQuizz) {
        PerguntasQuizz p = new PerguntasQuizz();

        switch (x) {
            case 1:

                System.out.println("insira o nome do amigo que queira adicionar: ");
                String nome = sc.next();
                System.out.println("insira o sexo do amigo que queira adicionar: ");
                String sexo = sc.next().toUpperCase(Locale.ROOT);
                System.out.println("insira a idade do amigo que queira adicionar: ");
                Integer idade = sc.nextInt();
                r.adicionarMaisAmigos(lista, new Amigos(nome, sexo, idade));
                break;
            case 2:
                System.out.println("insira o nome a o sexo e a idade do amigo que queira remover: ");
                r.apagarAmigo(lista, new Amigos(sc.next(), sc.next().toUpperCase(Locale.ROOT), sc.nextInt()));

                break;
            case 3:
                r.exibirAmigos(lista);
                break;
            case 4:
//                System.out.println("insira os dados da pessoa que deseja responder: ");
                System.out.println("insira o nome do amigo que queira adicionar: ");
                String nome1 = sc.next();
                System.out.println("insira o sexo do amigo que queira adicionar: ");
                String sexo1 = sc.next().toUpperCase(Locale.ROOT);
                System.out.println("insira a idade do amigo que queira adicionar: ");
                Integer idade1 = sc.nextInt();
                System.out.println("você gosta de cachorro ou gato?");
                String animal = sc.next().toUpperCase(Locale.ROOT);

                p.perguntas(listaQuizz, new Amigos(nome1,sexo1,idade1),animal,lista);
                break;
            case 5:
                r.exibirAfinidade(listaQuizz);
                break;
            case 0:
                System.out.println("saindo...");
                break;
        }

    }


}
