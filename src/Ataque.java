public class Ataque extends Item{
    private Integer danoDeAtaque;

    public Ataque(String nome, String descricao, Integer danoDeAtaque) {
        super(nome, descricao);
        this.danoDeAtaque = danoDeAtaque;
    }

    public void mostrarDados(){
        System.out.println(
                "Nome: " + this.getNome() +
                "\nDescricao: " + this.getDescricao() +
                "\nDano de Ataque: " + this.getDanoDeAtaque()
        );
    }

    public void apagarDados(){
        super.apagarDados();
        this.setDanoDeAtaque(null);
    }

    public void editarDados(String nome, String descricao, Integer danoDeAtaque){
        super.editarDados(nome, descricao);
        this.setDanoDeAtaque(danoDeAtaque);
    }

    public Integer getDanoDeAtaque() {
        return danoDeAtaque;
    }

    public void setDanoDeAtaque(Integer danoDeAtaque) {
        this.danoDeAtaque = danoDeAtaque;
    }
}
