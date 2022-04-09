import java.util.ArrayList;

public class Chefe extends Monstro{
    private String lore;

    public Chefe(String nome, String descricao, Integer forca, Integer saude, ArrayList<Item> items, String lore) {
        super(nome, descricao, forca, saude, items);
        this.lore = lore;
    }

    public void mostrarDados(){
        System.out.println(
                "Nome: " + this.getNome() +
                "\nDescricao: " + this.getDescricao() +
                "\nForca: " + this.getForca() +
                "\nSaude: " + this.getSaude() +
                "\nLore: " + this.getLore()
        );
    }

    public void apagarDados(){
        super.apagarDados();
        this.setLore(null);
    }

    public void editarDados(String nome, String descricao, Integer forca, Integer saude, String lore){
        super.editarDados(nome, descricao, forca, saude);
        this.setLore(lore);
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }
}
