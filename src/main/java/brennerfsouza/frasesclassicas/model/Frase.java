package brennerfsouza.frasesclassicas.model;

public class Frase {
    private Long id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Frase{" +
                "titulo='" + titulo + '\'' +
                ", frase='" + frase + '\'' +
                ", personagem='" + personagem + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}
