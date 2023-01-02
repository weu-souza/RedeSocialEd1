package Dados;

public class Afinidade {
private Amigos amigos;
private int afinidadeporcentagem;

private String quizz;

    public Afinidade(Amigos amigos, String quizz) {
        setAmigos(amigos);

        setQuizz(quizz);
    }

    public String getQuizz() {
        return quizz;
    }

    public void setQuizz(String quizz) {
        this.quizz = quizz;
    }

    public Amigos getAmigos() {
        return amigos;
    }

    public void setAmigos(Amigos amigos) {
        this.amigos = amigos;
    }





    @Override
    public String toString() {
        return "amigos: " + amigos +"resposta: "+quizz ;
    }
}
