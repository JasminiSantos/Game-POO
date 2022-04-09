public class Defesa extends Item{
    private Integer escudo;

    public Defesa(String nome, String descricao, Integer escudo) {
        super(nome, descricao);
        this.escudo = escudo;
    }

    public void mostrarDados(){
        System.out.println(
                "Nome: " + this.getNome() +
                "\nDescricao: " + this.getDescricao() +
                "\nDano de Ataque: " + this.getEscudo()
        );
    }

    public void apagarDados(){
        super.apagarDados();
        this.setEscudo(null);
    }

    public void editarDados(String nome, String descricao, Integer escudo){
        super.editarDados(nome, descricao);
        this.setEscudo(escudo);
    }

    public Integer getEscudo() {
        return escudo;
    }

    public void setEscudo(Integer escudo) {
        this.escudo = escudo;
    }
}
