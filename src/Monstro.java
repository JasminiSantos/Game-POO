import java.util.ArrayList;

public class Monstro {
    private String nome;
    private String descricao;
    private Integer forca;
    private Integer saude;
    private ArrayList<Item> items;

    public Monstro(String nome, String descricao, Integer forca, Integer saude, ArrayList<Item> items) {
        this.nome = nome;
        this.descricao = descricao;
        this.forca = forca;
        this.saude = saude;
        this.items = items;
    }

    public void mostrarDados(){
        System.out.println(
                "Nome: " + this.getNome() +
                "\nDescricao: " + this.getDescricao() +
                "\nForca: " + this.getForca() +
                "\nSaude: " + this.getSaude()
        );
    }

    public void apagarDados(){
        this.setNome(null);
        this.setDescricao(null);
        this.setForca(null);
        this.setSaude(null);
        this.setItems(null);
    }

    public void editarDados(String nome, String descricao, Integer forca, Integer saude){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setForca(forca);
        this.setSaude(saude);
    }

    public void tirarVida(int danoRecebido){
        this.setSaude( this.getSaude() - danoRecebido);
    }

    public void listarItems(){
        int i = 0;
        for (Item item : this.getItems()) {
            System.out.println(
                    "[" + i + "] " +
                            "\nNome: " + item.getNome() +
                            "\nDescricao: " + item.getDescricao()
            );
            i++;
        }
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

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getSaude() {
        return saude;
    }

    public void setSaude(Integer saude) {
        this.saude = saude;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
