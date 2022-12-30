package RedeSocial;

import Dados.Amigos;
import Dados.Dados;
import Lista.Lista;

import java.util.Locale;
import java.util.Scanner;

public class Inicio {
    RedeSocial<Amigos> redeSocial = new RedeSocial<Amigos>();
    Amigos iniciar = new Amigos("","",0);

    Scanner sc = new Scanner(System.in);

RedeSocial<Amigos> r = new RedeSocial<Amigos>();
    public void iniciar(){
        Lista<Amigos> l = new Lista<Amigos>();
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
            r.convidarAmigo(l,  new Amigos(nome,sexo,idade));
        }
        int x;

       do {

           System.out.println(" 1- adicionar mais amigos \n 2- Apagar amigos \n 3- Exibir amigos \n 4- Exibir afinidade \n 0-Fechar");
           x = sc.nextInt();
        menu(x,l);



        }while (x!=0);


    }


    public void menu(int x,Lista<Amigos> lista){

        switch (x){
            case 1:
                System.out.println("insira o nome a o sexo e a idade do amigo que queira adicionar: ");
                System.out.println("insira o nome do amigo que queira adicionar: ");
                String nome = sc.next();
                System.out.println("insira o sexo do amigo que queira adicionar: ");
                String sexo = sc.next().toUpperCase(Locale.ROOT);
                System.out.println("insira a idade do amigo que queira adicionar: ");
                Integer idade = sc.nextInt();
                r.adicionarMaisAmigos(lista,new Amigos(nome,sexo,idade));
                break;
            case 2:
                System.out.println("insira o nome a o sexo e a idade do amigo que queira remover: ");
                r.apagarAmigo(lista,new Amigos(sc.next(),sc.next().toUpperCase(Locale.ROOT),sc.nextInt()));
                break;
            case 3 :
                r.exibirAmigos(lista);
                break;
            case 4:
                r.exibirAfinidade(lista);

                break;
            case 0:
                System.out.println("saindo...");
                break;
        }

    }


}
