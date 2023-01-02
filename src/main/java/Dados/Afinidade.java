package Dados;

public class Afinidade {
private String amigos;
private int afinidadeporcentagem;

private String quizz;

    public Afinidade(String amigos, String quizz) {
        setAmigos(amigos);

        setQuizz(quizz);
    }

    public String getQuizz() {
        return quizz;
    }

    public void setQuizz(String quizz) {
        this.quizz = quizz;
    }

    public String getAmigos() {
        return amigos;
    }

    public void setAmigos(String amigos) {
        this.amigos = amigos;
    }





    @Override
    public String toString() {
        return "amigos: " + amigos +"resposta: "+quizz ;
    }
}
