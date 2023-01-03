package Dados;

public class Quizz {

    private String respostas;
    private Amigos amigo;

    public Quizz(String respostas,Amigos amigo) {

        setRespostas(respostas);
        setAmigo(amigo);
    }

    public Amigos getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigos amigo) {
        this.amigo = amigo;
    }



    public String getRespostas() {
        return respostas;
    }

    public void setRespostas(String respostas) {
        this.respostas = respostas;
    }

    @Override
    public String toString() {
        return " respostas =" + respostas+", Amigo = "+amigo.getNome();
    }
}
