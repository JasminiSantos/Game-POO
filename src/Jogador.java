public class Jogador {
    private String nome;
    private String idade;
    private Integer saude;
    private Integer level;
    private Integer moeda;
    private Classe personagem;

    public Jogador(String nome, String idade, Classe personagem) {
        this.nome = nome;
        this.idade = idade;
        this.saude = personagem.getSaudeInicial();
        this.level = 1;
        this.moeda = 0;
        this.personagem = personagem;
    }

    public void mostrarDados(){
        System.out.println(
                "Nome: " + this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nSaúde: " + this.getSaude() +
                "\nLevel: " + this.getLevel() +
                "\nMoeda: " + this.getMoeda() +
                "\nPersonagem: " + this.getPersonagem().getNome()
        );
    }

    public void apagarDados(){
        this.setNome(null);
        this.setIdade(null);
        this.setSaude(null);
        this.setLevel(null);
        this.setMoeda(null);
        this.setPersonagem(null);
    }

    public void editarDados(String nome, String idade, Integer saude, Integer level, Integer moeda){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSaude(saude);
        this.setLevel(level);
        this.setMoeda(moeda);
    }

    public void tirarVida(int danoRecebido){
        this.setSaude(this.getSaude() - danoRecebido);

        if (this.getSaude() <= 0){
            System.out.println("Infelizmente com esse dano sofrido, o seu personagem morreu!");
            System.out.println("Game Over");
            System.exit(0);
        }

        System.out.println("Cuidado! Sua vida atual é de: " + getSaude());
    }

    public void subirDeLevel(){
        System.out.println("Parabéns! Você subiu de level");
        this.setLevel(this.getLevel() + 1);
        System.out.println("Novo level:" + this.getLevel());
    }

    public void recuperarSaude(){
        System.out.println("Recuperando vida...");
        this.setSaude(this.getPersonagem().getSaudeInicial());
        System.out.println("Vida atual:" + this.getSaude());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Integer getSaude() {
        return saude;
    }

    public void setSaude(Integer saude) {
        this.saude = saude;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMoeda() {
        return moeda;
    }

    public void setMoeda(Integer moeda) {
        this.moeda = moeda;
    }

    public Classe getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Classe personagem) {
        this.personagem = personagem;
    }
}
