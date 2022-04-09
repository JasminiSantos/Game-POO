public class Item {
    private String nome;
    private String descricao;

    public Item(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void mostrarDados(){
        System.out.println(
                "Nome: " + this.getNome() +
                "\nDescricao: " + this.getDescricao()
        );
    }

    public void apagarDados(){
        this.setNome(null);
        this.setDescricao(null);
    }

    public void editarDados(String nome, String descricao){
        this.setNome(nome);
        this.setDescricao(descricao);
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
}
