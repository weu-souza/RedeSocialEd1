package Dados;

public class Quizz {
    private Integer idPergunta;
    private String respostas;
    private Amigos amigo;

    public Quizz(Integer idPergunta, String respostas,Amigos amigo) {
        setIdPergunta(idPergunta);
        setRespostas(respostas);
        setAmigo(amigo);
    }

    public Amigos getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigos amigo) {
        this.amigo = amigo;
    }

    public Integer getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(Integer idPergunta) {
        this.idPergunta = idPergunta;
    }

    public String getRespostas() {
        return respostas;
    }

    public void setRespostas(String respostas) {
        this.respostas = respostas;
    }

    @Override
    public String toString() {
        return "idPergunta =" + idPergunta +
                ", respostas =" + respostas+", Amigo = "+amigo.getNome();
    }
}
