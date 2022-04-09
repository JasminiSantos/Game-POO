import java.util.ArrayList;

public class Fase {
    private String nome;
    private String descricao;
    private Integer level;
    private Chefe chefe;
    private ArrayList<Monstro> monstros;

    public Fase(String nome, String descricao, Integer level, Chefe chefe, ArrayList<Monstro> monstros) {
        this.nome = nome;
        this.descricao = descricao;
        this.level = level;
        this.chefe = chefe;
        this.monstros = monstros;
    }

    public void mostrarDados(){
        System.out.println(
                "Nome: " + this.getNome() +
                "\nDescricao: " + this.getDescricao() +
                "\nLevel: " + this.getLevel()
        );
    }

    public void apagarDados(){
        this.setNome(null);
        this.setDescricao(null);
        this.setLevel(null);
        this.setChefe(null);
        this.setMonstros(null);
    }

    public void editarDados(String nome, String descricao, Integer level){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setLevel(level);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Chefe getChefe() {
        return chefe;
    }

    public void setChefe(Chefe chefe) {
        this.chefe = chefe;
    }

    public ArrayList<Monstro> getMonstros() {
        return monstros;
    }

    public void setMonstros(ArrayList<Monstro> monstros) {
        this.monstros = monstros;
    }
}
