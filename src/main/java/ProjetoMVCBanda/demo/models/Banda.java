package ProjetoMVCBanda.demo.models;

public class Banda {

    private String nome;
    private String pais;
    private String genero;
    private int showsAno;

    public Banda(String nome, String pais, String genero, int showsAno) {
        this.nome = nome;
        this.pais = pais;
        this.genero = genero;
        this.showsAno = showsAno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getShowsAno() {
        return showsAno;
    }

    public void setShowsAno(int showsAno) {
        this.showsAno = showsAno;
    }
}
