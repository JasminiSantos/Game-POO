import java.util.ArrayList;
import java.util.Objects;

public class Classe {
    private String nome;
    private String descricao;
    private Integer forca;
    private Integer defesa;
    private Integer saudeInicial;
    private ArrayList<Item> items;

    public Classe(String nome, String descricao, Integer forca, Integer defesa, Integer saudeInicial, ArrayList<Item> items) {
        this.nome = nome;
        this.descricao = descricao;
        this.forca = forca;
        this.defesa = defesa;
        this.saudeInicial = saudeInicial;
        this.items = items;
    }

    public void mostrarDados(){
        System.out.println(
                "Nome: " + this.getNome() +
                "\nDescricao: " + this.getDescricao() +
                "\nForca: " + this.getForca() +
                "\nDefesa: " + this.getDefesa() +
                "\nSaude Inicial: " + this.getSaudeInicial()
        );
    }

    public void apagarDados(){
        this.setNome(null);
        this.setDescricao(null);
        this.setForca(null);
        this.setDefesa(null);
        this.setSaudeInicial(null);
        this.setItems(null);
    }

    public void editarDados(String nome, String descricao, Integer forca, Integer defesa, Integer saudeInicial){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setForca(forca);
        this.setDefesa(defesa);
        this.setSaudeInicial(saudeInicial);
    }

    public void addItem(Item novoItem){
        // Verificando se já não possui esse item
        for (Item item : this.getItems()) {
            if (Objects.equals(item.getNome(), novoItem.getNome())){
                System.out.println("Item já cadastrado. Não é possivel ter mais de um item do mesmo tipo!");
                return;
            }
        }
        // Adicionando caso não exista
        ArrayList<Item> itemsCadastrados = new ArrayList<>(this.getItems());
        itemsCadastrados.add(novoItem);
        this.setItems(itemsCadastrados);
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

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getSaudeInicial() {
        return saudeInicial;
    }

    public void setSaudeInicial(Integer saudeInicial) {
        this.saudeInicial = saudeInicial;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
